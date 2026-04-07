package InterviewPractice;

public class RemoveDuplicatedFormSortedClass_26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {0,0,1,1,1,2,2,3,3,4};
		int i=0;
		for(int j=1;j<arr.length;j++)
		{
			if(arr[i]!=arr[j])
			{
				i++;
				arr[i]=arr[j];
			}
				
		}
		System.out.println("no.of unique elements"+(i+1));
	}

}
