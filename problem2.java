// Time Complexity O(m*n)
// Space Complexity O(1), since output array is not considered extra space

// We use a direction variable to indicate positive diagonal or negative diagonal

class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        if (mat == null) return new int[] {};

        int dir = 1;

        int n = mat.length; // rows
        int m = mat[0].length; // cols

        int output[] = new int[m*n];

        int idx = 0, row = 0, col = 0;

        while (idx < m*n) {
            output[idx++] = mat[row][col];

            if (dir == 1) { // positive diagonal
                if (col == m-1) { // we have reached last element on the right
                    dir = -1;
                    row++;
                } else if (row == 0) { // we have reached last element on the top
                    dir = -1;
                    col++;
                } else { // normal case
                    row--;
                    col++;
                }

            } else { // negative diagonal
                if (row == n-1) { // we have reached last element on the bottom
                    dir = 1;
                    col++;
                } else if (col == 0) { // we have reached last element on the left
                    dir = 1;
                    row++;
                } else { // normal case
                    row++;
                    col--;
                }
            }
        }

        return output;
    }
}
