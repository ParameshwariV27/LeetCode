package InterviewPractice;

public class SingleNumber_136 {
	public static void main(String args[]) {
		int[] arr = {1,2,3,3,4,5,4,5,2};
		int num = findNumber(arr);
		System.out.println(num);
	}
private static int findNumber(int[] arr)
{
	int res=0;
	for(int i:arr) res = res^i;
	return res;
}
}
