package leetcode;

public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "mlaalam";
		System.out.println(palindrome(str));
	}

	private static boolean palindrome(String str) {
		// TODO Auto-generated method stub
		int left =0;
		int right = str.length()-1;
		
		while(left<=right)
		{
			if(str.charAt(left)!=str.charAt(right))
			{
				return false;
			}
			left++;
			right--;
		}
		return true;
	}

}
