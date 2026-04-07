package InterviewPractice;

import java.util.HashMap;
import java.util.Map;
public class TwoSum_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,7,11,15};
		int target = 22;
		int r[] = check(arr, target);
		System.out.println(r[0]+" "+r[1]);
	}
	private static int[] check(int[] arr , int target)
	{
//		Map<Integer, Integer> map = new HashMap<>();
//		int[] res = new int[2];
//		for(int i=0;i<arr.length;i++)
//		{
//			if(map.containsKey((target-arr[i])))
//			{
//				res[0]=i;
//				res[1]= map.get((target-arr[i]));
//				System.out.println(res[0]+" "+res[1]);
//			}
//			else
//				map.put(arr[i], i);
//		}
		
		for(int i=1; i<arr.length;i++)
		{
			for(int j=i; j<arr.length;j++)
			{
				if(arr[j]+arr[j-i]==target) return new int[]{j-i,j};
			}
		}
		return new int[] {0,0};
	}
}
