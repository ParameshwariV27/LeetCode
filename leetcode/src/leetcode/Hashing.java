package leetcode;
import java.util.*;
public class Hashing {
	
	public static void main(String args[])
	{
		HashMap<String, Integer> map = new HashMap<>();
		map.put("ALV", 100);
		map.put("NLB", 20);
		map.put("CLB", 30);
		
		
		
		map.put("ALV", 120);
		//System.out.println(map);
		
		Set<String> skey = map.keySet();
		//for(String s: skey)
		//{
			System.out.println(skey);
		//}
		
		for(Map.Entry<String, Integer> m:map.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}

}
