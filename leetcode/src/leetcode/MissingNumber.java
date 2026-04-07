package leetcode;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,4,5,6,7,8};
		missingNumber(nums);
	}

	private static void missingNumber(int[] nums) {
		// TODO Auto-generated method stub
		int sum=0;
		int max=0;
		for(int i: nums)
		{
			sum+=i;
			max = Math.max(max, i);
		}
		
		int totalSum = (max*(max+1))/2;
		
		System.out.println(totalSum-sum);
		
	}

}
