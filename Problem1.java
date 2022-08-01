// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        if(nums == null || nums.length == 0) return result;
        int rp = 1;
        result[0] = 1;
        for(int i = 1; i < n; i++) {
            rp = nums[i-1] * rp;
            result[i] = rp;
        }
        
        rp = 1;
        for(int i = nums.length - 2; i>= 0; i--) {
            rp = rp * nums[i+1];
            result[i] = rp * result[i];
        }
        
        return result;
    }
}