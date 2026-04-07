package leetcode;

public class MoveZerosToEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,0,9,8,0,2,0,7,0,1,2,3,4};
		int[] res = moveZeros(arr);
		for(int i:res)System.out.println(i);
	}

	private static int[] moveZeros(int[] arr) {
		// TODO Auto-generated method stub
		int index=0;
		int[] res = new int[arr.length];
		for(int n:arr)
		{
			if(n!=0)
			{
				res[index++]=n;
			}
		}
		while(index<arr.length)res[index++]=0;
		return res;
	}

}
