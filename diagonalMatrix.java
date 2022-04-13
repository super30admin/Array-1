/**
Problem: https://leetcode.com/problems/diagonal-traverse/

TC: O(n * m)
SC: O(1)
*/
class Solution {
    // Approach 1
    public int[] findDiagonalOrder(int[][] matrix) {
        
        if (matrix == null || matrix.length == 0) {
            return new int[0];
        }
        
        int M = matrix.length;
        int N = matrix[0].length;
        int row = 0, column = 0;
        // Set to up initially
        int direction = 1;
        
        int[] result = new int[M*N];
        // pointer within result array
        int r = 0;

        while (r < M * N) {
            result[r++] = matrix[row][column];
            
            if (direction == 1) {
                if (column == N - 1) {
                    direction = 0;
                    ++row;
                } else if (row == 0) {
                    direction = 0;
                    ++column;
                } else {
                    --row; ++column;
                }
            } else {
                if (row == M - 1) {
                    direction = 1;
                    ++column;
                } else if (column == 0) {
                    direction = 1;
                    ++row;
                } else {
                    ++row; --column;
                }
            }
        }
        return result;      
    }

    // Approach 2 : cleaner code
    public int[] findDiagonalOrder(int[][] matrix) {
        
        if (matrix == null || matrix.length == 0) {
            return new int[0];
        }
        
        int N = matrix.length;
        int M = matrix[0].length;
        int row = 0, column = 0;
        // Set to up initially
        int direction = 1;
        
        int[] result = new int[N*M];
        // pointer within result array
        int r = 0;

        while (row < N && column < M) {
            result[r++] = matrix[row][column];
            
            int newRow = row + (direction == 1 ? -1 : 1);
            int newColumn = column + (direction == 1 ? 1 : -1);
            
            if (newRow < 0 || newRow == N || newColumn < 0 || newColumn == M) {
                
                if (direction == 1) {
                    row = row + (column == M - 1 ? 1 : 0);
                    column = column + (column < M - 1 ? 1 : 0);
                } else {
                    column = column + (row == N - 1 ? 1 : 0);
                    row = row + (row < N - 1 ? 1 : 0);
                }
                
                // flip the direction
                direction = 1 - direction;
            } else {
                row = newRow;
                column = newColumn;
            }
        }
        return result;      
    }
}