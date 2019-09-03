// Solution 1 - Base Approach 

/**
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

class Solution {
  public int[] productExceptSelf(int[] nums) {

      int len = nums.length;

      int[] left = new int[len];
      int[] right = new int[len];

      int[] result = new int[len];

      left[0] = 1;
      for (int i = 1; i < len; i++) left[i] = nums[i - 1] * left[i - 1];

      right[len - 1] = 1;
      for (int i = len - 2; i >= 0; i--) right[i] = nums[i + 1] * right[i + 1];

      for (int i = 0; i < len; i++) result[i] = left[i] * right[i];

      return result;
  }
}


 // Solution 2 - Optimized For Space

 /**
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

 class Solution {
  public int[] productExceptSelf(int[] nums) {
      if (nums == null || nums.length == 0) return new int[0];   
      
      int len = nums.length;
      int[] result = new int[len];
      
      result[0] = 1;
      
      for (int i = 1; i < len; ++i) result[i] = result[i-1] * nums[i-1];
      for (int i = len-2, t = 1; i >= 0; --i) result[i] *= (t *= nums[i+1]);

      return result;
  }
}