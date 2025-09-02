import java.util.Arrays;
//Time Complexity: O(n * m), n -> no of cols, m -> no of rows
//Space Complexity: O(1), output is not considered in the space complexity
//Did this code successfully run on Leetcode : Yes
//Approach: when at (0, 0), the element gets added to the output, we move downwards since there's no other row before 0,
//until we hit the left wall (col 0) or the floor (row == length) at which point we move upwards, until we hit the roof (row 0)
//we will have to be careful about the right diagonal corners of the matrix because we can run into row++, col-- or col++, row-- getting out of bounds
public class DiagonalOrder {

    public int[] findDiagonalOrder(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        final int[] output = new int[m * n];

        boolean flag = true;
        int row = 0, col = 0;
        for (int i = 0; i < m * n; i++) {
            output[i] = matrix[row][col];
            if (flag) {
                if (col == n - 1) {
                    row++;
                    flag = false;
                } else if (row == 0) {
                    col++;
                    flag = false;
                } else {
                    row--;
                    col++;
                }
            } else {
                if (row == m - 1) {
                    col++;
                    flag = true;
                } else if (col == 0) {
                    row++;
                    flag = true;
                } else {
                    row++;
                    col--;
                }
            }
        }

        return output;
    }

    public static void main(String[] args) {
        final DiagonalOrder diagonalOrder = new DiagonalOrder();
        System.out.println(Arrays.toString(diagonalOrder.findDiagonalOrder(new int[][] {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        }))); //return [1, 2, 5, 9, 6, 3, 4, 7, 10, 11, 8, 12]

        System.out.println(Arrays.toString(diagonalOrder.findDiagonalOrder(new int[][] {
                {1, 2, 3},
                {5, 6, 7},
                {9, 10, 11}
        }))); //return [1, 2, 5, 9, 6, 3, 7, 10, 11]
    }
}
