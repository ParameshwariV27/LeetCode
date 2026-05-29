package InterviewPractice.Strings;

public class LongestRepeatingCharacterReplacement_424 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "aababcc";
		int k =2;
		int l=0;
		int[] freq = new int[26];
		int maxFreq =0;
		int windowLen =0;
		int maxWindow=0;
		for(int r =0;r<s.length();r++)
		{
			freq[s.charAt(r)-'a']++;
			maxFreq = Math.max(maxFreq, freq[s.charAt(r)-'a']);
			windowLen = r-l+1;
			
			if(windowLen-maxFreq>k)
			{
				freq[s.charAt(l)-'a']--;
				l++;
			}
			
			windowLen = r-l+1;
			maxWindow = Math.max(maxWindow, windowLen);
		}
		
		System.out.print(maxWindow);
	}

}
