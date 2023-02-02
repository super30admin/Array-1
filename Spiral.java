// Time Complexity : O(mn)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        if(matrix.length ==0) return result;
        int left =0;
        int top=0;
        int right = matrix[0].length -1;
        int bottom= matrix.length -1;
        while(left<=right && top<=bottom){
            //move from left to right
            for(int i=left; i<=right; i++){
                result.add(matrix[top][i]);
            }
            top++;
            //move from top and bottom
            for(int i=top; i<=bottom; i++){
                result.add(matrix[i][right]);
            }
            right--;
            
            //move from right to left
            if(top<=bottom){
            for(int i=right; i>=left; i--){
                result.add(matrix[bottom][i]);
            }
            }
            bottom--;
            
            //move from bottom to top
            if(left<=right){
            for(int i=bottom; i>=top; i--){
                result.add(matrix[i][left]);
            }
            }
            left++;
        }
        
        return result;
    }
}
