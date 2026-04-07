package InterviewPractice.Strings;

public class ValidPalindrome_125 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = " 0p ";
		 str = str.trim();
		 System.out.println(Character.toUpperCase('0'));
		 int start = 0;
		 int end = str.length()-1;
		 while(start<=end)
		 {
			 if(!Character.isLetterOrDigit(str.charAt(start)))
			 {
				 start++;
			 }
			 else if(!Character.isLetterOrDigit(str.charAt(start)))
			 {
				 end--;
			 }
			 else
			 {
				 
	
			 if(Character.toUpperCase(str.charAt(start))==Character.toUpperCase(str.charAt(end)))
			 {
				 start++;
				 end--;
			 }
			 else
			 {
				 System.out.println("false");
				 break;
			 }
			 }
		 }
	}

}
