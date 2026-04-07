package Threads;

import java.time.LocalDateTime;

public class TranxIdGeneration {
	
	public static void main(String args[])
	{
		String t = LocalDateTime.now().toString();
		String tr = t.replaceAll("[^a-zA-Z0-9]", ""); 
		
		int a1[] = {1,2};
		int a2[] = {1,2};
		System.out.println(a1.equals(a2));
		System.out.println(t);
		System.out.println(tr);
		
		
		try {
			System.out.println(args.length);
			int a = args.length;
			int b =10/a;
			System.out.println(a);
		}
		catch(ArithmeticException s)
		{
			System.out.println(" hellow");
		}
	}

}
