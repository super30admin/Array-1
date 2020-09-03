/*
 * #238. Product of Array Except Self
 * 
 * Given an array nums of n integers where n > 1, return an array output such that output[i] is equal to the product of all the elements of nums 
 * except nums[i].

Example:

Input: [1,2,3,4]

Output: [24,12,8,6] 

Constraint: It's guaranteed that the product of the elements of any prefix or suffix of the array (including the whole array) fits in a 32 bit integer.

Note: Please solve it without division and in O(n).

Follow up: Could you solve it with constant space complexity? (The output array does not count as extra space for the purpose of space complexity analysis.)

 */



/*
 * Time Complexity: O (N) -> Two for loops -> O (N) + O (N) -> O (2N) -> O (N)
 * 
 * Space Complexity: O (1) -> returning the same array as output which we created so no extra space
 * 
 * Did this code successfully run on leetcode: Yes
 * 
 * Any problem you faced while coding this: Not really
 * 
 */


package com.s30.edu.array1;

public class ProductArray {
	
	public int[] productExceptSelf(int[] nums) {
        /*
        * Base condition
        * If length of input array is zero, return new empty array
        */
        if(nums == null || nums.length == 0){
            return new int[0];
        }
        
        // Create a output array with same length as input array
        int[] output = new int[nums.length];
        
        // Initialize the product to 1
        int product = 1;
        
        /*
        * Calculate the left product of each element and put that in output array
        * For first element, put 1 in output array since the left product will be 1 as there is no previous element
        * Then, calculate the left product for next element by multiplying nums[i] (current element) with previous product
        * Increment the ith index
        * And, update the left product calculated earlier in output array for current element 
        */
        for(int i = 0; i < nums.length; i++){
            output[i] = product;
            product = product * nums[i];
        }
        
        product = 1; // Reset the product to 1
        
        /*
        * Now, we need right product as well for every element in input array
        * Instead of creating another array to store right product of every element,
        * We will calculate the right product for each element and update the same output array with the final answer -> i.e; (left product * right product) for every element
        */
        
        /*
        * Now, to calculate right product for every element and multiply it with left product to merge the final answer in output array itself
        
        * First, we start with rightmost element in input array, since we need right product
        * For last element, we know right product will be 1 since we dont have any element to the right
        * So, for last element, we have right product as 1, and left product in output array
        * We update the output array by multiplying the right product with left product (value at current index in output array) and store the result in output array itself
        *
        *Then, calculate the right product for previous element by multiplying previous product with element at current index in input array
        * Decrement the index -> go to previous element 
        * Multiply that element's right product with left product (value in output array) and store the updated value in output array itself
        * Repeat these steps for all elements 
        */
        for(int i = nums.length-1; i >= 0; i--){
            // final answer for every element = left product * right product
            output[i] = output[i] * product;
            
            // right product for previous element = previous product * current element in input array 
            product = product * nums[i];
        }
        
        return output; // return the output array
        
        
    }

}
