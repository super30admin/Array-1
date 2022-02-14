// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Approach: we crreate two arrays, left and right. Left has the product of the numbers
// from left upto the current index and the right has product of numbers from right upto
// the current index. Our result is just the multiplication of these two. 
// We optimize the space by removing these two different arrays and updating the result 
// array by using an extra variable R.

// LC- 238 Product of array except self

public class ProductOfArrayExceptSelf {
  public int[] productExceptSelf(int[] nums) {
    int len = nums.length;
    int[] result = new int[len];
    result[0] = 1;

    for (int i = 1; i < len; i++) {
      result[i] = result[i - 1] * nums[i - 1];
    }

    int R = 1;
    for (int j = len - 1; j >= 0; j--) {
      result[j] = result[j] * R;
      R = R * nums[j];
    }

    return result;
  }
}
