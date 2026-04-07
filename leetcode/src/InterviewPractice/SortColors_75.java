package InterviewPractice;

public class SortColors_75 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,0,2,1,1,0};
		int r =0;
		int w=0;
		int b=0;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==0)r++;
			if(arr[i]==1)w++;
			if(arr[i]==2)b++;
		}
		int i=0;
		while(r>i)
		{
			arr[i++]=0;
		}
		while((r+w)>i)
		{
			arr[i++]=1;
		}
		while((r+w+b)>i)
		{
			arr[i++]=2;
		}
	
	for(int j: arr)
	{
		System.out.print(j+" ");
	}
	}
}
