package InterviewPractice.Strings;

import java.util.Stack;

public class DecodeString_394 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				String s = "3[a2[c]]";
				//String t = "[]";
				//System.out.println(s.contains(t));
				Stack<Integer> numStack = new Stack<>();
				Stack<String> strStack = new Stack<>();
				
				String currString = "";
				int num=0;
				
				for(int i=0;i<s.length();i++)
				{
					char ch = s.charAt(i);
					if(Character.isDigit(ch))
					{
						num = num*10+(ch-'0');
					}
					else if(ch=='[')
					{
						numStack.push(num);
						strStack.push(currString);
						num=0;
						currString="";
					}
					else if(ch==']')
					{
						String prev = strStack.pop();
						int repeat = numStack.pop();
						StringBuilder sb = new StringBuilder(prev);
						for(int j=0;j<repeat;j++)
						{
							sb.append(currString);
						}
						
						currString = sb.toString();
					}
					else
					{
						currString+=ch;
					}
				}
				System.out.println(currString);
	}
}
