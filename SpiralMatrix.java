// Time Complexity : O(m*n)
// Space Complexity : O(m*n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Approach: Walking in the matrix and updating rowBegin, rowEnd,
// colBegin and colEnd accordingly.
// We add first row from left to right in the result and then increment the 
// rowBeing value; Then we add the last column from top to bottom in the result
// and decrement the colEnd.

// LC- 54 Spiral Matrix

import java.util.*;

class SpiralMatrix {
  public List<Integer> spiralOrder(int[][] matrix) {
    List<Integer> result = new ArrayList<>();

    if (matrix == null || matrix.length == 0) {
      return result;
    }

    int rowBegin = 0, rowEnd = matrix.length - 1;
    int colBegin = 0, colEnd = matrix[0].length - 1;

    while (rowBegin <= rowEnd && colBegin <= colEnd) {

      for (int i = colBegin; i <= colEnd; i++) {
        result.add(matrix[rowBegin][i]);
      }

      rowBegin++;

      for (int i = rowBegin; i <= rowEnd; i++) {
        result.add(matrix[i][colEnd]);
      }

      colEnd--;

      if (rowBegin <= rowEnd) {
        for (int i = colEnd; i >= colBegin; i--) {
          result.add(matrix[rowEnd][i]);
        }

        rowEnd--;

        if (colBegin <= colEnd) {
          for (int i = rowEnd; i >= rowBegin; i--) {
            result.add(matrix[i][colBegin]);
          }
        }

        colBegin++;

      }
    }

    return result;
  }
}