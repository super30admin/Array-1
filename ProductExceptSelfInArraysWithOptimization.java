// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

public class ProductExceptSelfInArraysWithOptimization {
         public static int[] productExceptSelf(int[] nums) {

            int[] result = new int[nums.length];
            result[0] = 1;
            int rp = 1;

            for(int i=1; i<nums.length; i++)
            {
                result[i] = nums[i-1] * rp;
                rp = result[i];
            }

            rp = 1;
            for(int i=nums.length-2; i>=0; i--)
            {
                rp = nums[i+1] * rp;
                result[i] = result[i] * rp;
             }
                return result;

        }
        public static void main(String[] args) {
            int[] nums = {1,2,3,4};
            System.out.println(productExceptSelf(nums));
        }
    }
