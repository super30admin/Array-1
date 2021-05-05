// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

/*
    In the first iteration we find the left product of that element.
    In the second iteration we find the right product of the element.
*/

class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int n = nums.length;
        int [] result = new int[nums.length];
        
        if (nums == null || nums.length == 0) return result;
        
        int rp = 1;
        result[0] = 1;
        
        for (int i=1; i<n; i++){
            rp = rp * nums[i-1];
            result[i] = rp;
        }
        
        rp=1;
        for (int i = n-2; i>=0; i--){
            rp = rp * nums[i+1];
            result[i] = result[i] * rp;
        }
        return result;
    }
}