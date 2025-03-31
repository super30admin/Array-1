/*
 * # Array-1

## Problem 1

Given an array nums of n integers where n > 1, return an array output such that output[i] is equal to the product of all the elements of nums except nums[i].

Example:

Input: [1,2,3,4]
Output: [24,12,8,6]
Note: Please solve it without division and in O(n).

Follow up:
Could you solve it with constant space complexity? (The output array does not count as extra space for the purpose of space complexity analysis.)

 */
public class ArrayProductExceptSelf {
    public int[] productExceptSelf(int[] nums) {

        /** 
Brute force approach will fail with time limit exceeded.

        int[] res = new int[nums.length];
        for(int i=0; i< nums.length; i++){
            int product = 1;
            for(int j=0; j< nums.length; j++){
                if(i==j)
                    continue;
                else{
                    product = product * nums[j];
                }
            }
            res[i] = product;
        }
        return res;
    }
    */

/**
Optimizing it with leftProduct and RightProduct 
We can find the array product except self by getting the product of 
left side[Left SubArray except current] of it and right side[Right SubArray except current] of it. */
        int [] leftProduct = new int[nums.length];
        leftProduct[0] = 1;
        int [] rightProduct = new int[nums.length];
        rightProduct[nums.length -1] = 1;
        int rightProductValue = 1;
        int leftProductValue = 1;
        for(int i =1; i< nums.length; i++){
                leftProductValue = nums[i-1] * leftProductValue;
                leftProduct[i] = leftProductValue;
            }
            
        for(int i =nums.length-2; i>=0; i--){
                rightProductValue = nums[i+1] * rightProductValue;
                rightProduct[i] = rightProductValue;
            }
        
        for(int i=0; i<nums.length; i++){
                nums[i] = leftProduct[i] * rightProduct[i];
        }
        return nums;
      }
}
