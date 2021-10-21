// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes (https://leetcode.com/submissions/detail/575019001/)
//calculate left sum and store it in the result array, calculate right sum and multiply the left sum in the same array.
using System;

namespace ProductExceptSelf
{
    class Program
    {
        public static int[] ProductExceptSelf(int[] nums) {
            
            int len = nums.Length;
            int[] sol = new int[len];
            
            int product = 1;
            sol[0] = 1;
            for(int i=1; i < len; i++) { 
                sol[i] = nums[i-1] * product;
                product = sol[i];
            }
            
            product = 1;
            for(int i=len-2; i >= 0; i--) { 
                sol[i] = sol[i] * nums[i+1] * product;
                product = product * nums[i+1];
            }
            
            return sol;

        /*
            // Time: O(n)
            // Space: O(2n)
           
            int[] leftProduct = new int[len];
            int[] rightProduct = new int[len];
           
            
            int product = 1;
            //left prodcut
            leftProduct[0] = 1;
            for(int i=1; i < len; i++) {
                leftProduct[i] = product * nums[i-1];
                product = leftProduct[i];
            }
            
            //right product
            product = 1 ;
            rightProduct[len-1] = 1;
            for(int i=len-2; i >= 0; i--) {
                rightProduct[i] = nums[i+1] * product;
                product = rightProduct[i];
            }
            
            for(int i = 0; i < len; i++) {
                sol[i] = leftProduct[i] * rightProduct[i];
            }
            return sol;
        */
          
    }
        static void Main(string[] args)
        {
            int[] nums = new int[]{4, 3, 2, 1, 2};
            int[] sol = Program.ProductExceptSelf(nums);
            for(int i=0; i < sol.Length; i++) {
                Console.WriteLine(sol[i]);           
            }
            
        }
    }
}
