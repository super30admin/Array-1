/**
 * Time Complexity: O(N)
 * Space Complexity: O(1)
 * LeetCode: Y (https://leetcode.com/problems/product-of-array-except-self/)
 * Approach:
    Initialize an output array
    Start filling the output array where each element is the product of all the values on its left. 
    So at this time output[0] is 1 because there are no elements to the left of the 0th element
    Populate the output array where value at each index is the product of all the numbers to its left
    Now calculate runningProduct from the right and mulitply each repsective element of an array with runningProduct
 */

class Solution {
    public int[] productExceptSelf(int[] nums) {
        // Initialize output array
        int[] output = new int[nums.length];
        // Populate output array with product of numbers to the left
        // No element to the left of 0th element
        output[0] = 1;
        
        // Populate the output array with product of numbers to the left
        for(int i = 1 ; i < output.length ; i++) {
            output[i] = output[i - 1] * nums[i - 1];
        }
        
        // Variable to store the runningProduct from right
        int runningProduct = 1;
        
        // Enhance the putput array with prodict of numbers to the right
        for(int i = output.length - 2 ; i >= 0 ; i--) {
            // Update runningProduct
            runningProduct = runningProduct * nums[i + 1];
            // Enhance the ith element of output array with right runningProduct
            output[i] = output[i] * runningProduct;
           
        }
        
        return output;
    }
}
