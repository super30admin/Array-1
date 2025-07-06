// Time Complexity : O(m * n) where m is number of rows and n is number of columns
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Had to revise basic syntax

// ## Problem 2
// Given a matrix of M x N elements (M rows, N columns), return all elements of the matrix in diagonal order as shown in the below image.
// Example:
// Input:
// [
// [ 1, 2, 3 ],

// [ 4, 5, 6 ],

// [ 7, 8, 9 ]
// ]
// Output: [1,2,4,7,5,3,6,8,9]

class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        // Base case: input matrix is null or empty
        if (mat == null || mat.length == 0){
            return new int[] {};
        }
        
        int m = mat.length; // number of rows
        int n = mat[0].length; // number of columns
        int[] answer = new int[m * n]; // result array
        int index = 0; // index for traversal and inserting in result array
        int row = 0; // starting point
        int col = 0; // starting point
        int dir = 1;
        // dir = 1 => bottom to top
        // dir = -1 => top to bottom

        // Traversing till we fill all the elements in result array
        while (index < m * n){
            answer[index] = mat[row][col];
            index++;
            if (dir == 1){ // moving bottom to top
                if(col == n - 1){ // if at last column, going down and changing direction
                    dir = -1;
                    row++;
                }
                else if (row == 0){ // if at first row, going right and changing direction
                    dir = -1;
                    col++;
                }
                else { // moving bottom to top
                    row--;
                    col++;
                }
            }
            else{ // dir == -1, moving top to bottom
                if(row == m - 1){ // if at last row, going right and changing direction
                    dir = 1;
                    col++;
                }
                else if (col == 0){ // if at first column, going down and changing direction
                    dir = 1;
                    row++;
                }
                else { // moving top to bottom
                    col--;
                    row++;
                }
            }
        }

        // returning result array
        return answer;
    }
}
