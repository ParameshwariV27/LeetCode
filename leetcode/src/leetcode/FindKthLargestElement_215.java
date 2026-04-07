package leetcode;

import java.util.Collections;
import java.util.PriorityQueue;

public class FindKthLargestElement_215 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {3,2,1,5,6,4};
int k=2;		
		PriorityQueue<Integer> minheap = new PriorityQueue<>(Collections.reverseOrder());
		
		for(int n: nums)
		{
			minheap.add(n);
			if(minheap.size()>k)minheap.poll();
		}
		System.out.println(minheap.peek());
	}

}
