// TC - O(m*n)
// SC - O(1)
class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        boolean top = true;
        int m = mat.length;
        int n = mat[0].length;
        int[] res = new int[m * n];
        int i = 0;
        int r = 0;
        int c = 0;

        while (i < m * n) {

            res[i] = mat[r][c];

            if (top) {
                if ((c + 1) >= n) {
                    r = r + 1;
                    top = false;
                } else if ((r - 1) < 0) {
                    c = c + 1;
                    top = false;
                } else {
                    r = r - 1;
                    c = c + 1;
                }
            } else {
                if ((r + 1) >= m) {
                    c = c + 1;
                    top = true;
                } else if ((c - 1) < 0) {
                    r = r + 1;
                    top = true;
                } else {
                    c = c - 1;
                    r = r + 1;
                }

            }
            i += 1;
        }
        return res;
    }
}
