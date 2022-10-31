// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
// First we multiply all elements' right elements and store it in an array and then we calculate left products of all elements.
// Multiplying these will get the result.

// Your code here along with comments explaining your approach
class Solution {
	public int[] productExceptSelf(int[] nums) {
		 int[] right = new int[nums.length];
		 right[0] = 1;
		 for(int i = 1; i < nums.length; i++) {
			  right[i] = right[i-1] * nums[i-1];
		 }
		 
		 int rp = 1;
		 for(int i = nums.length - 1; i >= 0; i--) {
			  right[i] = (right[i]*rp);
			  rp = rp * nums[i];
		 }
		 
		 return right;
		 
	}
}