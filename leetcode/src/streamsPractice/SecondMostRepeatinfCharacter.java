package streamsPractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class SecondMostRepeatinfCharacter {
	
	public static void main(String args[])
	{
		String s = "aaaaaaaaabbcccccbdd";
		
		Map<Character, Integer> map = new HashMap<>();
		
		for(char ch:s.toCharArray())
		{
			map.put(ch, map.getOrDefault(ch, 0)+1);
		}
		
//		int secondFreq = 0;
//		char secondChar = '\0';
//		
//		int firstFreq = 0;
//		char firstChar = '\0';
//		
//		for(Entry<Character, Integer> entry : map.entrySet())
//		{
//			int currFreq = entry.getValue();
//			char currChar = entry.getKey();
//			
//			if(currFreq>firstFreq)
//			{
//				secondFreq = firstFreq;
//				secondChar = firstChar;
//				
//				
//				firstFreq = currFreq;
//				firstChar = currChar;
//			}
//			else if(currFreq>secondFreq && currFreq!=firstFreq)
//			{
//				secondFreq = currFreq;
//				secondChar = currChar;
//			}
//		}
//		
//		System.out.println("Second Character : "+secondChar+ " freq: "+secondFreq);
		
		map.entrySet().stream().sorted((a,b)->Integer.compare(b.getValue(), a.getValue())).skip(1).findFirst().ifPresent(System.out::println);
		
	}

}
