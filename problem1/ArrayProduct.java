package problem1;

public class ArrayProduct {
	/* -------------------------------------------------------------------------- */
	/* ----------------------------- BRUTE FORCE -------------------------------- */
	// Time Complexity : O(n^2)
	// Space Complexity : O(n)
	// Did this code successfully run on Leetcode : Time Limit Exceeded
	// Any problem you faced while coding this : No
	public int[] productExceptSelfBruteForce(int[] nums) {
		if (nums == null || nums.length == 0) {
			return nums;
		}
		int[] prodExpectSelfArr = new int[nums.length];

		for (int i = 0; i < nums.length; i++) {
			int prod = 1;
			for (int j = 0; j < nums.length; j++) {
				if (j == i) {
					continue;
				}
				prod *= nums[j];
			}
			prodExpectSelfArr[i] = prod;
		}

		for (int i = 0; i < nums.length; i++) {
			nums[i] = prodExpectSelfArr[i];
		}

		return nums;
	}

	/* -------------------------------------------------------------------------- */
	/* ------------------------------- THREE PASS ------------------------------- */
	public int[] productExceptSelf(int[] nums) {
		if (nums == null || nums.length == 0) {
			return nums;
		}

		int n = nums.length;

		int[] result = new int[n];

		result[0] = 1;

		for (int i = 1; i < n; i++) {
			result[i] = result[i - 1] * nums[i - 1];
		}

		int right = 1;

		for (int i = n - 1; i >= 0; i--) {
			result[i] *= right;
			right *= nums[i];
		}

		return result;
	}

	public static void main(String[] args) {
		ArrayProduct obj = new ArrayProduct();
		int[] nums = new int[] { 1, 2, 3, 4 };
		int[] newNums = obj.productExceptSelfBruteForce(nums);
		System.out.println("New Array: ");
		for (int i = 0; i < newNums.length; i++) {
			System.out.print(newNums[i] + " ");
		}
	}

}
