package InterviewPractice;

public class MaximumSubArray_53 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
		int max = maxSubArray(arr);
		System.out.println("sum max: "+max);
	}

	private static int maxSubArray(int[] arr) {
		// TODO Auto-generated method stub
		int max = Integer.MIN_VALUE;
		boolean[] b = new boolean[arr.length];
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
			b[i]=true;
			//max = Math.max(max, sum);
			if(max<sum)
			{
				max=sum;
			}
			else
			{
				b[i]=false;
			}
		}
		for(int i=0;i<b.length;i++)
		{
			if(b[i]) {
				System.out.println(arr[i]);
				
			}
		}
		return max;
	}
}
