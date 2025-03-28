class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;

        int[] result = new int[m * n];  // Corrected array declaration
        boolean dir = true;  // true means moving up, false means moving down
        int r = 0, c = 0;

        for (int i = 0; i < m * n; i++) {
            result[i] = mat[r][c];

            if (dir) {
                // Moving up
                if (c == n - 1) { // Hit the right boundary
                    r++;
                    dir = false;
                } else if (r == 0) { // Hit the top boundary
                    c++;
                    dir = false;
                } else {
                    r--;
                    c++;
                }
            } else {
                // Moving down
                if (r == m - 1) { // Hit the bottom boundary
                    c++;
                    dir = true;
                } else if (c == 0) { // Hit the left boundary
                    r++;
                    dir = true;
                } else {
                    r++;
                    c--;
                }
            }
        }

        return result;  // Return the final result
    }
}
