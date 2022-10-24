// TC: O(n*m)
// SC: O(1)




class Solution {
  public int[] findDiagonalOrder(int[][] mat) {
    int[] res = new int[mat.length * mat[0].length];
    int resIdx = 0;
    int r = 0;
    int c = 0;
    int[] upRightDir = new int[]{-1, 1};
    int[] downLeftDir = new int[]{1, -1};
    int[] dir = upRightDir;
    while (resIdx < res.length) {
      res[resIdx] = mat[r][c];
      resIdx++;
      if (r + dir[0] < 0 || c + dir[1] >= mat[0].length) {
        dir = downLeftDir;
        if (c + 1 < mat[0].length) {
          c += 1;
        } else {
          r += 1;
        }
      } else if (r + dir[0] >= mat.length || c + dir[1] < 0) {
        dir = upRightDir;
        if (r + 1 < mat.length) {
          r += 1;
        } else {
          c += 1;
        }
      } else {
        r += dir[0];
        c += dir[1];
      }
    }
    return res;
  }
}