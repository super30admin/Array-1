// Time Complexity: O(m*n)
// Space Complexity: O(m*n)
// Runs on LeetCode: YES
class DiagonalTraverse {
    public int[] findDiagonalOrder(int[][] mat) {
        int row = mat.length;
        int col = mat[0].length;
        int[] result = new int[row * col];
        boolean dir = true;
        int i = 0;
        int j = 0;

        for (int idx = 0; idx < result.length; idx++) {
            result[idx] = mat[i][j];

            if (dir) {
                //going up
                if (j == col - 1) {
                    dir = false;
                    i++;
                } else if (i == 0) {
                    dir = false;
                    j++;
                } else {
                    i--;
                    j++;
                }
            } else {
                // going down
                if (i == row - 1) {
                    dir = true;
                    j++;
                } else if (j == 0) {
                    dir = true;
                    i++;
                } else {
                    j--;
                    i++;
                }
            }

        }
        return result;

    }
}