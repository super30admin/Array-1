using System;
namespace Algorithms
{
    /// Time Complexity : O(N) 
    // Space Complexity :O(1) 
    // Did this code successfully run on Leetcode :Yes
    // Any problem you faced while coding this :  No
    public class Array_ProductExceptSelf
    {
        public int[] ProductExceptSelf(int[] nums)
        {
            int length = nums.Length;
            int[] result = new int[length];


            result[0] = 1;

            for (int i = 1; i < length; i++)
            {
                result[i] = result[i - 1] * nums[i - 1];
            }
            int right = 1;

            for (int i = length - 1; i >= 0; i--)
            {
                result[i] = result[i] * right;
                right *= nums[i];
            }

            return result;
        }
    }
}
