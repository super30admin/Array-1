using System;
using System.Collections.Generic;
using System.Text;

namespace ConsoleApp1
{
    public class ProductExceptSelf
    {
        /*
        * T.C: O(N): traversing through all elements of array
        * S.C: O(1): Since we are doing all opeartion in the return result so no extra space used. 
        */
        public static int[] GetProductExceptSelf(int[] nums)
        {
            //edge condition
            if (nums == null || nums.Length == 0)
                return new int[] { };

            int[] result = new int[nums.Length];
            int rp = 1;
            result[0] = 1;

            // get the product of element to the left of the index in array
            for (int i = 1; i < nums.Length; i++)
            {
                rp = rp * nums[i - 1];
                result[i] = rp;
            }

            rp = 1;  

            // get the product of element to the right side of the index and multiply with the previous result
            for (int j = nums.Length - 2; j >= 0; j--)
            {
                rp = rp * nums[j + 1];
                result[j] = result[j] * rp;
            }

            return result;
        }
    }
}
