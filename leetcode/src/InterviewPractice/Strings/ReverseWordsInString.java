package InterviewPractice.Strings;

public class ReverseWordsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "a good   example";
		String[] arr = str.split("\\s+");
		StringBuilder sb = new StringBuilder();
		
		for(int i=arr.length-1;i>=0;i--)
		{
			sb.append(arr[i]);
			if(i!=0) sb.append(" ");
		}
		
		System.out.println(sb.toString().trim());
	}

}
