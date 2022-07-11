// Time Complexity : O(mn) //As iterating through whole matrix
// Space Complexity : O(1) //No extra space is used. result array is not used to simulate
// Did this code successfully run on Leetcode : Yes

import java.util.Arrays;

public class diagonalTraverseSolution {
    public int[] diagonalTraverse(int[][] mat) {
        if (mat == null || mat.length == 0) {
            return new int[0];
        }

        int m = mat.length;
        int n = mat[0].length;
        int[] result = new int[m * n];
        int row = 0, col = 0, index = 0;
        int dir = 1;// Starting with upward direction
        // as we inncrement index of the array and assign values, base condition should
        // be less than length of the matrix
        while (index < m * n) {
            result[index] = mat[row][col]; // Assigning that specific index value from matrix to result array
            index++;
            if (dir == 1) {
                // In the upward direction, if we move to the last element in last col at the
                // Change the direction as it should not throw index out of bound
                if (col == n - 1) {
                    dir = -1;
                    row++;
                } else if (row == 0) { // if it's at initial position, change direction
                    dir = -1;
                    col++;
                } else {// Otherwise to go in up direction, decrement row and increment col
                    row--;
                    col++;
                }

            } else {
                // In the down direction, if we move to the last element in last row at the
                // Change the direction as it should not throw index out of bound
                if (row == m - 1) {
                    dir = 1;
                    col++;
                } else if (col == 0) { // if it's at starting of column, change direction
                    dir = 1;
                    row++;
                } else {// Otherwise to go in down direction, decrement col and increment row
                    col--;
                    row++;
                }
            }
        }

        return result;

    }

    public static void main(String[] args) {
        diagonalTraverseSolution dts = new diagonalTraverseSolution();
        int[][] mat = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        System.out.println(Arrays.toString(dts.diagonalTraverse(mat)));
    }
}
