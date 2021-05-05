//Time Complexity : O(n)
//Space Complexity : O(1). No extra space used
//Did this code successfully run on Leetcode : Yes
//Any problem you faced while coding this : No

class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int[] result = new int[nums.length];
        
        int rprod = 1;
        result[0] = 1;
        
        for(int i = 1; i < nums.length; i ++){
            
            result[i] =  nums[i-1] * rprod;
            rprod = result[i];
        }
        
   /*     for(int i = 0; i < result.length; i ++){
        System.out.println(result[i]);
        } */
        
        rprod = 1;
        for(int i = nums.length - 2; i >= 0 ; i --){
            
            rprod = nums[i+1] * rprod;
            result[i] = result[i] *  rprod;
            
        }
        
        return result;
        
    }
}