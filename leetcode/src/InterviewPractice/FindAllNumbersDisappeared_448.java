package InterviewPractice;

import java.util.ArrayList;
import java.util.List;

public class FindAllNumbersDisappeared_448 {
	
	public static void main(String args[])
	{
		int[] arr= {4,3,2,7,8,2,3,1};
		int l = arr.length;
		for(int i=0;i<l;i++)
		{
			int p = Math.abs(arr[i]);
			if(arr[p-1]>0)
			arr[p-1] = arr[p-1]*-1;
		}
		List<Integer> res = new ArrayList<>();
		for(int i=0;i<l;i++)
		{
			if(arr[i]>0)
				res.add(i+1);
		}
		for(int i:res)System.out.print(i+" ");
		System.out.println();
	}

}
