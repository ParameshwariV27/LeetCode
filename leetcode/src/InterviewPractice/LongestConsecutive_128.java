package InterviewPractice;

import java.util.HashMap;
import java.util.Map;

public class LongestConsecutive_128 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {0,3,7,2,5,8,4,6,0,1,9,10};
		
		Map<Integer, Boolean> map = new HashMap<>();
		int longestLength = 0;
	
		for(int num : nums)
			map.put(num, Boolean.FALSE);
		
		for(int num:nums)
		{
			int currentLength = 1;
			int nextNum = num+1;
			while(map.containsKey(nextNum)&& !map.get(nextNum))
			{
				currentLength++;
				map.put(nextNum, Boolean.TRUE);
				nextNum++;
			}
			int prevNum = num-1;
			while(map.containsKey(prevNum)&&!map.get(prevNum))
			{
				currentLength++;
				map.put(prevNum, Boolean.TRUE);
				prevNum--;
			}
			longestLength = Math.max(longestLength, currentLength);
		}
		
		
		System.out.println(longestLength);
	}

}
