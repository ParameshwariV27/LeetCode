package InterviewPractice;

import java.util.Arrays;

public class MergeSortedArray_88 {
	public static void main(String args[])
	{
		int[] arr1 = {1,2,3,0,0,0};
		int m1 = 3;
		int[] arr2 = {2,5,6};
		int m2 = 3;
		
		merge(arr1,m1,arr2, m2);
	}

	private static void merge(int[] arr1, int m1, int[] arr2, int m2) {
		// TODO Auto-generated method stub
		int[] res = new int[m1+m2];
		int i=0;
		int j=0,k=0;
		while(i<m1&&j<m2&&k<(m1+m2))
		{
			if(arr1[i]>arr2[j])
			{
				res[k++]=arr2[j++];
			}
			else
			{
				res[k++]=arr1[i++];
			}
			
		}
		while(i<m1)
		{
			res[k++] = arr1[i++];
		}
		while(j<m2)
		{
			res[k++] = arr2[j++];
		}
		
		
		for(int n:res)
		{
			System.out.println(n);
		}
	}

}
