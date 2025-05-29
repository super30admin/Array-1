// TC: O(m*n)
// SC: O(1)
// Approach: Use four pointers top, left, bottom, right to define boundary. Traverse from left to right, top to bottom
// right to left, and bottom to top. Shrink boundary after each pass to move inward. Continue till all elements are added.

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
  public List<Integer> spiralOrder(int[][] matrix) {
    int m = matrix.length;
    int n = matrix[0].length;
    List<Integer> result = new ArrayList<>();
    int top = 0, bottom = m - 1, left = 0, right = n - 1;
    helper(matrix, top, left, bottom, right, result);
    return result;
  }

  private void helper(int[][] matrix, int top,
      int left, int bottom, int right, List<Integer> result) {
    // base
    if (left > right || top > bottom)
      return;

    // logic
    // top row
    for (int j = left; j <= right; j++) {
      result.add(matrix[top][j]);
    }
    top++;
    // right col
    for (int i = top; i <= bottom; i++) {
      result.add(matrix[i][right]);
    }
    right--;

    if (top <= bottom) {
      // bottom row
      for (int j = right; j >= left; j--) {
        result.add(matrix[bottom][j]);
      }
      bottom--;
    }
    if (left <= right) {
      // left col
      for (int i = bottom; i >= top; i--) {
        result.add(matrix[i][left]);
      }
      left++;
    }
    helper(matrix, top, left, bottom, right, result);

  }

  public static void main(String[] args) {
    SpiralMatrix sm = new SpiralMatrix();
    int[][] matrix = new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

    System.out.println(sm.spiralOrder(matrix));
  }
}
