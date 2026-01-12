// Time Complexity :O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english : First, the code initializes an output array of the same size as the input array nums to store the result, and a variable runMul to keep track of running products. 
// The first loop goes left to right through the array, setting each output[i] to the product of all elements before index i.
// runMul is updated at each step by multiplying it with the current number.The second loop goes right to left, multiplying each output[i] by the product of all elements after index i. 
// Again, runMul is updated at each step to accumulate the running product from the right.Finally, the output array contains the product of all elements of nums except the element itself at each index, and it is returned.


class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] output = new int[n];
        int runMul =1;
        for(int i=0; i<n; i++) {
            output[i] = runMul;
            runMul *= nums[i];
            
        }
        
        runMul = 1;
        for(int i=n-1; i>=0; i--) {
            output[i] *= runMul;
            runMul *= nums[i]; 
        }
        return output;
    }
}