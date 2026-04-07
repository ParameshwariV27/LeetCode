package leetcode;

public class MaximumSubarraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {-1,2,-4,5,-6,7,8};
		
		maxSubArray(nums);
	}

	private static void maxSubArray(int[] nums) {
		// TODO Auto-generated method stub
		int currSum = nums[0];
		int sum = nums[0];
		for(int i=1;i<nums.length;i++)
		{
			currSum = Math.max(nums[i], currSum+nums[i]);
			sum = Math.max(currSum, sum);
		}
		System.out.println(sum);
	}

}
