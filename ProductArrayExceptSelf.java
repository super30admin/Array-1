// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
// Approach: For calculating the product at any index by excluding current element, we can multiply the numbers on left of current element (left pass)
// and the elements right to the current element (right pass)

class Solution {
    public int[] productExceptSelf(int[] nums) {
    	//edge case
    	if(nums == null || nums.length == 0) return new int[]{};
    	// Declaring output array
        int[] output = new int[nums.length];
        int temp = 1; // variable to store current number
        int rp = 1; // variable to store current running product excluding current number
        output[0] = 1;
        // left pass to calculate product of left elements
        for(int i = 0; i < nums.length; i++) {
            output[i] = rp;
            temp = nums[i];
            rp *= temp;
        }
        temp = 1;
        rp = 1;
        // right pass to calculate product of right elements. Final produt is also calculated in this step.
        for(int i = nums.length-1; i >= 0; i--) {
            output[i] *= rp;
            temp = nums[i];
            rp *= temp;
        }
        return output;
    }
}