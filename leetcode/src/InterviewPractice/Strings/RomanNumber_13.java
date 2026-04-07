package InterviewPractice.Strings;

import java.util.HashMap;
import java.util.Map;

public class RomanNumber_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="I";
		int l = str.length();
		Map<Character, Integer> map = new HashMap<>();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);
		int res=0;
		for(int i=0;i<l;i++)
		{
			if((i+1)<l &&(map.get(str.charAt(i)) < map.get(str.charAt(i+1))))
			{
				res+=(map.get(str.charAt(i+1))-map.get(str.charAt(i)));
				i++;
			}
			else
			{
				res+=map.get(str.charAt(i));
			}
		}
		System.out.print(res);
	}

}
