package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class KthLargeElement {
	public static void main(String args[])
	{
		PriorityQueue<Integer> q = new PriorityQueue<>();
		int k=1;
		List<Integer> ls =  Arrays.asList(2,6,8,5,43,23,78,54,10,53);
		for(int n : ls)
		{
			q.offer(n);
			
		}
		
		while(!q.isEmpty())
		{
			System.out.println(q.poll());
		}
		
		
	}

}
