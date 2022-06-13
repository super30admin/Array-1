// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        if(nums == null || nums.length == 0) return result;
        
        result[0] =1;
        int rp = 1;
        //left pass 
        for(int i = 1; i <n; i++){
            rp *= nums[i-1];
            result[i] = rp;      
        }
        rp = 1;
        //right 
        for(int i = n-2; i>=0; i--){
            rp *= nums[i+1];
            result[i] *= rp; 
        }
        return result;
    }
}