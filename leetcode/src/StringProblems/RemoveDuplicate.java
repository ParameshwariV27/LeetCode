package StringProblems;

public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "programming";
		String res = "";
		
		for(int i=0;i<str.length();i++)
		{
			if(res.indexOf(str.charAt(i))==-1)
			{
				res+=str.charAt(i);
			}
		}
		System.out.print(res);
	}

}
