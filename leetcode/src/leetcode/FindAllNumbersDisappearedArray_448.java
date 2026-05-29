package leetcode;

import java.util.ArrayList;
import java.util.List;

public class FindAllNumbersDisappearedArray_448 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {4,3,2,7,8,2,3,1};
		for(int i=0;i<arr.length;i++)
		{
			
			int p = Math.abs(arr[i]);
			if(arr[p-1]>0)arr[p-1] = arr[p-1]*-1;
		}
		List<Integer> ls = new ArrayList<>();
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>0)ls.add(i+1);
		}
		
		System.out.println(ls);
	}

}
