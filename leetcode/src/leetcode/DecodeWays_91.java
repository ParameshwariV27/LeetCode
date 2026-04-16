package leetcode;

public class DecodeWays_91 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "11106";
		
		int[] dq = new int[s.length()+1];
		dq[0]=1;
		dq[1]=s.charAt(0)=='0'?0:1;
		
		for(int i=2;i<=s.length();i++)
		{
			int oneDigit = Integer.valueOf(s.substring(i-1,i));
			int twoDigit = Integer.valueOf(s.substring(i-2,i));
			
			if(oneDigit>=1)
			{
				dq[i]+=dq[i-1];
			}
			if(twoDigit>=10 && twoDigit<=26)
			{
				dq[i]+=dq[i-2];
			}
		}
		
		System.out.println(dq[s.length()]);
	}

}
