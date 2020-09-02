// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        if(nums.length == 0 || nums == null){
            return new int[0];
        }
        
        int[] output = new int[nums.length];
        
        int product = 1;
        
        //going from left to right
        for(int i = 0; i < nums.length; i++){
            output[i] = product;
            product = product * nums[i];
        }
        
        product = 1;
        //going from right to left and updating the products in place in the output array
        for(int i = nums.length-1; i >= 0; i--){
            output[i] = output[i] * product;
            product = product * nums[i];
        }
        
        return output;
    }
}