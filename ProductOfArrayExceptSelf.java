// Time Complexity :O(n)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode :Yes
// Three line explanation of solution in plain english
// In this approach we maintain two arrays a left array and a right array.
// In the left array we store the product of all the numbers to the left of any element in the input array.
// In the right array we store the product of all the numbers to the right on any element in the input array.
// Finally we multiply the elements at each index from left and right and return that as the answer.

class Solution {
    public int[] productExceptSelf(int[] nums) {
      
      
      
      int[] leftProd = new int[nums.length];
      int[] rightProd = new int[nums.length];
      
      int[] result = new int[nums.length];
      
      leftProd[0]=1;
      rightProd[nums.length-1]=1;
      
      for(int i=1;i<nums.length;i++)
      {
        leftProd[i] = nums[i] * leftProd[i-1];
      }
      
      for(int i=nums.length-2;i>=0;i--)
      {
        rightProd[i] = nums[i] * rightProd[i+1];
      }
      
      for(int i=0;i<nums.length;i++)
      {
        result[i] = leftProd[i] * rightProd[i];
      }
      
      return result;
      
        
    }
}