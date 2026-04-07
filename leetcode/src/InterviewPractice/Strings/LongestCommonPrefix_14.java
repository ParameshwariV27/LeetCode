package InterviewPractice.Strings;

public class LongestCommonPrefix_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr = {"flower","flow","flown"};
		
		String prefix = arr[0];
		for(int i=0;i<arr.length;i++)
		{
			while(arr[i].indexOf(prefix)!=0)
			{
				
				System.out.println("prefix: "+prefix);
				System.out.println("arr["+i+"]" +arr[i]);
				System.out.println("arr[i].indexOf(prefix): "+arr[i].indexOf(prefix));
				prefix = prefix.substring(0, prefix.length()-1);
			}
		}
		
		System.out.println(prefix);

	}

}
