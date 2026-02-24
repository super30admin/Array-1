//We traverse the matrix in a zigzag diagonal order:
//
//Use row r and column c to track current position.
//
//Use a boolean dir:
//
//        true → moving up-right
//
//false → moving down-left
//
//Handle boundary conditions:
//
//When hitting top, bottom, left, or right edge → change direction.
//
//Time: O(m × n)
//Space: O(1) (excluding result)

class Solution {
    public int[] findDiagonalOrder(int[][] mat) {

        // Number of rows
        int m = mat.length;

        // Number of columns
        int n = mat[0].length;

        // Result array to store diagonal traversal
        int[] result = new int[m * n];

        // Starting position (top-left corner)
        int r = 0, c = 0;

        // Direction flag:
        // true  = moving up-right
        // false = moving down-left
        boolean dir = true;

        // Traverse all elements in matrix
        for(int i = 0; i < m * n; i++) {

            // Store current element in result
            result[i] = mat[r][c];

            // If moving up-right
            if(dir) {

                // If reached last column → can only move down
                if(c == n - 1) {
                    r++;           // move down
                    dir = false;   // change direction
                }

                // If reached first row → can only move right
                else if(r == 0) {
                    c++;           // move right
                    dir = false;   // change direction
                }

                // Normal up-right movement
                else {
                    r--;           // move up
                    c++;           // move right
                }
            }

            // If moving down-left
            else {

                // If reached last row → can only move right
                if(r == m - 1) {
                    c++;           // move right
                    dir = true;    // change direction
                }

                // If reached first column → can only move down
                else if(c == 0) {
                    r++;           // move down
                    dir = true;    // change direction
                }

                // Normal down-left movement
                else {
                    r++;           // move down
                    c--;           // move left
                }
            }
        }

        // Return final diagonal traversal
        return result;
    }
}