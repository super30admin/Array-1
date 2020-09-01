// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
/*
Create a left array with the consecuritve product from left to right
then repeat the same from right to left and 
multiply both arrays
*/

class Solution {
    public int[] productExceptSelf(int[] nums) { 
        if(nums==null || nums.length ==0)
            return new int[0];
        
        int res[] = new int[nums.length];
        int product = 1;
        
        // Left side
        for(int i=0; i< nums.length; i++){
            res[i] = product;
            product = product * nums[i];
        }
        
        product = 1;
        // Right side
        for(int i=nums.length-1; i>= 0; i--){
            res[i] = res[i] * product;
            product = product * nums[i];
        }
        
        return res;
    }
}