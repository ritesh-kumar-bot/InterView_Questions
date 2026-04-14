package leet_code;

public class _3818 {

	public static void main(String[] args) {
		int[] arr = new int[]{1, -1, 2, 3, 3, 4, 5};
		System.out.println(minimumPrefixLength(arr));
	}

	public static int minimumPrefixLength(int[] nums) {
		int i = nums.length - 1;

		while (i > 0 && nums[i - 1] < nums[i]) {
			i--;
		}

		return i;
	}
}
