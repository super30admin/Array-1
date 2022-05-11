//Time Complexity:O(n)
//Space Complexity:o(1)
//Did this code successfully run on Leetcode :Yes

class Solution {
    public int[] productExceptSelf(int[] nums) {
        if (nums == null || nums.length == 0)
            return new int[0];
        int n = nums.length;

        int[] leftPass = new int[n];

        int runningProduct = 1;
        leftPass[0] = 1;
        // left Pass
        for (int i = 1; i < leftPass.length; i++) {
            runningProduct *= nums[i - 1];
            leftPass[i] = runningProduct;

        }
        // RIGHTpASS
        runningProduct = 1;
        for (int i = n - 2; i >= 0; i--) {
            runningProduct *= nums[i + 1];
            leftPass[i] = runningProduct * leftPass[i];
        }
        return leftPass;
    }
}