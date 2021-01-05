//https://leetcode.com/problems/diagonal-traverse/
// Time Complexity : O(rows*cols)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
class Problem2 {
    public static int[] findDiagonalOrder(int[][] matrix) {
        if (matrix == null || matrix.length == 0)
            return new int[0];
        int m = matrix.length, n = matrix[0].length;

        int[] result = new int[m * n];
        int row = 0, col = 0, d = 1;

        for (int i = 0; i < m * n; i++) {
            result[i] = matrix[row][col];
            row -= d;
            col += d;

            if (row >= m) {
                row = m - 1;
                col += 2;
                d = -d;
            }
            if (col >= n) {
                col = n - 1;
                row += 2;
                d = -d;
            }
            if (row < 0) {
                row = 0;
                d = -d;
            }
            if (col < 0) {
                col = 0;
                d = -d;
            }
        }

        return result;

    }

    public static void main(String[] args) {
        System.out.println(findDiagonalOrder(new int[][] { { 7 }, { 8 }, { 9 } }));
    }

}
