// Time Complexity : O(N) where N is the left of the array
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english : (i) create an output array and a right counter. (ii) Initialize the 0th position of the output array with 1 and run a for loop on the nums array multiplying the output array's i-1 position with the nums array's ith position and store it in output array's ith position. (iii) Now initialize the right counter R to 1 and run another for loop now in the opposite direction such that output array's jth position is equal to its previous value into R where R is nothing but R into nums of j+1.

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] left = new int[nums.length];
        if(nums == null || nums.length == 0)
            return left;
        left[0] = 1;
        int R = 1;

        for(int i=0; i<nums.length-1; i++){
          // multuplying prev cell with nums[i]
            left[i+1] = left[i] * nums[i];
        }
        for(int j=nums.length-2; j>=0; j--){
          //r counter = multiply itself and nums[j+1]
            R *= nums[j+1];
          //R * L = output
            left[j] = R * left[j];  
        }

        return left;
    }
}
