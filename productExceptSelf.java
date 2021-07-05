// Time Complexity : O(N)
// Space Complexity :
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        if(nums == null || nums.length == 0)
            return new int[]{0};
        
        //left to right
        int[] LtoR = new int[nums.length];
        
        //right to left
        int[] RtoL = new int[nums.length];
        
        for(int i=0; i<nums.length; i++){
            if(i==0){
                LtoR[i] = 1;
            } else {
                LtoR[i] = nums[i-1] * LtoR[i-1];  
            }      
        }
        
        for(int i=nums.length-1; i>=0; i--){
            if(i == nums.length-1){
                RtoL[i] = 1;
            } else {
                RtoL[i] = nums[i+1] * RtoL[i+1];
            }
            
        }
        
        for(int i=nums.length-1; i >=0; i--){
            nums[i] = LtoR[i] * RtoL[i];
        }
        
        return nums;
    }
}