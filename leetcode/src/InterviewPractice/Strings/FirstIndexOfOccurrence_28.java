package InterviewPractice.Strings;

public class FirstIndexOfOccurrence_28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "SandDustDrawn", s2 = "Drawn";
		int i= findOccurence(s1,s2);
		System.out.println(i);
	}
		
		public static int findOccurence(String s1, String s2)
		{
			int ls2 = s2.length();
			for(int i =0;i<s1.length()-ls2;i++)
			{
				if(s1.charAt(i)==s2.charAt(0))
				{
					if(s1.substring(i, i+ls2).equals(s2))
					{
						return i;
					}
				}
			}
			return -1;
		}
	

}
