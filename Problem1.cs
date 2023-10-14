public class Solution
    {
        // Time Complexity : O(n)
        // Space Complexity : O(1)
        // Did this code successfully run on Leetcode : Yes
        // Any problem you faced while coding this : No
        public int[] ProductExceptSelf(int[] nums)
        {
            int n = nums.Length;
            int runningProduct = 1;
            int[] result = new int[n];

            result[0] = 1;

            //Calculate the product of all elements to the left of each element
            for(int i = 1; i < n; i++)
            {
                runningProduct = runningProduct * nums[i - 1];
                result[i] = runningProduct;
            }

            runningProduct = 1;//reset

            //calculate the product of all elements to the right of each element
            for (int i = n - 2; i >= 0; i--)
            {
                runningProduct = runningProduct * nums[i + 1];
                result[i] = result[i] * runningProduct; //since we are saving the right product in the same result array multiple with the left product
            }

            return result;

        }
    }
