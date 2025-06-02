// Approach:
// We compute the product of all elements except self without using division.
// First, build a prefix product array (left to right).
// Then, multiply it with suffix product (right to left) in a single pass.

// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

public class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];

        // Initialize the first element of result as 1 since there is no element to the left of index 0
        res[0] = 1;

        // Fill res[] with prefix product of elements to the left of current index
        for (int i = 1; i < n; i++) {
            res[i] = res[i - 1] * nums[i - 1];
        }

        // Initialize a variable to hold suffix product of elements to the right
        int right = 1;

        // Multiply each res[i] with the suffix product from the right
        for (int i = n - 1; i >= 0; i--) {
            res[i] *= right;      // Multiply prefix with current right product
            right *= nums[i];     // Update right product
        }

        // Final result array with product of all elements except self
        return res;
    }
}
