// Time Complexity : O(N)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        int rp = 1;
        //left pass
        result[0] = 1;
        for(int i = 1; i < nums.length; i++)
        {
            rp *= nums[i-1];
            result[i] = rp;
        }
        // right pass
        // reset running product
        rp = 1;
        for(int i = nums.length - 2; i>= 0; i--)
        {
            rp *= nums[i+1];
            result[i] *= rp;
        }
        return result;
    }
}