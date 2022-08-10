// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

/*
 * We intend to calculate the product of left elements and right elements for an element in the array
 * We first calculate the product of left_elements for all the elements of the input array.
 * After that, we calculate the right_product of the elements and left_product of the elements.
 */


class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int[] product = new int[nums.length];
        
        int left_prod = 1;
        
        for (int i=0;i<nums.length;i++) {
            product[i] = left_prod;
            
            left_prod *= nums[i];
        }
        
        
        // calculate the left_product * right_product
        
        int right_prod = 1;
        
        for (int i=nums.length - 1; i>=0; i--) {
            product[i] = product[i] * right_prod;
            
            right_prod *= nums[i];
        }
        
        return product;
    }
}