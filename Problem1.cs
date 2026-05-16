// Time Complexity : O(n) where n is the total length of nums array
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

public class Solution
{
    public int[] ProductExceptSelf(int[] nums)
    {
        int[] result = new int[nums.Length];
        result[0] = 1;
        int product = 1;

        for (int i = 1; i < nums.Length; i++)
        {
            product *= nums[i - 1];
            result[i] = product;
        }

        product = 1;

        for (int i = nums.Length - 2; i >= 0; i--)
        {
            product *= nums[i + 1];
            result[i] *= product;
        }

        return result;
    }
}