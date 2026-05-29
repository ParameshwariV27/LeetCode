package streamsPractice;

public class FirstNonRepeatingCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String s = "aaaasddfg";
			
			for(int i=0;i<s.length();i++)
			{
				if(s.indexOf(s.charAt(i))==s.lastIndexOf(s.charAt(i)))
				{
					System.out.println(s.charAt(i));
				return;
				}
				else
				{
					continue;
				}
				
			}
	}

}
