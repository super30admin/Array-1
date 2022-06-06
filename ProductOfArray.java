package com.company;

    /*
       Time Complexity = O(n)
       Space Complexity = O(n)
   */


public class ProductOfArray {
    public int[] productExceptSelf(int[] nums) {

        int[] leftProduct = new int[nums.length];
        int[] rightProduct = new int[nums.length];

        leftProduct[0] = 1;
        rightProduct[nums.length - 1] = 1;

        for (int i = 1; i < nums.length; i++) {
            leftProduct[i] = leftProduct[i - 1] * nums[i - 1];
        }

        for (int i = nums.length - 2; i >= 0; i--) {
            rightProduct[i] = rightProduct[i + 1] * nums[i + 1];
            leftProduct[i] *= rightProduct[i];
        }

        return leftProduct;
    }
}