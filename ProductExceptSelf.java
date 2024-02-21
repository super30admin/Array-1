// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes

class Solution {
    public int[] productExceptSelf(int[] nums) {

        int len = nums.length;

        int[] leftProducts = new int[len];
        int[] rightProducts = new int[len];
        int[] output = new int[len];

        leftProducts[0] = 1;
        rightProducts[len - 1] = 1;

        for (int i = 1; i < len; i++) {
            leftProducts[i] = nums[i - 1] * leftProducts[i - 1];
        }

        for (int i = len - 2; i >= 0; i--) {
            rightProducts[i] = nums[i + 1] * rightProducts[i + 1];
        }

        for (int i = 0; i < len; i++) {
            output[i] = leftProducts[i] * rightProducts[i];
        }

        return output;
    }
}