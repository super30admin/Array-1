// Time Complexity: O(m*n)
// Space Complexity: O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Approach: walking approach by incrementing and decrementing row and
// col by checking if we are reaching edges.

// LC- 498 Diagonal Traverse

public class DiagonalTraverse {
  public int[] findDiagonalOrder(int[][] mat) {
    if (mat == null || mat.length == 0) {
      return new int[0];
    }

    int m = mat.length, n = mat[0].length, row = 0, col = 0, d = 0;
    int[] result = new int[m * n];

    for (int i = 0; i < m * n; i++) {
      result[i] = mat[row][col];

      // if even, go up
      if ((row + col) % 2 == 0) {
        if (col == n - 1) {
          row++;
        } else if (row == 0) {
          col++;
        } else {
          row--;
          col++;
        }
      } else {
        if (row == m - 1) {
          col++;
        } else if (col == 0) {
          row++;
        } else {
          row++;
          col--;
        }
      }
    }
    return result;
  }
}
