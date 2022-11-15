//space complexity is O(1)
//time complexity is O(m*n)
class Solution {
    public int[] findDiagonalOrder(int[][] mat) {

        if (mat == null || mat.length == 0) {
            return new int[mat.length];
        }

        int i = 0;
        int j = 0;
        int dir = 1; // 1 is uppward direction and -1 is downward direction
        int m = mat.length;
        int n = mat[0].length;
        int[] res = new int[m * n];
        int index = 0;

        while (index < m * n) {
            res[index] = mat[i][j];

            if (dir == 1) {

                if (j == n - 1) {
                    // if j is at last
                    dir = -1;
                    i++;
                } else if (i == 0) {
                    dir = -1;
                    j++;
                } else {
                    i--;
                    j++;
                }

            } else {
                // dir is -1

                if (i == m - 1) {
                    // last row
                    dir = 1;
                    j++;
                } else if (j == 0) {
                    dir = 1;
                    i++;
                } else {
                    i++;
                    j--;
                }
            }

            index++;
        }

        return res;

    }
}