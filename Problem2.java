class Problem2 {
    public static int[] findDiagonalOrder(int[][] mat) {
        int row = mat.length;
        int col = mat[0].length;
        int[] result = new int[row * col];
        int resultIndex = 0;
        int i = 0, j = 0;
        boolean direction = true;
        // true = up, false = down
        while (resultIndex < row * col) {
            result[resultIndex] = mat[i][j];
            ++resultIndex;
            if (direction) {
                if (j == col - 1) {
                    direction = false;
                    ++i;
                } else if (i == 0) {
                    direction = false;
                    ++j;
                } else {
                    --i;
                    ++j;
                }

            } else {
                if (i == row - 1) {
                    direction = true;
                    ++j;
                } else if (j == 0) {
                    direction = true;
                    ++i;
                } else {
                    ++i;
                    --j;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int[] diagonal = findDiagonalOrder(matrix);
        for (int i : diagonal)
            System.out.print(i + " ");
    }
}