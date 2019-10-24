/*
238. Product of Array Except Self
Time Complexity: O(n^2) where n is the length of the nums array
Space Complexity: O(1)
Did this code successfully run on Leetcode : TLE for one test case
*/

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] output = new int[nums.length];

        for(int i=0; i<nums.length; i++){
            int product = 1;
            for(int j=0; j<nums.length; j++){
                if(j!=i)
                    product = product * nums[j];
            }
            output[i] = product;
        }
        return output;
    }
}

/*  238. Product of Array Except Self
Time Complexity: O(n)
Space Complexity: O(n)
*/

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        int[] leftProduct = new int[nums.length];
        int[] rightProduct = new int[nums.length];

        for(int i=0; i < nums.length; i++){
            if(i==0)
                leftProduct[i] = 1;
            else
                leftProduct[i] = leftProduct[i-1] * nums[i - 1];
        }

        for(int i=nums.length - 1; i >= 0; i--){
            if(i==nums.length - 1)
                rightProduct[i] = 1;
            else
                rightProduct[i] = rightProduct[i+1] * nums[i + 1];
        }

        for(int i=0; i<nums.length; i++)
            result[i] = leftProduct[i] * rightProduct[i];

        return result;
    }
}

/* 238. Product of Array Except Self
Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        int runningProduct = 1, temp = 1;

        if(nums == null || nums.length == 0)
            return result;

        //forward pass of the array
        for(int i=0; i<nums.length; i++){
            result[i] = runningProduct * temp;
            runningProduct = result[i];
            temp = nums[i];
        }

        runningProduct = 1; temp = 1;
        for(int i=nums.length - 1; i>=0; i--){
            runningProduct = runningProduct * temp;
            result[i] *= runningProduct;
            temp = nums[i];
        }
        return result;
    }
}

