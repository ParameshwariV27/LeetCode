package InterviewPractice;

import java.util.HashMap;
import java.util.Map;

public class TwoSum_II_InputArrayIsSorted_167 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,3,4,2,6,5,9,10,15,7,11};
		int target =12;
//		Map<Integer, Integer> map = new HashMap<>();
//		int j=0;
//		int flag =0;
//		for(int n:arr)
//		{
//			map.put( n,j++);
//		}
//		int pos= 0;
//		int pos1 = 0;
//		for(int i=0;i<arr.length;i++)
//		{
//			if(map.containsKey(target-arr[i]))
//			{
//				flag=1;
//				 pos = map.get(target-arr[i]);
//				 pos1 =i;
//				 System.out.println(pos+" "+pos1);
//				 break;
//			}
//		}	
//		if(pos1<pos) 
//			{
//			System.out.println("at 1");
//			System.out.println((pos1+1)+" "+ (pos+1));
//			}
//		else if((pos<pos1))
//			{
//			System.out.println("at 2");
//			System.out.println((pos+1)+" "+ (pos1+1));
//			}
//		else 
//			{
//			System.out.println("at 3");
//			System.out.println(pos+" "+ pos1);
//			}
//		
		// 2 Pointers
		int left =0;
		int right = arr.length-1;
		
		while(left<right)
		{
			int sum = (arr[left]+arr[right]);
			if(sum==target)
			{
				System.out.println(left+" "+right);
				return;
			}
			else if(sum<target)
			{
				left++;
			}
			else {
				right--;
			}
		}
	}
}
