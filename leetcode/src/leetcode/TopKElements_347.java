package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TopKElements_347 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,3,2,1,1,1,12,2,2,2,2,4,4,4,4,4,4,5,5,5,55,5,5,5,1,1,1,1,1,1,1,1,1};
		int k =5;
		Map<Integer, Integer> map = new HashMap<>();
		List<Integer>[] ls = new List[arr.length+1];
		for(int i: arr)
		{
			map.put(i, map.getOrDefault(i, 0)+1);
		}
		for(int i:map.keySet())
		{
			int freq = map.get(i);
			if(ls[freq]==null)ls[freq]=new ArrayList<>();
			ls[freq].add(i);
		}
		int[] res = new int[k];
		int count =0;
		for(int i=ls.length-1; i>0&&count<k ;i--)
		{
			if(ls[i]!=null)
			{
				for(Integer j:ls[i])
				{
					res[count++]=j;
					if(count==k) break;
				}
			}
		}
		System.out.println(Arrays.toString(res));
	}

}
