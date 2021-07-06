// 238. Product of Array Except Self - https://leetcode.com/problems/product-of-array-except-self/
// Time Complexity : O(2N) ~ O(N)
// Space Complexity : O(2N) ~ O(N)
// Did this code successfully run on Leetcode : Yes

class Solution {
    public int[] productExceptSelf(int[] nums) {
        if(nums == null || nums.length == 0) return new int[0];
        
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];
        
        // left product
        //base cond
        left[0]=1;
        for(int i = 1; i<nums.length; i++)
        {
            left[i] = left[i-1] * nums[i-1];
        }
        // right product
        // base cond
        right[nums.length-1]=1;
        for(int i = nums.length-2; i>=0; i--)
        {
            right[i] = right[i+1] * nums[i+1];
        }
        // left * right
        for(int i=0;i<nums.length;i++)
        {
            right[i] = right[i] * left[i];
        }
        return right;
    }
}