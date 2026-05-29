package InterviewPractice;

public class MinimumSizeSubarraySum_209 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] s = {1,4,4};
		int target = 4;
		
		int high =0, low =0, minLen = Integer.MAX_VALUE, sum=0,currWindow=0;
		
		while(high<s.length)
		{
			sum+=s[high++];
			while(sum>=target)
			{
				currWindow = high-low;
				minLen = Math.min(minLen, currWindow);
				sum-=s[low++];
			}
			
		}
		System.out.print(minLen==Integer.MAX_VALUE?"":minLen);
	}

}
