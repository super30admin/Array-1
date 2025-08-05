// Time Complexity  : O(m * n) where m = number of rows, n = number of columns
// Space Complexity : O(1) excluding the output list, we use constant extra space
// Did this code successfully run on Leetcode : Yes
// Approach:
// 1. Used four boundaries (top, bottom, left, right) to represent the current layer of the matrix.
// 2. Traverse in four directions: left → right, top → bottom, right → left, and bottom → top.
// 3. Shrink the boundaries after each direction until all elements are covered.

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();

        int m = matrix.length;
        int n = matrix[0].length;

        int top = 0, bottom = m - 1, left = 0, right = n - 1;

            while(top <= bottom && left <= right){
                for(int i = left; i <= right; i++){
                    result.add(matrix[top][i]);
                }
                top++;
                
                if(top <= bottom && left <= right){
                    for(int i = top; i <= bottom; i++){
                        result.add(matrix[i][right]);
                    }
                    right--;
                }
                
                if(top <= bottom && left <= right){
                    for(int i = right; i >= left; i--){
                        result.add(matrix[bottom][i]);
                    }
                    bottom--;
                }
                
                if(top <= bottom && left <= right){
                    for(int i = bottom; i >= top; i--){
                        result.add(matrix[i][left]);
                    }
                    left++;
                } 
            }
        return result;
    }
}
