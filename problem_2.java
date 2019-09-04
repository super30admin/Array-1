/**
 * Q. Given a matrix of M x N elements (M rows, N columns), return all elements
 * of the matrix in diagonal order.
 * 
 * A. Take a boolean to keep track of if we are going up/down diagonally and 
 * toggle the boolean after each iteration of diagonal.
 * 
 * While going up we will keep on incrementing the columns and decrementing the rows 
 * and vice versa when going down. 
 * 
 * In both cases i.e while moving up/down diagonally, we will have to check for three condtions 
 * when we reach the end of diagonal. 
 * 
 * 1) If both column and row are out of bound
 * 2) Row is out of bound
 * 3) Column is out of bound 
 * 
 * Accordingly we will set the value of cloumn and row for next diagonal iteration.  
 * 
 * 
 * Time Complexity - O(n), each element of matrix is just reached once
 * Space Complexity - O(n), result array is size of input matrix
 * Runs on Leetcode - Yes
 */

class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {

        if (matrix.length == 0) {
            return new int[0];
        }

        // to keep track if we are moving diagonally up or down
        boolean up = true;

        int m = matrix.length;
        int n = matrix[0].length;

        int[] result = new int[m * n];

        int r = 0;
        int c = 0;

        //loop thorugh each element
        for (int i = 0; i < m * n;) {
            if (up) {
                //while moving diagionally up keep on increasing column and descresing the row
                while (r >= 0 && c <= n - 1) {
                    result[i] = matrix[r][c];
                    r -= 1;
                    c += 1;
                    i += 1;
                }

                if (r < 0 && c > n - 1) {
                    r = 1;
                    c = n - 1;
                } else if (r < 0) {
                    r = 0;
                } else if (c > n - 1) {
                    c = n - 1;
                    r += 2;
                }

            } else {
                // while moving diagionally down keep on descresing column and increasing the row
                while (r <= m - 1 && c >= 0) {
                    result[i] = matrix[r][c];
                    r += 1;
                    c -= 1;
                    i += 1;
                }
                
                if (r > m - 1 && c < 0) {
                    r = m - 1;
                    c = 1;
                } else if (r > m - 1) {
                    r = m - 1;
                    c += 2;
                } else if (c < 0) {
                    c = 0;
                }

            }

            up = !up;
        }
        return result;
    }
}