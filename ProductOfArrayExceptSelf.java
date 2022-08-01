// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach : Calculate left product and right products and place it in array

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        if (nums == null || nums.length == 0) return result;
        
        result[0] = 1;
        int rProduct = 1;
        
        // left product
        for (int i = 1; i < nums.length; i++) {
            rProduct *= nums[i-1];
            result[i] = rProduct;
        }
        
        rProduct = 1;
        
        // right product
        for (int i = n-2; i >= 0; i--) {
            rProduct *= nums[i+1];
            result[i] *= rProduct;
        }
        
        return result;
    }
}