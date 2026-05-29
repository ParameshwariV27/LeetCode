package InterviewPractice;

import java.util.Arrays;

public class LongestCommonPrefix_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] str = {"dog","racecar","car"};
		String cmp="";
		Arrays.sort(str);
		System.out.println(Arrays.toString(str));
		//System.out.println(Arrays.toString(str));
		
		char[] first = str[0].toCharArray();
		System.out.println(Arrays.toString(first));
		char[] last = str[str.length-1].toCharArray();
		System.out.println(Arrays.toString(last));
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<first.length;i++)
		{
			System.out.println(first[i]);
			System.out.println(last[i]);
			if(first[i]!=last[i])
			{
				break;
				//System.out.println("match found");
				
			}
			else
			{
				sb.append(first[i]);
			}
		}
		System.out.println(sb.toString());
	
	}

}
