// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

/*
 * I iterate through the array once and maintain the prefix product (product of all the elements occurring before the current element).
 * For the first element, the prefix product is 1. Similarly, I calculate the postfix product and multiple it with the prefix
 * product of each element respectively. 
 */

// Your code here along with comments explaining your approach

class Solution1 {
    public int[] productExceptSelf(int[] nums) {
        int []ans = new int[nums.length];
        ans[0]=1;
        int rp = 1;
        for(int i=1;i<nums.length;i++)
        {
            rp=rp*nums[i-1];
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