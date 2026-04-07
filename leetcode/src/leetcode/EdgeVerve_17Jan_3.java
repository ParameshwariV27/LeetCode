package leetcode;

import java.util.HashSet;
import java.util.Set;

public class EdgeVerve_17Jan_3 {
	
	public static void main(String args[])
	{
		int[] arr = {209,122,22};
		
		int count = countOfSpecialNumbers(arr);
		System.out.println("count is "+count);
	}

	private static int countOfSpecialNumbers(int[] arr) {
		int count =0;
		for(int i:arr)
		{
			System.out.println("Integer now: "+i);
			int sum = SingleDigitSum(i);
			System.out.println("Single Digit sum "+sum);
			long fact = findFactorial(sum);
			System.out.println("Factorial of Single Digit sum "+fact);
			if(isValid(i,fact))count++;
		}
		return count;
	}

	private static boolean isValid(int orig, long fact) {
		// TODO Auto-generated method stub
		Set<Integer> factDigits = splitDigits((int)fact);
		Set<Integer> OrigDigits = splitDigits(orig);
		boolean b = (factDigits.containsAll(OrigDigits))?true:false;
		return b;	
	}

	private static Set<Integer> splitDigits(int n) {
		// TODO Auto-generated method stub
		Set<Integer> s = new HashSet<>();
		while(n>0)
		{
			s.add(n%10);
			n/=10;
		}
		return s;
	}

	private static long findFactorial(int sum) {
		// TODO Auto-generated method stub
		long fact =1;
		for(int i=2;i<=sum;i++)
		{
			fact=fact*i;
		}
		
		return fact;
	}

	private static int SingleDigitSum(int i) {
		// TODO Auto-generated method stub
		while(i>=10)
		{
			int sum=0;
			while(i>0)
			{
				sum+=i%10;
				i/=10;
			}
			i=sum;
		}
		return i;
	}

}
