// Time Complexity : O(N)
// Space Complexity :  O(1)
// Did this code successfully run on Leetcode : Yes

// Your code here along with comments explaining your approach
/*
 * I need to traverse the matrix in clockwise direction and make sure that I do not traverse the same path again. I can maintain 4 variables
 * for checking boundary conditions and keep moving to the next row/column in order.
 */

import java.util.*;
class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>(); // result list
        // edge case
        if(matrix == null || matrix.length == 0) return result;
        int rows = matrix.length, cols = matrix[0].length;
        // Declaring variables to maintain the 4 boundaries of the matrix
        int top = 0, left = 0;
        int bottom = rows-1;
        int right = cols-1;
        while(top <= bottom && left <= right) {
            // initially I am at 0,0 coordinate. I need to move from left to right keeping top constant
            for(int i = left; i <= right; i++) {
                result.add(matrix[top][i]);
            }
            top++; // increase top. We are done with previous rows
            for(int i = top; i <= bottom; i++) { // top to bottom
                result.add(matrix[i][right]);
            }
            right--; // decrease right
            if(top <= bottom) {
                for(int i = right; i >= left; i--) { // right to left
                    result.add(matrix[bottom][i]);
                }
                bottom--; 
            }
             if(left <= right) {
                for(int i = bottom; i >= top; i--) { // bottom to top
                    result.add(matrix[i][left]);
                }
                left++;
            }
        }
        return result;
    }
}

