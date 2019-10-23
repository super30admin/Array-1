// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int[] output = new int[nums.length];
        if(nums == null || nums.length == 0) return output;
        
        int running =1;
        int temp =1;
    
        for(int i=0;i<nums.length;i++){ //forward pass
            
            running *= temp;
            output[i] = running;
            temp = nums[i];
            
        }
        
        running =1;
        temp=1;
        
         for(int i=nums.length-1;i>=0;i--){ //backward pass
            
            running *= temp;
            output[i] = output[i] * running;
            temp = nums[i];
            
        }
        return output;
    }
}