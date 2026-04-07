package leetcode;

import java.util.Arrays;

public class KoKoEatingBananas_875 {
	
	public static void main(String[] args)
	{
		int[] piles = {3,6,7,11};
		int h=8;
		
		int k = minEatingSpeed(piles, h);
		System.out.println(k);
	}

	private static int minEatingSpeed(int[] piles, int h) {
		// TODO Auto-generated method stub
		int maxElement = Arrays.stream(piles).max().getAsInt();
		
	    //System.out.println("maxElement "+maxElement);
		if(h==piles.length) return maxElement;
		
			int l=1;
			int r = maxElement;
			int ans=0;
			while(l<r)
			{
				int m=l+((r-l)/2);
				double speed=0;
				for(int pile:piles)
					speed = speed+Math.ceil((double)pile/m);
				
				if(speed<=h) 
					r= m;
				else 
					l=m+1;
			}
		return r;
	}

}
