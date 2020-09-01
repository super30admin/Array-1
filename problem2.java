//Time Complexity O(N*M)
//Space Complexity: O(1)
class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0)
            return new int[0];
        int n = matrix.length;
        int m = matrix[0].length;
        int[] output = new int[n * m];

        int index = 0;
        int dirs = 1;
        int i = 0, j = 0;

        while (index < n * m) {

            output[index] = matrix[i][j];

            index++;
            // upwards
            if (dirs == 1) {
                // if at last col
                if (j == m - 1) {
                    i = i + 1;
                    dirs = -1;
                } else if (i == 0) { // if at first row
                    j = j + 1;
                    dirs = -1;
                } else {
                    i = i - 1;
                    j = j + 1;
                }
            } else {
                // if at last row
                if (i == n - 1) {
                    j = j + 1;
                    dirs = 1;
                } else if (j == 0) { // if at first col
                    i = i + 1;
                    dirs = 1;
                } else {
                    i = i + 1;
                    j = j - 1;

                }
            }
        }
        return output;
    }
}