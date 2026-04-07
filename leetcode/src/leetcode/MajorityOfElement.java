package leetcode;

public class MajorityOfElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,2,2,2,2,6,8};
		majority(arr);

	}

	private static void majority(int[] arr) {
		int count = 0, candidate = 0;

        for (int num : arr) {
            if (count == 0) candidate = num;
            count += (num == candidate) ? 1 : -1;
        }
        System.out.println(candidate);
	}

}
