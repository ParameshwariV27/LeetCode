package InterviewPractice;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci_Numbers {
	
	public static void main(String args[])
	{
		List<Integer> ls = new ArrayList<>();
		int a=0;
		int b=1;
		int l=2;
		ls.add(a);
		ls.add(b);
		while(l<=10)
		{
			l++;
			int c = a+b;
			a = b;
			b= c;
			ls.add(c);
		}
		
		System.out.println(ls);
	}

}
