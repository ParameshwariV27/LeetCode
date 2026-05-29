package InterviewPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {{6,8},{1,3},{2,4}} ;
		Arrays.sort(arr, Comparator.comparingInt(i->i[0]));
		List<int[]> res = new ArrayList<>();
		int[] exisitngInterval = arr[0];
		res.add(exisitngInterval);
		
		for(int[] i:arr)
		{
			if(exisitngInterval[1]>=i[0])
			{
				exisitngInterval[1] = Math.max(exisitngInterval[1], i[1]);
			}
			else
			{
				exisitngInterval = i;
				res.add(exisitngInterval);
			}
		}
		
		for(int[] i : res)
		{
			System.out.println(Arrays.toString(i));
		}
	}

}
