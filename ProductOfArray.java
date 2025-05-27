// Time Complexity: O(n)
// Space Complexity: O(n)
// Runs on LeetCode: YES
class ProductOfArray {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        int runningProduct = 1;
        result[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            runningProduct = runningProduct * nums[i - 1];
            result[i] = runningProduct;
        }
        runningProduct = 1;
        for (int i = nums.length - 2; i >= 0; i--) {
            runningProduct = runningProduct * nums[i + 1];
            result[i] = result[i] * runningProduct;
        }
        return result;
    }
}
