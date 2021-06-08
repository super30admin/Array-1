// Time Complexity : O(2n) == O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

/**
 * For every element, we have to find the left multiplication of elements and multiplication of right elements
 * After that, we can multiply both left_multiplicationa nd right multiplication.
 * This will give us the multiplication of all the elements except itself.
 */

// Problem: https://leetcode.com/problems/product-of-array-except-self/

// Approach

/**
 * We maintain an array with multiplication of left elements.
 * For each of the array elements, we calculate the multiplication of elements on the left side
 * Next, we calculate the elements multiplication on the right and multiply both left multiplication and right_multiplication
 */

class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int[] mul_table = new int[nums.length];
        
        int running_mul = 1;
        
        // update the multiplication table with all the product of left elements
        for(int i=0;i<mul_table.length;i++) {
            mul_table[i] = running_mul;
            
            running_mul *= nums[i];
        }
        
        // maintain a running multiplication of right elements
        
        int right_mul = 1;
        
        for (int j=mul_table.length - 1;j>=0;j--) {
            mul_table[j] = mul_table[j] * right_mul;
            
            right_mul *= nums[j];
        }
        
        return mul_table;
    }
}
