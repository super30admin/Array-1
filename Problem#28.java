// Diagonal Traverse

// Time Complexity : O(m*n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english : Start from the first element in the matrix. There are two directions to traverse in - upwards and right, downwards and left. Keep traversing while checking for the boundary conditions and updating the next index to traverse accordingly.

// Your code here along with comments explaining your approach

class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length; // Rows
        int n = mat[0].length; // Columns
        int [] result = new int[m * n];
        boolean dir = true; // true - upward direction, false - downward direction
        int index = 0;
        int row = 0;
        int col = 0;

        while(index < (m * n)){ // Until the time we finish traversing all the elements of the matrix
            result[index] = mat[row][col]; // Input the element traversed into the resultant matrix
            if(dir == true){ // Upward direction
                if(row == 0 && col != n-1){ // Increment column and change direction if the top of a row is reached. Extra condition on column is for the element at the top right corner
                    col++;
                    dir = false;
                } else if(col == n - 1){ // Increment row and change the direction if the last column is reached
                    row++;
                    dir = false;
                } else { // Otherwise continue to move upwards and right
                    row--;
                    col++;
                }
            } else { // Downward direction
                if(row == m-1){ // Increment column and change the direction if the last row has been reached
                    col++;
                    dir = true;
                } else if(col == 0 && row != m - 1){ // Increment row and change the direction if the left column is reached. Extra condition on row is for the element at the bottom left corner
                    row++;
                    dir = true;
                } else { // Otherwise continue to move downwards and left
                    row++;
                    col--;
                }
            }
            index ++; // Increment index for the resu
        }
        return result;
    }
}