package leetcode;

import java.util.List;
import java.util.PriorityQueue;

public class KClosestPointsFromOrigin_973 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] points = {{-2,2},{5,-1},{-3,4}};
		int k = 2;
		KClosestPoints(points,k);

	}
	private static int distance(int[] p)
	{
		return (p[0]*p[0] + p[1]*p[1]);
	}
	private static void KClosestPoints(int[][] points, int k) {
		// TODO Auto-generated method stub
		PriorityQueue<int[]> maxHead = new PriorityQueue<int[]>((a,b)->distance((int[]) b)-distance((int[]) a));
		
		for(int[] p : points)
		{
			maxHead.offer(p);
			if(maxHead.size()>k)
			{
				maxHead.poll();
			}
		}
		
		int[][] res = new int[k][2];
		for(int i=0;i<k;i++)
		{
			res[i] = maxHead.poll();
			System.out.println(res[i][0]+" "+res[i][1]);
		}
	
	}

}
