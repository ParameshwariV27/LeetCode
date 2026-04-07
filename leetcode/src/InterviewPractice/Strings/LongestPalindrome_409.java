package InterviewPractice.Strings;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LongestPalindrome_409 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "aabbvccddfghgh";
		boolean flag = false;
		int len = 0;
		Map<Character, Integer> map = new HashMap<>();
		
		for(char c : a.toCharArray())
		{
			map.put(c, map.getOrDefault(c, 0)+1);
		}
	
		for(int i:map.values() )
		{
			if(i%2==0)
			{
				len+=i;
			}
			else
			{
				len+=(i-1);
				flag=true;
			}
		}
		if(flag)len+=1;
		System.out.println(len);
	}
}
