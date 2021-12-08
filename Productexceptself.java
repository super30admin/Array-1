// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

// Approach

// This problem we have to give the product of the array by excluding current element
// We can use the running product for this
// We will create a result array that stores the product to the left
// Then we use the rp to multiply the array with the right product

class Solution {
    public int[] productExceptSelf(int[] nums) {
        if (nums == null || nums.length == 0)
            return null;
        int n = nums.length;
        int[] result = new int[n];
        int rp = 1;
        result[0] = rp;
        for (int i = 1; i < n; i++) {
            rp = rp * nums[i - 1];
            result[i] = rp;
        }
        rp = 1;
        for (int i = n - 2; i >= 0; i--) {
            rp = rp * nums[i + 1];
            result[i] = result[i] * rp;
        }
        return result;
    }
}