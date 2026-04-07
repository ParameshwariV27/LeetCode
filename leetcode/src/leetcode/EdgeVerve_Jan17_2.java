package leetcode;
import java.util.*;

public class EdgeVerve_Jan17_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> arr = new ArrayList<>(List.of(2, 7, 3, 9, 4));
		int max = 0;
		for(int i=0;i<arr.size()-1;i++)
		{
			 int val = lcm(arr.get(i),arr.get(i+1));
			 max = Math.max(max, val);
			 
		}
		System.out.println("max lcm = "+max);
	}
	
	private static int lcm(int a,int b)
	{
		return ((a*b)/gcd(a,b));
	}

	private static int gcd(int a, int b) {
		// TODO Auto-generated method stub
		while(b!=0)
		{
			int temp = b;
			b = a%b;
			a=temp;
		}
		return a;
	}

}
