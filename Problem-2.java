// Time Complexity : O(m x n)
// Space Complexity : O(m x n)
// Did this code successfully run on Leetcode : Yes

// We maintain a direction flag (up:true/down:false)
// We start with moving up diagonally and check below condition
// Direction is up - Did we breached last column or first row; if yes then change direction
// Direction is down - Did we breached last row or first column; if yes then change direction
class Solution2 {
    public int[] findDiagonalOrder(int[][] mat) {
        // default direction: up
        boolean dir = true;

        int m = mat.length;
        int n = mat[0].length;
        int r = 0, c = 0;

        int resultLength = m * n;
        int[] res = new int[resultLength];
        int i = 0;
        while (i < resultLength) {
            res[i] = mat[r][c];
            if (dir) {
                // up
                if (c == n - 1) {
                    // right boundry
                    r++;
                    dir = false;
                } else if (r == 0) {
                    // top boundry
                    c++;
                    dir = false;
                } else {
                    // diagonal up flow
                    r--;
                    c++;
                }
            } else {
                // down
                if (r == m - 1) {
                    // bottom boundry
                    c++;
                    dir = true;
                } else if (c == 0) {
                    // left boundry
                    r++;
                    dir = true;
                } else {
                    // diagonal down flow
                    r++;
                    c--;
                }
            }
            i++;
        }

        return res;
    }
}