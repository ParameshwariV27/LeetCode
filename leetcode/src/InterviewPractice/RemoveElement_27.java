package InterviewPractice;

public class RemoveElement_27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,2,2};//{1,2,3,3,2,4,5,6,3,3,3,3,3,3,5,7,9,0};
		int val = 2;
		
		int res = removeValues(arr, val);
		System.out.println(res);
	}
	private static int removeValues(int[] arr, int val)
	{
		int c = 0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=val)
			{

				arr[c]=arr[i];
				c++;
			}
				
		}
		return c;
	}

}
