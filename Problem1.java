// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

class Solution {
    public int[] productExceptSelf(int[] nums) {
        if(nums == null || nums.length == 0) return new int[0];
        int[] result = new int[nums.length];
        int n = nums.length;
        int rp = 1; 
        result[0] = 1;
        //Forward pass
        for(int i=1; i<n; i++){
            rp = rp*nums[i-1];
            result[i] = rp;
        }
        rp = 1;
        //backward pass
        for(int i=n-2; i>=0; i--){
            rp = rp*nums[i+1];
            result[i] = result[i]*rp;
        }
        return result;
    }
}