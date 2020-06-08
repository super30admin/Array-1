// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes


class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int[] output = new int[nums.length]; //Ouput array
        
        int temp = 1; //find left product of ith element, first element has no previous element, so left product of 1st element is 1
        for(int i = 0; i < nums.length; i++) {            
            output[i] = temp;         
            temp *= nums[i];
        }
        
        temp = 1;
        //using the left product array, and multiplying with the product of right elements we get the solution
        for(int i = nums.length-1; i >= 0; i--) { 
            output[i] *= temp;        
            temp *= nums[i];
        } return output; //return the array
    }
}
