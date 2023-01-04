// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class ProductArrayExceptItself {
    public int[] productExceptSelf(int[] nums) {

        if (nums.length == 0 || nums == null) {
            return nums;
        }

        int[] result = new int[nums.length];

        int productPass = 1;
        result[0] = productPass;

        for (int i = 1; i < nums.length; i++) {
            productPass *= nums[i - 1];

            result[i] = productPass;
        }

        productPass = 1;
        for (int i = nums.length - 2; i >= 0; i--) {
            productPass *= nums[i + 1];
            result[i] = result[i] * productPass;
        }

        return result;
    }

}