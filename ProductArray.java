// Time Complexity : O(n) where 'n' is the length of the array.
// Space Complexity : O(1) where space is constant
// Did this code successfully run on Leetcode : Yes, https://leetcode.com/problems/product-of-array-except-self/description/
// Any problem you faced while coding this : No

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int rp = 1;
        int[] result = new int[n];
        result[0] = 1;
        // left product
        for(int i=1;i<n;i++){
            rp = rp*nums[i-1];
            result[i] = rp;
        }

        //right product
        rp = 1;
        for(int i=n-2;i>=0;i--){
            rp = rp*nums[i+1];
            result[i] = rp*result[i];
        }
        return result;
    }
}
