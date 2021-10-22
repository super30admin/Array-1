public class DiagonalTraverse {
    public int[] findDiagOrder(int[][] mat) {
        // up = 1;
        // down = 0;
        if (mat == null) {
            return null;
        }

        int m = mat.length * mat[0].length;
        int[] diagonal = new int[m];
        int direction = 1, i = 0, col = 0, row = 0;

        while (i < m) {
            diagonal[i] = mat[row][col];
            i++;
            // Direction = 1
            if (direction == 1) {
                if (row == 0) {
                    col++;
                    direction = 0;
                } else if (col == mat[0].length - 1) {
                    row++;
                    direction = 0;
                } else {
                    col++;
                    row--;
                }
            } else {
                if (col == 0) {
                    row++;
                    direction = 1;
                } else if (row == mat.length - 1) {
                    col++;
                    direction = 1;
                } else {
                    col--;
                    row++;
                }
            }
        }
        return diagonal;
    }
}
