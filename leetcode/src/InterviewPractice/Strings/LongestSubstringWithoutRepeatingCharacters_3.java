package InterviewPractice.Strings;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "pwwkew";
		int l=0;
		Set<Character> set = new HashSet<>();
		int maxl =0;
		for(int r=0;r<s.length();r++)
		{
			if(!set.contains(s.charAt(r)))
			{
				set.add(s.charAt(r));
				maxl = Math.max(maxl, r-l+1);
			}
			else 
				{
				while(set.contains(s.charAt(r)))
				
				{
					set.remove(s.charAt(l));
				l++;
				
				}
				set.add(s.charAt(r));
		}
		}
		System.out.print(maxl);
	}

}
