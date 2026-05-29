package streamsPractice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupWordsByLength {
	public static void main(String args[])
	{
		List<String> ls = Arrays.asList("Java","from","four","air","brush");
		
		Map<Integer, List<String>> map = ls.stream().collect(Collectors.groupingBy(s->s.length()));
		
		System.out.println(map);
	}

}
