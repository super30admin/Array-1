// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes

// Three line explanation of solution in plain english
/**
 * running product without extra space.
 * since output array is not extra space, 
 * we will use the same array for calculating running product from left first
 * then reuse the same array for calculating running product from right
 */

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int [] res = new int[n];
        int rp =1;

        for (int i = 0; i< n; i++){
            res[i] = rp;
            rp *= nums[i];
        }
        rp =1;
        for (int j = n-1; j>=0; j--){
            res[j] = res[j] * rp;
            rp *= nums[j];
        } 
        return res;
    }
}