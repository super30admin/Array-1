// Time Complexity :O(m x n)
// Space Complexity : O(m x n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
    public int[] productExceptSelf(int[] nums) {
        if (nums==null || nums.length==0) return nums;
        int n = nums.length;
        int [] result =new int[n];
         int rp=1;
        result[0]=1;
      
        // left to right
        for( int i=1; i<n; i++){
        rp*= nums[i-1];
        result [i]=rp;
        }
        // right to left
        rp=1;
        for( int i=n-2; i>=0; i--){
            rp*=nums[i+1];
            result[i] *= rp;
        }
        return result;
    }
}