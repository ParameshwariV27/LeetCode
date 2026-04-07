package InterviewPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {-1,0,1,2,-1,-4};
		Arrays.sort(arr);
		List<List<Integer>> r = new ArrayList<>();
		for(int i=0;i<arr.length;i++)
		{
			if(i>0 && arr[i]==arr[i-1])
			{
				continue;
			}
			int j=i+1;
			int k=arr.length-1;
			while(j<k)
			{
				int total = arr[i]+arr[j]+arr[k];
				if(total>0)k--;
				else if(total<0)j++;
				else
				{
					r.add(Arrays.asList(arr[i], arr[j], arr[k]));
					j++;
					while(arr[j]==arr[j-1] && j<k)j++;
				}
				
			}
					
		}
		for(List<Integer> i:r)
		{
			for(int j:i)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

}
