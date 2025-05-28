// Time Complexity : O(m*n) m & n are row & column Length resp.
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : YES
// Any problem you faced while coding this : Yes



class Problem2 {
    public int[] findDiagonalOrder(int[][] mat) {
        int rowLen = mat.length;
        int colLen = mat[0].length;
        int[] result = new int[(rowLen) * (colLen)];
        int row = 0, col = 0;
        boolean up = true;
        int i = 0;

        while (i < (rowLen * colLen)) {
            result[i++] = mat[row][col];
            if (up) {
                if (col == colLen - 1) {
                    row++;
                    up = false;
                } else if (row == 0) {
                    col++;
                    up = false;
                } else {
                    row--;
                    col++;
                }
            } else {
                if (row == rowLen - 1) {
                    col++;
                    up = true;
                } else if (col == 0) {
                    row++;
                    up = true;
                } else {
                    col--;
                    row++;
                }
            }
        }

        return result;
    }
}