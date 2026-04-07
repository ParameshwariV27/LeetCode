package InterviewPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals_56 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr= {{1,3},{2,6},{8,10},{15,18}};
		Arrays.sort(arr, (a,b)->Integer.compare(a[0], b[0]));
		List<int[]> res = new ArrayList<>();
		int[] prev = arr[0];
		
		for(int i=1;i<arr.length;i++)
		{
			int[] interval = arr[i];
			if(prev[1]>=interval[0])
			{
				prev[1]=Math.max(prev[1], interval[1]);
			}
			else
			{
				res.add(prev);
				prev = interval;
			}
		}
		res.add(prev);
		for(int[] i:res)
		{
			System.out.println(i[0]+" "+i[1]);
		}
	}

}
