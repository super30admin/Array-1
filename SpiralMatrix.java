// Time Complexity : O(mn)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english : We will take 4 variables top, bottom, left and right and loop through the entire matrix

import java.util.*;
class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
     
        List<Integer> result = new ArrayList<>();
        
        int top = 0, bottom = matrix.length-1, right = matrix[0].length-1, left = 0;
        
        while(top <= bottom && left <= right) {
            
            for(int i = left; i <= right; i++) {
                result.add(matrix[top][i]);
            }
            top++;
            
            
            for(int i = top; i <= bottom; i++) {
                result.add(matrix[i][right]);
            }
            right--;
            
            if(top <= bottom) {
                for(int i = right; i >= left; i--) {
                    result.add(matrix[bottom][i]);
                }
                bottom--;
            }
            
            if(left <= right) {
                for(int i = bottom; i >= top; i--) {
                    result.add(matrix[i][left]);
                }
                left++;
            }
            
        }
        return result;
    }
}