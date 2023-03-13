// Time Complexity : O(n); O(2 * n) = O(n); n = nums.length
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
class Solution {
    public int[] productExceptSelf(int[] nums) {
        if(nums == null || nums.length == 0 || nums.length == 1) {
            return nums;
        }
        
        int[] result = new int[nums.length];
        result[0] = 1;
        int mul = 1;

        for (int i = 1; i < nums.length; i++) {
            result[i] = nums[i - 1] * mul;
            mul *= nums[i - 1];
        }

        mul = 1;
        for (int i = nums.length - 2; i >= 0; i--) {
            result[i] *= nums[i + 1] * mul;
            mul *= nums[i + 1];
        }

        return result;
    }
}