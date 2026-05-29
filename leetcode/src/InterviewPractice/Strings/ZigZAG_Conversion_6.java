package InterviewPractice.Strings;

public class ZigZAG_Conversion_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "PAHNAPLSIIGYIR";
		int numRows=4;
		
		System.out.println(convert(s, numRows));
	}
	private static String convert(String s, int numRows)
	{
		StringBuilder[] sb = new StringBuilder[numRows];
		if(numRows==1||s.length()<=numRows)
		{
			return s;
		}
		for(int i=0;i<numRows;i++)
		{
			sb[i] = new StringBuilder();
		}
		int currRow = 0;
		boolean dir = false;
		for(char ch : s.toCharArray())
		{
			sb[currRow].append(ch);
			if(currRow==0||currRow==numRows-1)
			{
				dir=!dir;
			}
			currRow+=dir?1:-1;
		}
		
		StringBuilder res= new StringBuilder();
		for(StringBuilder row:sb)
		{
			res.append(row);
		}
		
		return res.toString();
	}

}
