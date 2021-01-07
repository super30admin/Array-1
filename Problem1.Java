// Time Complexity : O(n) where n is the number of elements in array
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english - 
// 1. Create an array with same lengeth as of input.
// 2. Iterate from left to right calculating the product of only left elements in array and storing inside the new array which we created in step 1.
// 3. Repeart step 2 but this time from right to left and also while we rplace the new array items, just multiply by earlier existing item in the array. Return result.


class Solution {
    public int[] productExceptSelf(int[] nums) {
      //check if array is null or empty, if yes, return empty array.
        if(nums == null || nums.length == 0) return new int [0];        
        int [] result = new int[nums.length];
        int rp = 1;
        result [0] = 1;
      //forward pass
        for(int i=1; i < nums.length; i++){
            rp = rp * nums[i-1];
            result[i] = rp;
        }
      // reset running product to 1;
        rp = 1;
      //backward pass
        for(int i= nums.length - 2; i >= 0; i--){
            rp = rp * nums[i+1];
            result[i] = result[i] * rp;
        }
        
        return result;
    }
}

// Your code here along with comments explaining your approach
