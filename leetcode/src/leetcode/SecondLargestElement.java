package leetcode;

public class SecondLargestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,0,9,8,0,2,0,7,0,1,2,3,4};
		int a = secondLargest(arr);
		System.out.println(a);
	}

	private static int secondLargest(int[] arr) {
		// TODO Auto-generated method stub
		int first = Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;
		for(int i:arr)
		{
			if(i>first)
			{
				second = first;
				first =i;
				
			}
			else if(i>second && i!=first)
				second =i;
		}
		return second;
	}

}
