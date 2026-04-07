package leetcode;

import java.util.Stack;

public class DailyTemperature_739 {
	
	public static void main(String args[])
	{
		int[] arr= {73,74,75,71,69,72,76,73};
		int[] res= maxTemp(arr);
		for(int i:res)System.out.println(i);
	}
	private static int[] maxTemp(int[] arr)
	{
		Stack<Integer> st = new Stack<>();
		int[] res = new int[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			while(!st.empty() && arr[i]>arr[st.peek()])
			{
				int ind= st.pop();
				res[i]=i-ind;
			}
				st.push(i);
			
			
		}
		return res;
		
	}
}
