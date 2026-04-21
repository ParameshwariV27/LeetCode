package StringProblems;

public class CheckPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "malayalam";
		int start = 0;
		int end = str.length()-1;
		boolean f = true;
		
		while(start<=end)
		{
			if(str.charAt(start)!=str.charAt(end))
			{
				f=false;
				return;
			}
			start++;end--;
		}
		
		System.out.println(f);
		
	}

}
