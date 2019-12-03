// Time Complexity : O(n)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english:
// Do a forward pass on the given array and store the product of elements of left of each element into the result array. Assume runningProduct to be 1 for this.
// Do a backward pass on the given array and store the product of element on the right of each element into the result array. Assume runningProduct to be 1 for this.

class ArrayOfProduct {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        
        if (nums == null || nums.length ==0) {
            return result;
        }
        
        int runningProduct = 1, temp =1;
        
        //forward pass [1,1,2,6]
        for (int i=0; i< nums.length; i++) {
            runningProduct = runningProduct * temp;
            result[i] = runningProduct;
            temp = nums[i];
        }
        
        runningProduct =1;
        temp =1;
        
        //backward pass
        for (int j=nums.length-1; j>=0; j--) {
            runningProduct = runningProduct * temp;
            result[j] = result[j] * runningProduct;
            temp = nums[j];
        }
        
    return result;   
    }
}