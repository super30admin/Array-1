// Time Complexity : o(n)
// Space Complexity : o(1)
// Did this code successfully run on Leetcode : Yes
public class ProductOfArrayExceptSelf {

	public int[] productExceptSelf(int[] nums) {

		if (nums == null || nums.length == 0)
			return new int[0];
		int[] result = new int[nums.length];

		int prod = 1;
		// initialize left first element as 1
		result[0] = 1;

		for (int i = 1; i < nums.length; i++) {
			// multiply all left elements and store
			prod *= nums[i - 1];
			result[i] = prod;
		}
		// reinitialize prod to 1
		prod = 1;
		for (int i = nums.length - 2; i >= 0; i--) {
			// multiply all right elements and store
			prod *= nums[i + 1];
			// multiply with existing left prod on ith index
			result[i] *= prod;
		}

		return result;
	}

}
