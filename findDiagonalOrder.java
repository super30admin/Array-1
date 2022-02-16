public class findDiagonalOrder {
    public int[] find_DiagonalOrder(int[][] mat) {

        if (mat == null)
            return new int[0];
        int m = mat.length, n = mat[0].length;
        int[] result = new int[m * n];
        int k = 0, dir = 1, i = 0, j = 0;
        while (k < m * n) {
            result[k] = mat[i][j];
            k++;
            // next i, j in matrix
            if (dir == 1) {
                if (j == n - 1) {
                    i++;
                    dir = -1;
                } else if (i == 0) {
                    j++;
                    dir = -1;
                } else {
                    i--;
                    j++;
                }
            } else {
                if (i == m - 1) {
                    j++;
                    dir = 1;
                } else if (j == 0) {
                    i++;
                    dir = 1;
                } else {
                    j--;
                    i++;
                }
            }
        }

        return result;

    }
}
