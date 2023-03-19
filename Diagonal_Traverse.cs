public class Solution {
    public int[] FindDiagonalOrder(int[][] mat) {
        int m = mat.Length;
        int n = mat[0].Length;
        int[] result = new int[m*n];
        int i = 0;
        int r = 0;
        int c = 0;
        bool dir = true;
        while (i < m*n) {
            result[i] = mat[r][c];
            i ++;
            if (dir) {
                if (r == 0 && c != n-1) {
                    c++;
                    dir = false;
                } else if (c == n-1) {
                    r++;
                    dir = false;
                } else {
                    r--;
                    c++;
                }
            } else {
                if (c == 0 && r != m-1) {
                    r++;
                    dir = true;
                } else if (r == m-1) {
                    c++;
                    dir = true;
                } else {
                    r++;
                    c--;
                }
            }
        }
        return result;
    }
}