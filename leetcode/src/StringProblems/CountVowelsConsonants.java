package StringProblems;

public class CountVowelsConsonants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "malayalam";
		int v = 0;
		int c = 0;
		int i=0;
		while(i<str.length())
		{
			if("aeiouAEIOU".indexOf(str.charAt(i))==-1)
			{
				c++;
			}
			else
			{
				v++;
			}
			i++;
		}
		
		System.out.println("Vowels: "+v);
		System.out.println("Consonants: "+c);
	}

}
