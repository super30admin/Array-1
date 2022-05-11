//Time Complexity: O(m*n) where m is no of rows and n is no of columns
//Space Complexity:o(1)
//Did this code successfully run on Leetcode :Yes



class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return new int[0];
        }
        int m = matrix.length;
        int n = matrix[0].length;
        int[] ans = new int[m * n];

        int[] di = new int[]{-1, 1};
        int[] dj = new int[]{1, -1};

        int dir = 0;

        int i = 0, j = 0;
        for (int t = 0; t < m * n; t++) {
            ans[t] = matrix[i][j];

            i = i + di[dir];
            j = j + dj[dir];

            if (i >= m) {
                i = m - 1;
                j = j + 2;
                dir = 1 - dir;
            }
            if (j >= n) {
                j = n - 1;
                i = i + 2;
                dir = 1 - dir;
            }
            if (i < 0) {
                i = 0;
                dir = 1 - dir;
            }
            if (j < 0) {
                j = 0;
                dir = 1 - dir;
            }
        }

        return ans;
    }
}

