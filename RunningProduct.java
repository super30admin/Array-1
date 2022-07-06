// Time Complexity : O(N)
// Auxilary space O(1)
// Did this code successfully run on Leetcode : Yes

class Solution {
    public int[] productExceptSelf(int[] nums) {
        if(nums == null || nums.length==0){
            return new int[] {};
        }
        int result[] = new int[nums.length];
        int rp = 1;
        for(int i=0;i<nums.length;i++){
            result[i] = rp;
            rp = rp * nums[i];
        }
        
        rp = 1;
        for(int i=nums.length-1;i>=0;i--){
            result[i] = result[i] * rp;
            rp = rp * nums[i];
        }
        return result;
    }
}