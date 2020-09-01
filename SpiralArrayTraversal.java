// Time Complexity : O (N x M) where N is number of rows and M is columns
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english
                //Just keep track of when to change direction using four pointers
                //And accordingly change the pointers.
                //At every direction change check -
                     //if top pointer crossed bottom or left crossed right

import java.util.*;

public class SpiralArrayTraversal {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return new ArrayList<>();
        }

        List<Integer> serial = new ArrayList<>();
        int top = 0, left = 0, right = matrix[0].length-1, bottom = matrix.length-1;
        
        while(top <= bottom && left <= right) {
            for(int i = left ; i <= right ; i++) {
                serial.add(matrix[top][i]);
            }
            top++;
            
            for(int i = top ; i <= bottom ; i++) {
                serial.add(matrix[i][right]);
            }
            right--;
            
            if(top <= bottom) {
                for(int i = right ; i >= left ; i--) {
                serial.add(matrix[bottom][i]);
                }
                bottom--;
            }
            
            if(left <= right) {
                for(int i = bottom ; i >= top ; i--) {
                serial.add(matrix[i][left]);
                }
                left++;
            }
        }
        
        return serial;
    }
}