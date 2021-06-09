// Time complexity : O(2n) = O(n);
// Space complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english : 
// * Intially runningProduct is initialised to 1. Then traverse the arr from the start to end(forward pass) and compute the product of all the element left to the current element. 
// * Save each runningProduct in resultant arr. 
// * Now reset runningProduct 1. Traverse the arr from back to front and comute the running product of the right to the current element and multiply with the corresponding 
// element of the resultant arr.


class Solution {
    public int[] productExceptSelf(int[] nums) {
      int[] result = new int [nums.length];
      //edge case
      if(nums == null || nums.length == 0) {
        return result;
      }
      
      result[0] = 1;
      int rProduct = 1;
      //left side product of the number
      for(int i=1; i< nums.length;i++) {
        rProduct = rProduct * nums[i-1];
        result[i] = rProduct;
      }
      
      result[nums.length-1] *= 1;
      rProduct = 1;
      int n = nums.length-1;
      //right side product of the number 
      for(int j= n-1; j >= 0; j--) {
        rProduct = rProduct* nums[j+1];
        //multiply left(stored in the result arr) * right side product
        result[j] = result[j]*rProduct;
         
      }
      return result;
    }
}