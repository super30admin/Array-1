// Time Complexity : O(n) where n is the length of the input array
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english
// 1. Find the left product and right product.
// 2. Multiply both the left and right product to get the resultant array.

// Your code here along with comments explaining your approach

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
        int product = 1;
        res[0] = 1;

        for (int i = 1; i < nums.length; i += 1) {
            res[i] = res[i - 1] * nums[i - 1];
        }

        for (int i = nums.length - 2; i > -1; i -= 1) {
            product *= nums[i + 1];
            res[i] = product * res[i];
        }

        return res;
    }
}