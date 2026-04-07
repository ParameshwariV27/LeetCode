package leetcode;

import java.util.HashSet;
import java.util.Set;

public class DuplicateNumber_287 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,2};
//		Set<Integer> s = new HashSet<>();
//		
//		for(int n: arr)
//		{
//			if(!s.add(n))
//			{
//				System.out.println(n);
//			}
//		}
		
		Boolean[] b = new Boolean[arr.length+1];
		for(int i=0; i<arr.length;i++)
		{
			int e = arr[i];
			if(b[e]==Boolean.TRUE) {System.out.println(arr[i]); break;}
			else b[e] = true;
		}
	}

}
