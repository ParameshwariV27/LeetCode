package InterviewPractice;

import java.util.HashMap;
import java.util.Map;

public class LongestConsecutive_128_Solution2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[]  arr = {1, 2, 5, 3, 4};
		
		Map<Integer, Integer> map = new HashMap<>();
		for(int n:arr)
			map.put(n,0);
	int count=0;
	int max = Integer.MIN_VALUE;
		for(int n:arr)
		{
			count=1;
			if(!map.containsKey(n-1))
			{
				for(int i=1;i<arr.length;i++)
				{
					if(map.containsKey(n+i)) count++;
					else break;
				}
			}
			max = Math.max(max, count);
		}
		System.out.println(max);

	}

}
