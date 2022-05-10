
import java.util.*;
// Time Complexity : O(m*n)
// Space Complexity : O(m*n)
// Did this code successfully run on Leetcode : Yes

// Your code here along with comments explaining your approach
// Diagnoal traversal is based on direction variable set on matrix properties.

class Diagonalmatrixrix {

  public static int[] findDiagonalOrder(int[][] matrix) {
    if (matrix == null || matrix.length == 0) {
      return new int[] {};
    }
    int m = matrix.length, n = matrix[0].length, k = 0, rowIdx = 0, colIdx = 0, direction = 1;
    int result[] = new int[m * n];
    while (k < m * n) {
      result[k] = matrix[rowIdx][colIdx];
      if (direction == 1) {
        if (colIdx == n - 1) {
          rowIdx++;
          direction = -1;
        } else if (rowIdx == 0) {
          colIdx++;
          direction = -1;
        } else {
          rowIdx--;
          colIdx++;
        }
      } else {
        if (rowIdx == m - 1) {
          colIdx++;
          direction = 1;
        } else if (colIdx == 0) {
          rowIdx++;
          direction = 1;
        } else {
          rowIdx++;
          colIdx--;
        }
      }
      k++;
    }
    return result;
  }

  public static void main(String[] args) {
    int[][] mat = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
    int[] res = findDiagonalOrder(mat);
    System.out.println("Diagonal Matrix: " + Arrays.toString(res));
  }
}