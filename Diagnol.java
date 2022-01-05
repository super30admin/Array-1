// TC O(m*n) m is number of rows and n is number of columns
// SC O(1) 
public class Diagnol {
    public int[] findDiagonalOrder(int[][] mat) {
        if (mat == null || mat.length == 0) {
            return new int[] { 0 };
        }
        int m = mat.length;
        int n = mat[0].length;
        int[] res = new int[m * n];
        int dir = 1;
        int i = 0, r = 0, c = 0;
        while (i < m * n) {
            res[i] = mat[r][c];
            i++;
            if (dir == 1) {
                if (c == n - 1) {
                    r++;
                    dir = -1;
                } else if (r == 0) {
                    c++;
                    dir = -1;

                } else {
                    r--;
                    c++;
                }
            } else {
                if (r == m - 1) {
                    c++;
                    dir = 1;
                } else if (c == 0) {
                    r++;
                    dir = 1;
                } else {
                    r++;
                    c--;
                }
            }
        }
        return res;
    }
}
