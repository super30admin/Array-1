// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Using Running product approach get the running products of the array numbers from left to right
// and right to left. The product of each element of rProd1 with corresponding element of rProd2 gives the result.
public class Solution {
    public int[] ProductExceptSelf(int[] nums) {
        int[] rProd1 = new int[nums.Length];
        rProd1[0] = 1;
        // Left to Right
        for(int i = 1; i < nums.Length; i++) {
            rProd1[i] = rProd1[i-1] * nums[i-1];
        }
        
        //Right to Left
         int[] rProd2 = new int[nums.Length];
        rProd2[nums.Length - 1] = 1;
        for(int i = nums.Length - 2; i >= 0; i--) {
            rProd2[i] = rProd2[i+1] * nums[i+1];
        }

        int[] result = new int[nums.Length];
        //Result -> product of rProd1 & rProd2 with corresponding indexed elements
        for(int i = 0; i < nums.Length; i++) {
            result[i] = rProd1[i] * rProd2[i];
        }

        return result;
    }
}
