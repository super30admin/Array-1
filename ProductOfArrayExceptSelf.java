// Time Complexity : O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : Yes

public class ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        if (nums == null || nums.length == 0)
            return new int[0];

        int[] result = new int[nums.length];

        //  left pass
        int runningProduct = 1;
        result[0] = runningProduct;
        for (int i = 1; i < nums.length; ++i) {
            runningProduct = runningProduct * nums[i - 1];
            result[i] = runningProduct;
        }

        //  right pass
        runningProduct = 1;
        for (int i = nums.length - 2; i >= 0; --i) {
            runningProduct = runningProduct * nums[i + 1];
            result[i] = runningProduct * result[i];
        }

        return result;
    }
}
