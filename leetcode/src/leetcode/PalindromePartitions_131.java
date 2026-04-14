package leetcode;

import java.util.ArrayList;
import java.util.List;

public class PalindromePartitions_131 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "aab";
		List<List<String>> ls = partition(s);
		ls.forEach(System.out::println);
	}
	private static List<List<String>> partition(String s) {
		// TODO Auto-generated method stub
		List<List<String>> ls= new ArrayList<>();
		  backTrack(s,0, new ArrayList<>(), ls);
		return ls;
	}
	private static void backTrack(String s,int start, List<String> path, List<List<String>> res)
	{
		if(start==s.length())
		{
			res.add(new ArrayList<>(path));
			//res.forEach(System.out::println);
			return;
		}
		for(int end = start+1;end<=s.length();end++)
		{
			if(isPalindrome(s, start, end-1))
			{
				path.add(s.substring(start, end));
				backTrack(s,end, path, res);
				path.remove(path.size()-1);
			}
		}
	}
	private static boolean isPalindrome(String s, int start, int end) {
		while(start<end)
		{
			if(s.charAt(start)==s.charAt(end))
			{
				start++;
				end--;
			}
			else
			{
				return false;
			}
		}
		return true;
	}
}
