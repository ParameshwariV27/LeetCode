package InterviewPractice;

import java.util.Arrays;

public class SetMatrixZero_73 {
	public static void main(String args[])
	{
		int[][] arr = {{1,1,1},{1,0,1},{1,1,1}};
		
		boolean[] rows = new boolean[arr.length];
		boolean[] col = new boolean[arr[0].length];
		
		int n=arr.length;
		int m = arr[0].length;
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				if(arr[i][j]==0)
				{
					rows[i]=true;
					col[j]=true;
				}
			}
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				if(rows[i]||col[j])
				{
					arr[i][j]=0;
				}
			}
		}
		
		
		for(int i=0;i<rows.length;i++)
			System.out.println(Arrays.toString(arr[i]));
		
	}
	
	

}
