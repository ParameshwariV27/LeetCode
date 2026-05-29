package InterviewPractice.Strings;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "pwwkew";
		int l=0;
		int max = 0;
		Set<Character> hs = new HashSet<>();
		for(int r=0; r<s.length();r++)
		{
			if(!hs.contains(s.charAt(r)))
			{
				hs.add(s.charAt(r));
				max = Math.max(max,r-l+1);
			}
			else
			{
				while(hs.contains(s.charAt(r)))
				{
					hs.remove(s.charAt(l));
					l++;
				}
				hs.add(s.charAt(r));
			}
		}
		
		System.out.print(max);
	}

}
