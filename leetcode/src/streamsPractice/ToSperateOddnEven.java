package streamsPractice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ToSperateOddnEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  List<Integer> ls = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
	  Map<Boolean, List<Integer>> map = new HashMap<>();
	  map = ls.stream().collect(Collectors.partitioningBy(n->n%2==0));
	  
	  List<Integer> t= map.get(Boolean.TRUE);
	  List<Integer> f = map.get(Boolean.FALSE);
	  
	  System.out.println("t: "+t);
	  System.out.println("f: "+f);
	  
	}

}
