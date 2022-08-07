//time complexity: O(n)
//space complexity: O(n)
// Did this code successfully run on Leetcode : Yes

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length; 
        int[] result = new int[n];
        
        //checking if array is empty
        if(nums.length == 0 || nums == null) return result; 
        
        int rp=1; //a variable to handle the right running product 
        result[0] = 1; 
        
        //finding the running product through left 
        for(int i=1; i<n  ; i++){
            rp = rp * nums[i-1];
            result[i] = rp; 
            
        }
        
        //right pass
        //resetting the rp to 1; 
        rp =1;
        
        for(int i= n-2; i>=0; i--){
            rp = rp * nums[i+1];
            result [i] = result[i] * rp; 
        }
        return result; 
    }
}