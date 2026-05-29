package InterviewPractice;

public class ProductExceptSelf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5};
		
		int[] right = new int[5];
		int[] left = new int[5];
		
		int[] res = new int[5];
		
		right[arr.length-1] =1;
		for(int i=arr.length-2;i>-1;i--)
		{
			right[i]=right[i+1]*arr[i+1];
			
			
		}
		left[0]=1;
		for(int i=1;i<arr.length;i++)
		{
			left[i] = left[i-1]*arr[i-1];
			
		}
		
		for(int i=0;i<arr.length;i++)
		{
			res[i]=right[i]*left[i];
			System.out.println(res[i]);
		}
	}

}
