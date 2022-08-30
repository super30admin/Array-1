// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :


class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n= nums.length;
        int[] result =new int[n];
        if(nums == null || nums.length == 0) return result; //checking if the array is null
        int rp=1;
        result[0] = 1;
        // calculating the left product
        for(int i=1; i<n;i++){
            rp = rp * nums[i-1];
            result[i] = rp;
        }
        rp = 1;
        for( int i = n-2; i>=0; i--)
        {
            rp = rp* nums[i+1];
            result[i] = result[i]*rp;
        }
        return result;
    }
}