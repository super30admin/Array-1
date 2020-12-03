// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach

class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        if(nums == null || nums.length == 0) {
            return new int[0];
        }
        int[] result = new int[nums.length];
        int rp = 1, temp = 1;
        
        for(int i = 0; i < nums.length; i++) {
            rp *= temp;
            result[i] = rp;
            temp = nums[i];
        }
        
        temp = 1;
        rp = 1;
        
        for (int i = nums.length - 1; i>= 0; i--) {
            rp *= temp;
            result[i] = result[i] * rp;
            temp = nums[i];
        }
        return result;
        
    }
}