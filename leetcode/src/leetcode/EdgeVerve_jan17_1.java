package leetcode;

import java.util.Arrays;
import java.util.List;

public class EdgeVerve_jan17_1 {
	static int count =0;
	public static void main(String args[])
	{
		
		List<List<Integer>> grid = Arrays.asList(Arrays.asList(0, 0, 0), 
												Arrays.asList(0, 1, 0),
												Arrays.asList(0, 0, 0));  
	
		count = countWays(grid);
		System.out.println("count: "+count);
	}

	private static int countWays(List<List<Integer>> grid) {
		// TODO Auto-generated method stub
		int n = grid.size();
		int m =grid.get(0).size();
		boolean[][] visited = new boolean[n][n];
		if(grid.get(n-1).get(m-1) == 1 || grid.get(0).get(0)==1) return 0;
		
		 dfs(grid,0,0,visited);
		return count;
	}

	private static void dfs(List<List<Integer>> grid, int r, int c, boolean[][] visited) {
		int n = grid.size();
		int m =grid.get(0).size();
		
		if(r>=m||c>=m||r<0||c<0||grid.get(r).get(c)==1||visited[r][c])return;
		
		if(r==n-1||c==m-1)
		{
			count++;
			return;
		}
		visited[r][c]=true;
		
		dfs(grid,r+1,c,visited);
		dfs(grid,r-1,c,visited);
		dfs(grid,r,c+1,visited);
		dfs(grid,r,c-1,visited);
		
		visited[r][c]=false;
		
	
		
	}

}
