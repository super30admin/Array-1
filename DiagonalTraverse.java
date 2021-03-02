// Time Complexity : O(m * n); m = #rows, n = #cols
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english :
// - for upward dir take 1 and for downward take -1.
// - in up dir; r will be r-- and c will be c++
// - in down dir; the opposite

public class DiagonalTraverse {
    public int[] findDiagonalOrder(int[][] matrix) {
        if (matrix == null || matrix.length == 0) return new int[0];

        int m = matrix.length;
        int n = matrix[0].length;
        int r = 0, c = 0, dir = 1;

        int[] res = new int[m * n];

        for (int i = 0; i < m * n; i++) {
            res[i] = matrix[r][c];
            if (dir == 1) {
                if (c == n - 1) {
                    r++;
                    dir = -1;
                }
                else if (r == 0) {
                    c++;
                    dir = -1;
                }
                else {
                    r--;
                    c++;
                }
            }
            else {
                if (r == m - 1) {
                    c++;
                    dir = 1;
                }
                else if (c == 0) {
                    r++;
                    dir = 1;
                }
                else {
                    c--;
                    r++;
                }
            }
        }
        return res;
    }
}
