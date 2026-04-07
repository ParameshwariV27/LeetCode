package InterviewPractice;

public class SearchInRotatedSortedArray_33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {4,5,6,7,0,1,2};
		int target =1;
		
		int s = 0;
		int e = arr.length-1;
		
		while(s<=e)
		{
			int mid = s+(e-s)/2;
			if(target == arr[mid])
			{
				System.out.println(mid);
				return;
			}
			else if(arr[s]<=arr[mid])
			{
				if(target>=arr[s]&& target<arr[mid])
					e=mid-1;
				else
					s=mid+1;
			}
			else
			{
				if(target>arr[mid]&&target<=arr[e])
					s=mid+1;
				else
					e=mid-1;
			}
		}
	}

}
