//Bruteforce

class Solution {
    public int[] productExceptSelf(int[] nums) {
        // Time Complexity : O( nums * nums)
// Space Complexity : O(nums)
// Did this code successfully run on Leetcode : Time Limit Exceedng

        
        if(nums == null || nums.length == 0) return new int[nums.length];
        
        int[] output = new int[nums.length];
        
        for(int i =0;i<nums.length;i++){
            output[i] = 1;
            for(int j =0;j<nums.length;j++){
                if(i!=j){
                    output[i] = output[i] * nums[j];
                }
            }
        }       
        return output;
        
    }
}