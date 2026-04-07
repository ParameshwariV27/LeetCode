package InterviewPractice;

public class MaximumProductSubarray_152 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2, 3, 0, 4, 5};
		
		int n= arr.length;
		int left =1;
		int right = 1;
		int ans = arr[0];
		
		for(int i=0;i<arr.length;i++)
		{
			left = left==0?1:left;
			right = right ==0?1:right;
			
			left*=arr[i];
			right*=arr[n-i-1];
			
			ans = Math.max(ans, Math.max(left, right));
		}
		System.out.println(ans);
		
	}

}
