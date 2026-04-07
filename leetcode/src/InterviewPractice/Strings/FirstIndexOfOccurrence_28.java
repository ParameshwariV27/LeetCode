package InterviewPractice.Strings;

public class FirstIndexOfOccurrence_28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "SandDustDrawon", s2 = "Drawn";
		int l1 = s1.length(), l2 = s2.length();
		for(int i=0;i<l1-l2+1;i++)
		{
			if(s1.substring(i, i+l2).equals(s2)) {System.out.println("true"); return;}
		}
		System.out.println("false");
	}

}
