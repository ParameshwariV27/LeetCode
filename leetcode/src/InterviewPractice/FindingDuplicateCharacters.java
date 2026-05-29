package InterviewPractice;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class FindingDuplicateCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Programming";
		Map<Character, Integer> map = new HashMap<>();
		for(char c : s.toCharArray())
		{
			map.put(c, map.getOrDefault(c,0)+1);
		}
		map.entrySet().stream().filter(x->x.getValue()>1).collect(Collectors.toList());

	}

}
