// Time Complexity : O(n), where n is the length of the input array `nums`
// Space Complexity : O(1), excluding the output array `res`
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach:
//  Only one result array is used
// - First, we compute the left product for each element and store it in `res`.
// - Then, we iterate from the right while maintaining a variable `rprod` (right product so far),
//   and multiply it with the corresponding `res[i]` value.
// This results in `res[i] = product of all elements except nums[i]`.

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];

        // Compute left product for each element
        res[0] = 1;
        for (int i = 1; i < n; i++) {
            // product of all elements to the left of i
            res[i] = res[i - 1] * nums[i - 1];
        }

        // Multiply with right product in a single pass from right to left
        int rprod = 1;  // product of all elements to the right
        for (int j = n - 2; j >= 0; j--) {
            rprod *= nums[j + 1];
            res[j] = res[j] * rprod;
        }

        return res;
    }
}