package leetcode;

import java.util.ArrayList;
import java.util.List;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Today is Wednesday";
		System.out.println(reverse(str));
	}

	private static String reverse(String str) {
		// TODO Auto-generated method stub
		String[] strArray = str.split(" ");
		StringBuilder sb = new StringBuilder();
		for(String a : strArray)
		{
			StringBuffer sa = new StringBuffer(a);
			sb.append(sa.reverse().append(" "));
		}
		return sb.toString().trim();
	}

}
