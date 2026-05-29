package InterviewPractice;

import java.util.Arrays;

public class PlusOne_66 {
	public static void main(String args[])
	{
		int[] arr = {1,4,9};
		int[] res= plusOne(arr);
		System.out.println(Arrays.toString(res));
	}
    private static  int[] plusOne(int[] digits) {
    	
    	for(int i=digits.length-1; i>=0;i--)
    	{
    		if(digits[i]==9)
    		{
    			digits[i]=0;
    		}
    		else
    		{
    			digits[i]++;
    			return digits;
    		}
    	}
    	
    	digits = new int[digits.length+1];
    	digits[0]=1;
    	return digits;
        
    }
}


