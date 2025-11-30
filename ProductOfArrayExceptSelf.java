// Approach: Running product (Two-pass solution)
// Time: N + N ~= O(N)
// Space: O(1)
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int runningProduct = 1;
        int[] result = new int[nums.length];
        result[0] = runningProduct;
        // left + 1 to right
        for (int i = 1; i < nums.length; i ++) {
            runningProduct *= nums[i - 1];
            result[i] = runningProduct; // assign running product
        }
        runningProduct = 1;
        // right - 1 to left
        for (int i = nums.length - 2; i >= 0; i --) {
            runningProduct *= nums[i + 1];
            result[i] *= runningProduct; // multiply with running product
        }
        return result;
    }
}