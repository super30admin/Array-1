// 238. Product of Array Except Self - https://leetcode.com/problems/product-of-array-except-self/
// Time Complexity : O(2N) ~ O(N)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : Yes

class Solution {
    public int[] productExceptSelf(int[] nums) {
        if(nums == null || nums.length == 0) return new int[0];
        
        int[] result = new int[nums.length];
        
        // left
        result[0] = 1;
        for(int i=1; i<nums.length; i++)
        {
            result[i] =  result[i-1] * nums[i-1];
        }
        // right
        int right=1;
        for(int i=nums.length-1; i>=0; i--)
        {
            result[i] = result[i] * right;
            right = right * nums[i];
        }
        return result;
    }
}