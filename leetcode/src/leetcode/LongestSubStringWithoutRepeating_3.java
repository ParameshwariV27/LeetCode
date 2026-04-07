package leetcode;

import java.util.HashSet;
import java.util.Set;

public class LongestSubStringWithoutRepeating_3 {
	
	public static void main(String args[])
	{
		String str = "abcabcbb";
		Set<Character> s = new HashSet<>();
		int max = 0;
		int l=0;
		for(int i=0;i<str.length();i++)
		{
			if(!s.contains(str.charAt(i)))
			{
				s.add(str.charAt(i));
				max = Math.max(max,i-l+1);
			}
			else
			{
				while(s.contains(str.charAt(i)))
				{
					s.remove(str.charAt(l));
					l++;
				}
				s.add(str.charAt(i));
			}
		}
		System.out.print(max);
	}

}
