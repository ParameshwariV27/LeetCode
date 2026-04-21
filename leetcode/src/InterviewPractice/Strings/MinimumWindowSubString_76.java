package InterviewPractice.Strings;

public class MinimumWindowSubString_76 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "aebdecbcba";
		String t = "abcc";
		int[] mapS = new int[256];
		int[] mapT = new int[256];
		int right=0, left = 0, minLen = Integer.MAX_VALUE, minStart=0;
		
		for(char ch:t.toCharArray()) mapT[ch]++;
		
		for(;right<s.length();right++)
		{
			mapS[s.charAt(right)]++;
			
			while(contains(mapS, mapT))
			{
				if(right-left+1<minLen)
				{
					minLen = right-left+1;
					minStart = left;
				}
				mapS[s.charAt(left++)]--;
			}
		}
		System.out.println(minLen==Integer.MAX_VALUE?"":s.substring(minStart, minStart+minLen));

	}

	private static boolean contains(int[] mapS, int[] mapT) {
		// TODO Auto-generated method stub
		for(int i=0;i<256;i++)
		{
			if(mapT[i]>mapS[i])
			{
				return false;
			}
		}
		return true;
	}

}
