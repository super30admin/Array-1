/*
 * Given an array nums of n integers where n > 1, return an array output such that output[i] is equal to the product of all the elements of nums except nums[i].

Example:

Input: [1,2,3,4] Output: [24,12,8,6] Note: Please solve it without division and in O(n).

Follow up: Could you solve it with constant space complexity? (The output array does not count as extra space for the purpose of space complexity analysis.)

 */


/*
 * Time Complexity: O (N^2)
 * 
 * Space Complexity: O (1)
 * 
 * Did this code successfully run on leetcode: No leetcode link given
 * 
 * Any problem you faced while coding this: Not really
 * 
 */


package com.s30.edu.array1;

import java.util.Arrays;

public class ProductArray {
	
	public static int computeProduct(int[] nums, int index) {
		int product = 1; // Initialize the product to 1
		
		// Base condition, number of integers in 'nums'> 1
		if(nums.length < 2) {
			return 0;
		}
		
		// Traverse through the input array
		for(int i = 0; i <= nums.length-1; i++) {
			
			// if index of input and output array is same and index is less than length - 1
			if(i == index && index < nums.length-1) {
				i++; // skip the element at that index, increment 'i'
			}
			
			// If input and output array index is not same
			if(i != index) {
				product *= nums[i]; // then, compute the product
			}
		}
		
		return product; // return the product 
		
	}
	
	public int[] productArray(int[] nums) {
		
		// Create output array of same length as 'nums'
		int[] output = new int[nums.length];
		
		// Traverse through the output array to fill it with elements
		for(int i = 0; i <= output.length-1; i++) {
			output[i] = ProductArray.computeProduct(nums, i); // Call the computeProduct function to compute the value for ith index in output array
		}
		
		return output; // return the output array
		
	}
	
	// main method
	public static void main(String[] args) {
		ProductArray pa = new ProductArray();
		
		int[] nums = {1,2,3,4}; // Input array
		int[] outputArray = pa.productArray(nums);
		System.out.println(Arrays.toString(outputArray)); // print the output array
		
	}

}
