// Time Complexity : O(n) n is length of array
// Space Complexity :O(1)  
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class ProductExceptSelf {
    public int[] productExceptSelf(int[] nums) {
       int[] ans = new int[nums.length];
        
        int right = 1;
        ans[0] = 1;
        for(int i=1;i<nums.length;i++)
        {
            ans[i] = ans[i-1]*nums[i-1];
        }
        
        for(int i=nums.length-1;i>=0;i--)
        {
            ans[i] = ans[i]*right;
            right = right*nums[i];
        }
        return ans;
    }
}