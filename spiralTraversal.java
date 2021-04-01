// Time Complexity :O(M*N)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :Faced issue traversing through the array.Got the hang of it after several Test case validation

// Your code here  with comments explaining your approach

class Solution {
  public List<Integer> spiralOrder(int[][] matrix) {
    List<Integer> result = new ArrayList<>();
    if (matrix.length == 0)
      return result;

    int top = 0;
    int bottom = matrix.length - 1;
    int left = 0;
    int right = matrix[0].length - 1;

    while (top <= bottom && left <= right) {
      // Start adding the top row
      for (int col = left; col <= right; col++) {
        result.add(matrix[top][col]);
      }
      // push the top row down
      top++;
      // Add the rigt row
      for (int row = top; row <= bottom; row++) {
        result.add(matrix[row][right]);
      }
      // push the left col in
      right--;
      // Recheck to prevent readding the same value again
      if (top <= bottom) {
        for (int col = right; col >= left; col--) {
          result.add(matrix[bottom][col]);
        }
        bottom--;
      }
      // Recheck to prevent readding the same value again
      if (left <= right) {
        for (int row = bottom; row >= top; row--) {
          result.add(matrix[row][left]);
        }
        left++;
      }

    }
    return result;
  }
}