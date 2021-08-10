using System;
using System.Collections.Generic;
using System.Text;

namespace LeetCodeSuper30
{
    class ProductExceptSelfLC
    {
        //Time Complexity: O(n)
        //Space Complexity: O(1)
        public int[] ProductExceptSelf(int[] nums)
        {
            if (nums == null || nums.Length == 0)
            {
                return new int[] { };
            }
            int[] result = new int[nums.Length];
            int rp = 1;
            result[0] = rp;
            for (int i = 1; i < nums.Length; i++)
            {
                rp = rp * nums[i - 1];
                result[i] = rp;
            }
             rp = 1;
            for (int i = nums.Length - 2; i >= 0; i--)
            {
                rp = rp * nums[i + 1];
                result[i] = rp * result[i]; ;
            }
            return result;
        }
    }
}
