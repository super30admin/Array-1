// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

import java.util.Arrays;

class Product_Array_Except_Self {
	/*
	 * In this function, we calculate product of all left elements of the array and
	 * use a variable to keep track of all running product to the right and we keep
	 * updating our Out_Array, We then update our variable R also
	 */
	public static int[] productExceptSelf(int[] nums) {
		int N = nums.length;
		int Out_Array[] = new int[N];
		Out_Array[0] = 1;
		for (int i = 1; i < N; i++) {
			Out_Array[i] = Out_Array[i - 1] * nums[i - 1];
		}
		int R = 1;
		for (int j = N - 1; j >= 0; j--) {
			Out_Array[j] = R * Out_Array[j];
			R = R * nums[j];
		}
		return Out_Array;
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4 };
		int output[] = productExceptSelf(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(output));
	}
}