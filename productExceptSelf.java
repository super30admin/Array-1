// Time Complexity : O(N)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
//We first take the left products of the array and do the same for the right products. 
//In the end we add up both the products.
// Your code here along with comments explaining your approach

class Solution {
    public int[] productExceptSelf(int[] nums) {
        //base case to check if the array is empty
        if(nums == null || nums.length == 0)
            return new int[0];
        
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];
        
        //left products
        left[0] = 1;
        for(int i = 1; i < nums.length; i++){
            left[i] = left[i - 1] * nums[i - 1];
        }
        
        //right products
        right[nums.length - 1] = 1;
        for(int i = nums.length - 2; i >= 0; i--){
            right[i] = right[i + 1] * nums[i + 1];
        }
        
        //left * right
        for(int i = 0; i < nums.length; i++){
            right[i] = right[i]*left[i];
        }
        
        return right;
    }
}