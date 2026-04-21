package leetcode;

import java.util.Arrays;

public class CompareVersionNumbers_165 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String v1 = "1.01";
		String v2 ="1.0001";
		int res = check(v1, v2);
		System.out.println(res);
	}
		public static int check(String v1, String v2)
		{
			int n1 = v1.length();
			int n2 = v2.length();
			int i=0,j=0;
			while(i<n1 || j<n2)
			{
				//System.out.println(v1.charAt(i));
			//System.out.println(res);
				int num1=0;
				while(i<n1 && v1.charAt(i)!='.')
				{
					num1 = num1*10+(v1.charAt(i)-'0');
					i++;
				}
				
				int num2 = 0;
				while(j<n2 && v2.charAt(j)!='.')
				{
					num2 = num2*10+(v2.charAt(j)-'0');
					j++;
				}
				
				if(num1<num2) return -1;
				if(num1>num2) return 1;
				
				i++;j++;
			}
			
			return 0;
		}

}
