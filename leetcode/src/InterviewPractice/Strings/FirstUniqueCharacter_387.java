package InterviewPractice.Strings;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class FirstUniqueCharacter_387 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "leetcode";
		int[] count = new int[26];
		for(int i=0;i<s.length();i++)
		{
			count[s.charAt(i)-'a']++;
		}
		
		for(int i=s.length()-1;i>=0;i--)
		{
			if(count[s.charAt(i)-'a']==1)
			{
				System.out.println(i);
				return;
			}
		}
	}

}
