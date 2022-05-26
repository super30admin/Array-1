// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

public class ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        if(nums == null || nums.length == 0) return result;
        result[0] = 1;
        int count = 1;
        for(int i = 1; i < nums.length; i++) {
            count *= nums[i-1];
            result[i] = count;
            // [1,2,3,4]
            // [1,1,2,6]
        }
        count = 1;
        for(int i = nums.length - 2; i >= 0; i--) {
            count *= nums[i+1];
            result[i] = result[i] * count;
            // [1,2,3,4]
            // [1,1,2,6]
            // [24,12,8,6]
        }
        return result;
    }
}
