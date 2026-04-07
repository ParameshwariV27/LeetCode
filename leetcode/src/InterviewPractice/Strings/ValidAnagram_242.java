package InterviewPractice.Strings;

public class ValidAnagram_242 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "cat";
		String b = "cat";
		if(a.length()!=b.length())System.out.println("false at length");
		int[] a1 = new int[26];
		for(int i=0;i<a.length();i++)
		{
			a1[a.charAt(i)-97]++;
			a1[b.charAt(i)-97]--;
		}
		
		for(int i:a1)
		{
			if(i!=0)
			{
				System.out.println("false at array comp: "+i);
			}
		}
	}

}
