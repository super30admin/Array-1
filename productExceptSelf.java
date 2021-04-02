/*
Runtime complexity - O(N) as we traverse the loop twice O(2N) is equal to O(N)
Space complexity - O(1) as we only use an array for the final result
*/

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] ans=new int[nums.length];
        ans[0]=1;
        int right=1;
        
        for(int i=1;i<nums.length;i++)
        {
            ans[i]=ans[i-1]*nums[i-1];
        }
        for(int i=nums.length-1;i>=0;i--)
        {
            ans[i]=ans[i]*right;
            right=right*nums[i];
        }        
        return ans;
    }
}
