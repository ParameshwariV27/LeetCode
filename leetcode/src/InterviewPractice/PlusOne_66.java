package InterviewPractice;

public class PlusOne_66 {
	public static void main(String args[])
	{
		int[] arr = {1,4,9,9};
		int[] res= plusOne(arr);
		for(int i: res)System.out.println(i);
	}
    private static  int[] plusOne(int[] digits) {
        
        int len = digits.length;
        int carry =1;
        for(int i=len-1;i>=0;i--)
        {
            digits[i]+=1;
            if(digits[i]==10)
            {
                digits[i]=0;
                carry=1;
            }
            else
            {
                carry=0;
                break;
            }
        }
        int[] res = new int[len+1];
        if(carry==1)
        {
            res[0]=1;
            for(int i=1;i<res.length;i++)
            {
                res[i]=digits[i-1];
            }
            return res;
        }
        else
        {
            return digits;
        }
    }
}


