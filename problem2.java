class Solution {
    private static final int UP = 0, DOWN = 1;

    public int[] findDiagonalOrder(int[][] mat) {

        // define lengths
        int m = mat.length, n = mat[0].length;

        int[] result = new int[m * n];
        int resultIndex = 0;

        int direction = UP;
        int row = 0, col = 0;

        while (resultIndex != m * n) {

            result[resultIndex] = mat[row][col];
            ++resultIndex;

            if (direction == UP) {

                if (col == n - 1) {
                    direction = DOWN;
                    ++row;
                }

                else if (row == 0) {
                    direction = DOWN;
                    ++col;
                } else {
                    --row;
                    ++col;
                }
            }
            // direction is down
            else {
                if (row == m - 1) {
                    direction = UP;
                    ++col;
                } else if (col == 0) {
                    direction = UP;
                    ++row;
                } else {
                    ++row;
                    --col;
                }
            }
        }
        return result;
    }
}