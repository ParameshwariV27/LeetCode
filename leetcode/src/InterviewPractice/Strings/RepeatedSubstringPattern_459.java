package InterviewPractice.Strings;

public class RepeatedSubstringPattern_459 {
	public static void main(String args[])
	{
		String s = "abcaabc";
		int l = s.length();
		for(int i=1;i<=l/2;i++)
		{
			if(l%i==0 && s.substring(0, i).repeat(l/i).equals(s))
			{
				System.out.print("true");
				return ;
			}
		}
		System.out.print("false");
	}

}
