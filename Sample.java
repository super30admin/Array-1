// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :YEs
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] ans= new int[nums.length];
        if(nums==null||nums.length==0)
            return null;
        int rp=1;
        int tp=1;
        for(int i=0;i<nums.length;i++)
        {
            rp=rp*tp;
            ans[i]=rp;
             tp=nums[i];
        }
        rp=1;
        for(int i=nums.length-2;i>=0;i--)
        {
             rp=rp*tp;
            ans[i]=ans[i]*rp;
             tp=nums[i];
        }
        return ans;
    }
}
---------------------------------------------------------------------------------------------------------------------------
