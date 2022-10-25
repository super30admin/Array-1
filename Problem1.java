// Time Complexity : 1ms (faster than 100% submissions)
// Space Complexity : 50.3 MB (less than 94.04 submissions)
// Did this code successfully run on Leetcode : YES
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach

class Solution {
    public int[] productExceptSelf(int[] nums) {

        int len = nums.length;
        int[] out = new int[len];

        int prefixProduct = 1;

        for (int i = 0; i < len; i++) {
            out[i] = prefixProduct;
            prefixProduct *= nums[i];
        }

        int suffixProduct = 1;

        for (int i = nums.length - 1; i > -1; i--) {
            out[i] *= suffixProduct;
            suffixProduct *= nums[i];
        }

        return out;
    }
}