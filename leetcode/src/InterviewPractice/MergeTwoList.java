package InterviewPractice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergeTwoList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> ls = Arrays.asList(1,1,2,3,4,5,6,6,6);
		List<Integer> ls1 = Arrays.asList(2,2,3,4,5,6,7);
		
		List<Integer> res = Stream.concat(ls.stream(), ls1.stream()).distinct().collect(Collectors.toList());
		System.out.println(res);
	}

}
