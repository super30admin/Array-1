/**
 * Time Complexity: O(M*N)
 * Space Complexity: O(1)
 * LeetCode: Y (https://leetcode.com/problems/diagonal-traverse/)
 * Approach: 
    Directions are reversed when we hit a corner or edge when traversing the matrix
    if you are moving up 
        hit upper edge edge then increment j
        hit upper-right corner or right edge then increment i
        else decrement i, increment j
    if you are moving down
        hit left edge then increment i
        hit bottom-left corner or lower edge then increment j
        else increment i, decrement j
 */

class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {
        // check for edge conditions
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return new int[]{};
        }
        // get rows and columns of given matrix
        int m = matrix.length, n = matrix[0].length;
        // initialize result array, its size equals the total elements in the given matrix
        int[] traversal = new int[m * n];
        
        // x to track the position in result array
        int x = 0;
        // start from upper-left corner
        int i = 0, j = 0;
        
        // initial direction is moving up
        boolean movingUp = true;
        
        // continue until you traverse the entire matrix
        while(x < m * n) {
            // add current element to result matrix
            traversal[x++] = matrix[i][j];
            
            // if moving up
            if(movingUp) {
                    // if moving up and hit upper edge
                    if(i == 0 && j < n - 1) {
                        j++;
                        movingUp = !movingUp;
                    }
                    // if moving up and hit upper-right corner or right edge
                    else if(j == n - 1) {
                        i++;
                        movingUp = !movingUp;
                    }
                   // if moving up in the middle of the matrix
                    else {
                        i--;
                        j++;
                    }
            }
            // if moving down
            else {
                    // if moving down and hit left edge
                    if(j == 0 && i < m - 1) {
                        i++;
                        movingUp = !movingUp;
                    }
                    // if moving down and hit lower-left corner or lower edge
                    else if(i == m - 1) {
                        j++;
                        movingUp = !movingUp;
                    }
                    // if moving down in the middle of the matrix
                    else {
                        i++;
                        j--;
                    }
            }
        }
        
        return traversal;
        
    }
}
