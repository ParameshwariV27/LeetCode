package leetcode;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,3,5,8};
		int val = 13;
		twoSum(arr, val);
	}

	private static void twoSum(int[] arr, int val) {
		// TODO Auto-generated method stub
		Map<Integer, Integer> map = new HashMap<>();
		int[] res = new int[2];
		for(int i=0;i<arr.length;i++)
		{
			int diff = Math.abs(val-arr[i]);
			if(map.containsKey(diff)) 
			{
				res[0]=map.get(diff);
				res[1] = i;
			
			}
			else
			{
				map.put(arr[i], i);
			}
		}
		System.out.println(res[0]+" "+res[1]);
	}

}
