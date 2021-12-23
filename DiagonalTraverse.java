public class DiagonalTraverse {
    public int[] findDiagonalOrder(int[][] mat) {

        // TC : O(M*N)
        // SC : O(1)

        if (mat == null || mat.length == 0)
            return new int[] {};

        int rows = mat.length;

        int cols = mat[0].length;

        int dir = 1;

        int[] res = new int[rows * cols];

        int index = 0;
        int i = 0;
        int j = 0;

        while (index < rows * cols) {
            res[index] = mat[i][j];
            index++;
            // direction above
            if (dir == 1) {
                if (j == cols - 1) {
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
                // direction below
                if (i == rows - 1) {
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

        }

        return res;

    }
}
