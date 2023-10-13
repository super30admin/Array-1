// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

public class ProductOfArrayExceptSelf
{
    class Solution {
        public int[] productExceptSelf(int[] nums)
        {
            int[] ans = new int[nums.length];
            int runningProduct = 1;

            for(int i = 0; i < nums.length ; i++)
            {
                ans[i] = runningProduct;
                runningProduct = runningProduct * nums[i];
            }
            runningProduct = 1;
            for(int i = nums.length-1; i >= 0 ; i--)
            {
                ans[i] = ans[i] * runningProduct;
                runningProduct = runningProduct * nums[i];
            }
            return ans;
        }
    }
}
