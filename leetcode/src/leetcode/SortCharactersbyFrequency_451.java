package leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class SortCharactersbyFrequency_451 {
	
	public static void main(String[] args)
	{
		String s = "tree";
		CharactersByFrequency(s.toCharArray());
	}

	private static void CharactersByFrequency(char[] cs) {
		// TODO Auto-generated method stub
		
		Map<Character,Integer> map = new HashMap<>();
		for(char i : cs)
		{
			map.put(i, map.getOrDefault(i, 0)+1);
		}
		
		PriorityQueue<Character> maxHeap = new PriorityQueue<>((a,b)->map.get(b)-map.get(a));
		maxHeap.addAll(map.keySet());
		StringBuilder sb = new StringBuilder();
		while(!maxHeap.isEmpty())
		{
			char c = maxHeap.poll();
			int freq = map.get(c);
			for(int j =0;j<freq;j++)
			{
				sb.append(c);
			}
		}
		System.out.println(sb);
	}

}
