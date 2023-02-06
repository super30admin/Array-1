// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach

/**
 * We need two iterations from left to right and then right to left.
 * when doing left to right, start with initial index as 1 in the answer 
 * array because we do not have anything left to it to multiply. for next
 * indices, multiply with previous indices to get left multiplications. 
 * Then start from right to left. Initially take a variable r as 1 and
 * multiply it with right most index because we already got the needed
 * answer for that index. then update r as r * nums[that index] and iterate
 * till 0th index. Return this array as output.
 *
 */
class Solution {
	public int[] productExceptSelf(int[] nums) {
		int[] sq = new int[nums.length];
		sq[0] = 1;
		for (int i = 1; i < nums.length; i++)
			sq[i] = nums[i - 1] * sq[i - 1];

		int r = 1;
		for (int i = nums.length - 1; i >= 0; i--) {
			sq[i] = sq[i] * r;
			r *= nums[i];
		}
		return sq;
	}
}