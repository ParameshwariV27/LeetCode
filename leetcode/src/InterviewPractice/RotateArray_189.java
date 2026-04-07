package InterviewPractice;

import java.util.Arrays;

public class RotateArray_189 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5,6,7};
		int l = arr.length;
		int k=3; //5,3,2,4,6

		arr = rotate(arr,0,l-1);
		for(int x:arr)System.out.print(x+" ");
		System.out.println();
		
		arr = rotate(arr,0,k-1);
		for(int x:arr)System.out.print(x+" ");
		System.out.println();
		
		arr = rotate(arr,k,l-1);
		for(int x:arr)System.out.print(x+" ");
		System.out.println();
		
	}
	private static int[] rotate(int[] arr,int start, int end)
	{
		while(start<end)
		{
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
		return arr;
	}
}
