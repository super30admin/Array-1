class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int rp=1;
        
        int[] ans=new int[nums.length];
        
        ans[0]=rp;
        
        for(int i=1;i<nums.length;i++)
        {
            rp*=nums[i-1];
            ans[i]=rp;
            
        }
        
        rp=1;
        
        for(int i=nums.length-2;i>=0;i--)
        {
            rp*=nums[i+1];
            ans[i]*=rp;
        }
        
        return ans;
        
    }
}


// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no
