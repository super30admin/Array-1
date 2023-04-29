// Time Complexity : O(m * n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
/*
 * SPIRAL: think of recurssion. Maintain top, bottom, left and right and run loops. As indices checks happens at start in the while loop,
 * make sure to check againg before for loop.
 */

import java.util.ArrayList;
import java.util.List;

public class SpiralTraverse {
    public List<Integer> spiralOrder(int[][] matrix) {
        if(matrix == null || matrix.length < 1) {
            return new ArrayList<>();
        }

        int m = matrix.length; //rows
        int n = matrix[0].length; //cols
        int top = 0;
        int bottom = m - 1;
        int left = 0;
        int right = n - 1;
        List<Integer> result = new ArrayList<>();

        while(top <= bottom && left <= right) {
            //top row
            for(int i = left; i <= right; i++) {
                result.add(matrix[top][i]);
            }
            top++;

            //right coloumn
            for(int i = top; i <= bottom; i++) {
                result.add(matrix[i][right]);
            }
            right--;
            
            if(top <= bottom) {
                //bottom row
                for(int i = right; i >= left; i--) {
                    result.add(matrix[bottom][i]);
                }
                bottom--;
            }
           
            if(left <= right) {
                //left coloumn
                for(int i = bottom; i >= top; i--) {
                    result.add(matrix[i][left]);
                }
                left++;
            }
        }
        return result;
    }
}
