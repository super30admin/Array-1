// Time Complexity : O(n)
// Space Complexity : O(1) since we output array is output space and not auxilliary space
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
//Calculate the lefthand pass products and the right hand products

// Your code here along with comments explaining your approach

class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int n = nums.length;
        int[] output = new int[n];
        
        if(nums.length == 0 || nums == null)
            return output;
        int rp = 1;
        output[0] = 1;
        
        //calculating the left hand products 
        for(int i = 1;i < n;i++){
            rp = rp * nums[i-1];
            output[i] = rp;
            
        }
        
        //calculating the right hand products 
        rp = 1;
        for(int i = n-2;i >= 0; i--){
            rp = rp * nums[i+1];
            output[i] = rp * output[i];
        }
        return output;
        
    }
}