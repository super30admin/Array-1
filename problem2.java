// Time Complexity : O(m * n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english: Now traversing diagonally, and increase & decrease our rows/column as per our conditions and taking direction as a flag, to determine our direction of traversing.

public class problem2 {
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int[] result = new int[m * n];
        int r = 0;
        int c = 0;
        int flag = 1;
        for (int i = 0; i < m * n; i++) {
            result[i] = mat[r][c];
            if (flag == 1) {
                if (r == 0 && c != n - 1) {
                    flag = -1;
                    c++;
                } else if (c == n - 1) {
                    flag = -1;
                    r++;
                } else {
                    r--;
                    c++;
                }
            } else {
                if (c == 0 && r != m - 1) {
                    flag = 1;
                    r++;
                } else if (r == m - 1) {
                    flag = 1;
                    c++;
                } else {
                    c--;
                    r++;
                }
            }
        }
        return result;
    }
}
