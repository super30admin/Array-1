// 54. Spiral Matrix
// https://leetcode.com/problems/spiral-matrix/description/

/**
 * Time Complexity :  O(n * m) where n = row, m = cols. Since we store each element in resultant array
 * Space Complexity : O(1) since no extra linear space and answer array is not considered as auxillary space
 */

class Solution {

  public List<Integer> spiralOrder(int[][] matrix) {
    int n = matrix.length;
    int m = matrix[0].length;

    // variables to track rows and cols
    int rowS = 0;
    int rowE = n - 1;
    int colS = 0;
    int colE = m - 1;

    String dir = "right";

    List<Integer> ans = new ArrayList();

    while (rowS <= rowE && colS <= colE) {
      if (dir.equals("right")) {
        int c = colS;

        while (c <= colE) {
          ans.add(matrix[rowS][c]);
          c++;
        }

        dir = "down";

        rowS++;
      } else if (dir.equals("down")) {
        int r = rowS;

        while (r <= rowE) {
          ans.add(matrix[r][colE]);
          r++;
        }

        dir = "left";

        colE--;
      } else if (dir.equals("left")) {
        int c = colE;

        while (c >= colS) {
          ans.add(matrix[rowE][c]);
          c--;
        }

        dir = "up";

        rowE--;
      } else if (dir.equals("up")) {
        int r = rowE;

        while (r >= rowS) {
          ans.add(matrix[r][colS]);
          r--;
        }

        dir = "right";

        colS++;
      }
    }

    return ans;
  }
}
