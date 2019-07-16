package Day10_Array1;

//Time Complexity : O(2n) where n is the number of elements in nums array
//Space Complexity : O(1) 
//Did this code successfully run on Leetcode : yes
//Any problem you faced while coding this : didn't understand the purpose of second for loop

public class ProductOfArrayExceptSelf {
	public int[] productExceptSelf(int[] nums) {
		// The length of the input array
		int length = nums.length;

		// Final answer array to be returned
		int[] answer = new int[length];

		// answer[i] contains the product of all the elements to the left
		// Note: for the element at index '0', there are no elements to the left,
		// so the answer[0] would be 1
		answer[0] = 1;
		for (int i = 1; i < length; i++) {

			// answer[i - 1] already contains the product of elements to the left of 'i - 1'
			// Simply multiplying it with nums[i - 1] would give the product of all
			// elements to the left of index 'i'
			answer[i] = nums[i - 1] * answer[i - 1];
		}

		// R contains the product of all the elements to the right
		// Note: for the element at index 'length - 1', there are no elements to the
		// right,
		// so the R would be 1
		int R = 1;
		for (int i = length - 1; i >= 0; i--) {

			// For the index 'i', R would contain the
			// product of all elements to the right. We update R accordingly
			answer[i] = answer[i] * R;
			R *= nums[i];
		}

		return answer;
	}
}
