/**
 * Q. Given an array nums of n integers where n > 1, return an array output such
 * that output[i] is equal to the product of all the elements of nums except
 * nums[i].
 * 
 * A. First calculate the product of all numbers to left of index(exclude number
 * at index), then calculate product of all numbers to right of index(exclude
 * number at index) and keep on multipying it with the product of left hand side of that index.
 * 
 * Time Complexity - O(n)
 * Space Complexity - O(n)
 * Runs on Leetcode - Yes
 */

class Solution {
    public int[] productExceptSelf(int[] nums) {

        if (nums.length == 0)
            return nums;

        int[] result = new int[nums.length];
        result[0] = 1;

        //product of all numbers left of index(excluding the number at index)
        for (int i = 1; i < nums.length; i++) {
            result[i] = result[i - 1] * nums[i - 1];
        }

        int rProd = 1;

        //product of all numbers right of index(excluding the index) and then multiplying 
        //the right side product with left side product
        for (int i = nums.length - 1; i >= 0; i--) {
            result[i] *= rProd;
            rProd *= nums[i];
        }

        return result;
    }
}