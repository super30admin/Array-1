// Time Complexity : O(N) //N is the length of array. actually 2 O(N) but constant neglected
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


/**
 * 1. create a left, right array and put first element as 1 on left array and last element as 1 on right array
 * 2. calculate and save cumulative multiplied value of last index into current index result array. 
 * 3. for each index left and right array multiplier will be the answer.
 */

import java.util.Arrays;

public class ProductofArrayExceptSelf {
	public int[] productExceptSelf(int[] nums) {
		int result[] = new int[nums.length];
		int length = nums.length;

		/*
		 * int LR[]= new int[length]; int RL[]= new int[length];
		 * 
		 * LR[0] = 1; RL[length-1]=1;
		 * 
		 * for (int i=1;i<length;i++) { LR[i] = LR[i-1]*nums[i-1];
		 * RL[length-i-1]=RL[length-i]*nums[length-i]; }
		 * 
		 * for(int i=0;i<length;i++) { result[i]= LR[i]*RL[i]; }
		 */

		result[0] = 1;
		for (int i = 1; i < length; i++) {
			result[i] = nums[i - 1] * result[i - 1];
		}

		int temp = 1;
		for (int i = length - 1; i >= 0; i--) {
			result[i] = result[i] * temp;
			temp = temp * nums[i];
		}

		return result;
	}

	public static void main(String[] args) {
		int nums[] = new int[] { 1, 2, 3, 4 };
		System.out.println(Arrays.toString(new ProductofArrayExceptSelf().productExceptSelf(nums)));
	}
}
