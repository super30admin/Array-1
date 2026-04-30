// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english:
// We maintain a running product
// Frist do the left to right pass where we multiple numbers
// Then do a right to left pass

// Your code here along with comments explaining your approach

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        int rp = 1;
        result[0] = 1;

        for (int i = 1; i < n; i++) {
            rp = rp * nums[i-1];
            result[i] = rp;
        }

        rp = 1;

        for (int i = n-2; i >=0; i--) {
            rp = rp * nums[i+1];
            result[i] = result[i] * rp;
        }

        return result;
    }
}