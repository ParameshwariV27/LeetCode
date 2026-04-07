package leetcode.Streams;

import java.util.Arrays;
import java.util.List;

public class One {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> ls = Arrays.asList(12,12,12,12,76,54,43,42,65,78,90,76);
		List<Integer> res = ls.stream().filter(i->i%3==0).sorted().distinct().toList();
		//res.forEach(System.out::println);
		
		
		List<List<Integer>> list = Arrays.asList(Arrays.asList(178,90,76),Arrays.asList(179,99,77),Arrays.asList(1,9,7));
		List<Integer> res1 = list.stream().flatMap(i->i.stream()).map(i->i/2).toList();
		res1.forEach(System.out::println);
	}

}
