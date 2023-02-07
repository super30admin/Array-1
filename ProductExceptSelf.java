/*
 * Time Complexity : O(n)
 * Space Complexity : O(1)
 * Did this code successfully run on Leetcode : Yes
 * Any problem you faced while coding this : No
 * 
 * Approach : In this problem we multiply the product numbers except the element separately. For a given element we find the left half of the product and the right half 
 * of the product separately and then multiply them together. We first iterate through the array and for every element we get the product of the all the previous elements, i.e, running product.
 * Then we traverse the array in the reverse order and get the running products of the elements after the current element and multiply this running product and the previous running product together
 * 
 * https://leetcode.com/problems/product-of-array-except-self/description/
 */

class ProductExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        int rProduct = 1;
        result[0]=1;
        for (int i=1;i<nums.length;i++){
            rProduct *=nums[i-1];
            result[i] = rProduct;
        }
        rProduct = 1;

        for (int i=nums.length-2;i>=0;i--){
            rProduct *=nums[i+1];
            result[i]*=rProduct;
        }
        return result;
    }
}