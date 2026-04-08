package InterviewPractice.Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams_49 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] arr = {"eat","tea","tan","ate","nat","bat"};
		Map<String, List<String>> map = new HashMap<>();
		for(String w: arr)
		{
			char[] word = w.toCharArray();
			Arrays.sort(word);
			String sorted = new String(word);
			
			if(!map.containsKey(sorted))
			{
				map.put(sorted, new ArrayList<>());
			}
			
			map.get(sorted).add(w);
		}
		
		System.out.println(map.values());
		

	}

}
