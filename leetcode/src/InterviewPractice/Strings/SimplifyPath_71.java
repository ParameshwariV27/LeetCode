package InterviewPractice.Strings;

import java.util.Stack;

public class SimplifyPath_71 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = "/home//foo/";
		Stack<String> st = new Stack<String>();
		StringBuilder sb = new StringBuilder();
		String[] sp = path.split("/");
		
		for(String i : sp)
		{
			i = i.trim();
			if(i==""||i.equals("."))
			{
				continue;
			}
			else if(i.equals(".."))
			{
				if(!st.isEmpty())st.pop();
			}
			else
			{
				st.push(i);
			}
		}
		while(!st.isEmpty())
		{
			sb.append("/").append(st.removeLast());
		}
		
		String res = (sb.isEmpty())?"/":sb.toString();
		System.out.print(res);
	}

}
