// Time Complexity : O(mn)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
//return empty array if matrix is null or empty, then initialize variables and then loop over array diagonally and storing
// value in an array and switching directions

// Your code here along with comments explaining your approach

public class DiagonalMatrix {

    class Solution {
        public int[] findDiagonalOrder(int[][] matrix) {
            if (matrix == null || matrix.length == 0) return new int[0];

            //initialize variables
            int N = matrix.length;
            int M = matrix[0].length;

            int row=0, col=0, direction =1;

            int[] result = new int[N*M];
            int r = 0;

            //loop through matrix diagonally changing directions
            while (row < N && col < M) {
                result[r++] = matrix[row][col];

                int new_row = row + (direction == 1 ? -1 : 1);
                int new_column = col + (direction == 1 ? 1 : -1);

                if (new_row < 0 || new_row == N || new_column < 0 || new_column == M) {

                    if (direction == 1) {

                        row += (col == M - 1 ? 1 : 0) ;
                        col += (col < M - 1 ? 1 : 0);

                    } else {
                        col += (row == N - 1 ? 1 : 0);
                        row += (row < N - 1 ? 1 : 0);
                    }

                    // Flip the direction
                    direction = 1 - direction;

                } else {

                    row = new_row;
                    col = new_column;
                }
            }
            return result;

        }

    }
}
