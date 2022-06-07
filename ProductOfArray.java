// Time Complexity : O(n) where n is the number of elements in nums
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No



class ProductOfArray {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        int rp = 1;
        if (nums.length == 0 || nums == null)
            return result;
        for (int i = 0; i < nums.length; i++) {
            result[i] = rp;
            rp *= nums[i];

        }
        rp = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            result[i] *= rp;
            rp *= nums[i];

        }
        return result;
    }
}