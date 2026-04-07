package InterviewPractice.Strings;

public class LengthOfLastWord_58 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "   fly me   to   the moon  ";
		String st = str.trim();
		String[] s = st.split(" ");
		
		System.out.println(s[s.length-1].length());
		
	}

}
