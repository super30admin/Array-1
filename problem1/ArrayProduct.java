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
	/* -------------------------- DYNAMIC PROGRAMMING --------------------------- */
	public int[] productExceptSelf(int[] nums) {
		if (nums == null || nums.length == 0) {
			return nums;
		}

		return nums;
	}

	public static void main(String[] args) {
		ArrayProduct obj = new ArrayProduct();
		int[] nums = new int[] { 1, 2, 3, 4 };
		int[] newNums = obj.productExceptSelfBruteForce(nums);
		System.out.println("New Array: ");
		for (int i = 0; i < newNums.length; i++) {
			System.out.println(newNums[i] + " ");
		}
	}

}
