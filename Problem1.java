// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : y
class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int[] res = new int[nums.length];
        res[0] = 1;
        
        for(int i=1; i<nums.length; i++) {
            res[i] = res[i-1] * nums[i-1];
        }
        
        int rp = 1;
        for(int i=nums.length-2; i>=0; i--) {
            rp *= nums[i+1];
            res[i] *= rp;
        }
        
        return res;
    }
}