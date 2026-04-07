package leetcode;

public class LargestAndSecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,23,43,21,56,78,98,24};
		int l = Integer.MIN_VALUE;
		int s = Integer.MIN_VALUE;
		for(int i: arr)
		{
			if(i>l)
			{
				s=l;
				l=i;
			}
			else if(i>s && l!=s)
			{
				s=i;
			}
		
		}
		System.out.println(l+" "+s);
	}

}
