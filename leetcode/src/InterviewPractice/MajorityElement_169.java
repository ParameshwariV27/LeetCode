package InterviewPractice;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement_169 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,2,2,2,1,1,2};
		System.out.println(majority(nums));
	}
	public static int majority(int[] nums)
	{
		int res=0;
		int maj=0;
//		for(int i: nums)
//		{
//			if(maj == 0)
//			{
//				res = i;
//			}
//			if(res == i)maj+=1;
//			else maj-=1;
//		}
		Map<Integer, Integer> map = new HashMap<>();
		for(int i=0;i<nums.length;i++)
		{
			map.put(nums[i], 1+map.getOrDefault(nums[i], 0));
			if(map.get(nums[i])>maj)
			{
				res=nums[i];
				maj = map.get(nums[i]);
			}
		}
		return res;
	}

}
