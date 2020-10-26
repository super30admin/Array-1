package Oct26;

class ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        
    // Time Complexity: O(n) where n is no.of elements in nums array. 
	// Because we are traversing nums array twice in two separate for loops, hence it is linear traversal.

	// Space Complexity: O(1).
    // Because we are using only one result array of length n. This is the resultant array being returned from the function, so it would not count for extra space.
	        
	// Did this code successfully run on Leetcode : Yes

	// Any problem you faced while coding this : No

	/* Approach: 
	 1) Calculate product of elements in given array from left to right except the current element,
     i.e. if you are on Ith element, take product of elements from 0 to I-1.
     2) Similarly, calculate product of elements in given array from right to left except the current element,so elements from last index in array to I+1.
     3) Multiply corresponding elements of steps 1 and 2 to find the solution.
     
     We can use one common array to hold results of all the 3 steps, which brings down space complexity from O(n) to O(1).
     
    */
        
        int[] result = new int[nums.length];
        int prod = 1;
        
        for(int i = 0 ; i < nums.length;i++) {
            result[i] = prod;
            prod = prod * nums[i];
        }
        
        prod = 1;
        for(int i = nums.length-1; i >= 0; i--) {
            result[i] = result[i] * prod;
            prod = prod * nums[i];
        }
        
        return result; 
    }
}