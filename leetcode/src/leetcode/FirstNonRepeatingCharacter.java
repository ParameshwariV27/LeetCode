package leetcode;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Parameshwari";
		System.out.println(firstNonRepeating(s));
	}

	private static char firstNonRepeating(String s) {
		// TODO Auto-generated method stub
		Map<Character, Integer> map = new HashMap<>();
		
		for(Character i: s.toCharArray())
		{
			map.put(i, map.getOrDefault(i, 0)+1);
		}
		for(Character i:map.keySet())
		{
			if(map.get(i)==1) return i;
		}
		
		return ' ';
	}

}
