// Leetcode Problem : https://leetcode.com/problems/product-of-array-except-self/description/
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
/*
 * I create a new array ans of length same as that of nums and set ans[0] = 1 initially. I set prod as 1 and traverse from
 * i = 1 to nums.length-1 calculating prod as prod*nums[i-1] and ans[i] = prod at every iteration. Similarly, I set prod
 * as 1 again and iterate from i = nums.length-2 to 0 and set prod as prod*nums[i+1] and set ans[i] = ans[i]*prod. I return
 * ans at the end.
 */
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int ans[] = new int[nums.length];
        ans[0]=1;
        int prod=1;
        for(int i=1;i<nums.length;i++)
        {
            prod*=nums[i-1];
            ans[i]=prod;
        }
        prod=1;
        for(int i=nums.length-2;i>=0;i--)
        {
            prod*=nums[i+1];
            ans[i]*=prod;
        }
        return ans;
    }
}