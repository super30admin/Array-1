// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes


class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int[] result = new int[nums.length];
        
        // prefix product until i-1 element
        int prefixProd = 1;
        
        for (int i = 0; i < nums.length; i++) {
            result[i] = prefixProd;
            prefixProd = prefixProd * nums[i];
        }
        
        // suffix product from i+1 to end of array
        int suffixProd = 1;
        for (int i = nums.length-1; i>= 0; i--) {
            result[i] = result[i] * suffixProd;
            suffixProd = suffixProd * nums[i];
        }
        return result;
    }
}
