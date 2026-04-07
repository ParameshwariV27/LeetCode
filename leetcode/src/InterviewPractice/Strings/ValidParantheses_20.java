package InterviewPractice.Strings;

import java.util.Stack;

public class ValidParantheses_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String res = "";
		String p = "{{[]}}";
		Stack<Character> ch = new Stack<>();
		for(int i=0;i<p.length();i++)
		{
			if(p.charAt(i)=='['|| p.charAt(i)=='{'|| p.charAt(i)=='(')
			{
				ch.push(p.charAt(i));
			}
			else if((!ch.empty()) && (p.charAt(i)==']' && ch.peek()=='[')||(p.charAt(i)=='}' && ch.peek()=='{')||(p.charAt(i)==')' && ch.peek()=='('))
			{
				res = res + p.charAt(i)+ch.peek();
				ch.pop();
			}
		}
		
		System.out.println((p.length()==res.length())?true:false);
	}

}
