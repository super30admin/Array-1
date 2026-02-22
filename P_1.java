// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

// First pass stores product of all elements to the left of each index.
// Second pass multiplies with product of elements to the right.
// This avoids division and computes result in linear time.

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] arr = new int[nums.length];

        int rp = 1;
        arr[0] = 1;

        for (int i = 1; i < nums.length; i++) {
            rp = rp * nums[i - 1];
            arr[i] = rp;
        }

        rp = 1;

        for (int i = nums.length - 2; i >= 0; i--) {
            rp = rp * nums[i + 1];
            arr[i] *= rp;
        }

        return arr;
    }
}
