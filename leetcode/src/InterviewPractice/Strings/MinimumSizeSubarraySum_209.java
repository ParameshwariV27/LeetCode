package InterviewPractice.Strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MinimumSizeSubarraySum_209 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,3,4,2,4,3};
		int target = 8;
		
		int high=0, low=0, minWindow = Integer.MAX_VALUE, currWindow = 0;
		int sum=0;
		while(high<arr.length)
		{
			 sum=sum+arr[high];
			 high++;
			 
			 while(sum>=target)
			 {
				 currWindow = high-low;
				 minWindow =  Math.min(minWindow, currWindow);
				 sum=sum-arr[low++];
			 }
		}
		
		System.out.println(minWindow==Integer.MAX_VALUE ? 0:minWindow);
	}

}
