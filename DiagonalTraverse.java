// Time Complexity : O(mn), where m= number of rows of matrix, n = number of columns of matrix
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach :
// 1. Define the direction and move the row and column pointers
// 2. If the direction is upwards, it either breaches right and top side of matrix, hence identified edge cases for them and handled for up direction
// 3. If the direction is downwards, it either breaches left or down side of matrix, hence identified edge cases for them and handled for down direction

// 498. Diagonal Traverse - https://leetcode.com/problems/diagonal-traverse/
class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        if (mat == null || mat.length == 0) return new int[] {};
        
        int m = mat.length, n = mat[0].length;
        int result[] = new int[m*n];
        int row = 0, col = 0, dir = 1, index = 0;
        
        while (index < result.length) {
            result[index] = mat[row][col];
            index++;
            
            // traverse to next element in matrix
            if (dir == 1) {
                if (col == n-1) { // or if (row == 0 && col != n-1)
                    row++;
                    dir = -1;
                } else if (row == 0) {
                    col++;
                    dir = -1;
                } else {
                    row--;
                    col++;
                }
            } else {
                if (row == m-1) {
                    col++;
                    dir = 1;
                } else if (col == 0) {
                    row++;
                    dir = 1;
                } else {
                    col--;
                    row++;
                }
            }
        }
        
        return result;
    }
}