// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
/*
 * We can use brute force with n^2, to optimize we can utilize running product similar to running sum.
 * Calculate running product from left to right, then right to left and multiply it with the existing product in the result array.
 */

public class ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        if(nums == null || nums.length < 1) {
            return new int[]{};
        }
        int rProduct = 1;
        int[] product = new int[nums.length];
        product[0] = rProduct;
        for(int i = 1; i < nums.length; i++) {
            rProduct = rProduct * nums[i - 1];
            product[i] = rProduct;
        }

        rProduct = 1;
        for(int i = nums.length - 2; i >= 0; i--) {
            rProduct = rProduct * nums[i + 1];
            product[i] = rProduct * product[i];
        }
        return product;
    }
}
