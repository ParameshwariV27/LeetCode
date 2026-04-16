package leetcode;

import java.util.Arrays;

public class CompareVersionNumbers_165 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String v1 = "1.2";
		String v2 ="1.10";
		int res = check(v1, v2);
		System.out.println(res);
	}
		public static int check(String v1, String v2)
		{
			int i=0,j=0;
			int n = v1.length();
			int m = v2.length();
			while(i<n||j<m)
			{
				int num=0;
				int num1 =0 ;
				while(i<n && v1.charAt(i)!='.')
				{
					num = num*10+(v1.charAt(i)-'0');
					i++;
				}
				while(j<m && v2.charAt(j)!='.')
				{
					num1 = num1*10+(v2.charAt(j)-'0');
					j++;
				}
				
			    if(num<num1) return -1;
			    if(num>num1) return 1;
			    
			    i++;j++;
			}
			return 0;
	}

}
