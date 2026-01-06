// Time Complexity : O(MXN), Go over each element of the matrix once
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Approach :
// We need to identify whether the diagonal is going in upward direction or downward direction. To identify that,
// we can increment it, if the diagonal is even, we move downwards and increment row by 1 and decrement col by 1.
// If the digonal is odd, we move upwards, increment col by 1 and decrement row by 1;
// We will have to put additional checks when row or col becomes 0 or size, to avoid index of bounds error.
public class DiagonalTraverse {

    public int[] findDiagonalOrder(int[][] matrix) {

        int m = matrix.length;
        if(m == 0) return new int[0];
        int n = matrix[0].length;
        if(n == 0) return new int[0];
        int total = m * n;
        int[] result = new int[total];

        int diagonal = 1;
        int index = 0;
        int row = 0, col = 0;
        while (index < total) {
            result[index] = matrix[row][col];
            index++;
            if (diagonal % 2 == 0) {
                // To handle scenario where the cell is in both first col and last row
                // Dont go out of bounds when in last row
                if (col == 0 && row != m - 1) {
                    row++;
                    diagonal++;
                } else if (row == m - 1) {
                    col++;
                    diagonal++;
                } else {
                    row++;
                    col--;
                }
            } else {
                // To handle scenario where the cell is in both first row and last col
                // Dont go out of bounds when in last col
                if (row == 0 && col != n - 1) {
                    col++;
                    diagonal++;
                } else if (col == n - 1) {
                    row++;
                    diagonal++;
                } else {
                    row--;
                    col++;
                }

            }
        }

        return result;
    }

}
