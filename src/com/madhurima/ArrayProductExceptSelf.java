/*
    Time Complexity = O(n)
    Space Complexity = O(1) //result array we are returning, so won't contribute towards space complexity
    Did this code successfully run on Leetcode : yes
 */

package com.madhurima;

import java.util.Arrays;

public class ArrayProductExceptSelf {
}

class SolutionA {
    public int[] productExceptSelf(int[] nums) {
        if(nums == null || nums.length == 0){
            return nums;
        }

        //one approach is to take product of all elements and then divide by each element to get product without that element -> this includes division , can't use

        //another approach is brute force, where for each element , go over all elements and multiply if they aren't equal to the given element -> n2 complexity, can't use

        //applicable approach is to calculate the running product from left to right and then from right to left and multiply it

        int n = nums.length;
        int rp = 1;
        int[] result = new int[n];

        //left to right, keeping 0th index as rp, calculating running product standing on 1st index.
        result[0] = 1;
        for(int i = 1; i < n; i++){
            rp = rp * nums[i-1];
            result[i] = rp;
        }

        //right to left, calculating running sum standing at 2nd last index
        rp = 1;
        for(int i = n-2; i >= 0; i--){
            rp = rp * nums[i+1];
            result[i] = result[i] * rp;
        }

        return result;
    }

    public static void main(String[] args) {
        SolutionA s = new SolutionA();
        int[] nums = {1,2,3,4};
        System.out.println(Arrays.toString(s.productExceptSelf(nums)));
    }
}