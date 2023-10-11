//Time and Space: O(M*N)
class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
         int m = mat.length;
        int n = mat[0].length;
        int[] result = new int[m * n];
        int c = 0;
        int i = 0, j = 0;
        boolean di = true;

        while (c < m * n) {
            result[c++] = mat[i][j];

            if (di) {
                if (i > 0 && j < n - 1) {
                    i--;
                    j++;
                } else {
                    di = false;
                    if (j < n - 1) {
                        j++;
                    } else {
                        i++;
                    }
                }
            } else {
                if (i < m - 1 && j > 0) {
                    i++;
                    j--;
                } else {
                    di = true;
                    if (i < m - 1) {
                        i++;
                    } else {
                        j++;
                    }
                }
            }
        }

        return result;
    }
}
