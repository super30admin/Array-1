// 54.
// Time Complexity : O(m*n) 
// Space Complexity : O(1) no extra space is used
// Did this code successfully run on Leetcode : Yes

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
       List<Integer> result = new ArrayList<Integer>(); 
       if(matrix.length == 0 || matrix == null) return result;

       int dir = 1;
       int m = matrix.length; int n = matrix[0].length;
       int top = 0; int bottom = m - 1;
       int left = 0; int right = n - 1;

       while(left<=right && top <= bottom){
           //top row
           if(left<=right && top <= bottom){
               for(int j = left; j <= right; j++){
                   result.add(matrix[top][j]);
               }
           }
           top++;
           //right column
           if(left<=right && top <= bottom){
               for(int i = top; i <= bottom; i++){
                   result.add(matrix[i][right]);
               }
           }
           right--;
           //bottom row
           if(left<=right && top <= bottom){
               for(int j = right; j >= left; j--){
                   result.add(matrix[bottom][j]);
               }
           }
           bottom--;  
           //left column
           if(left<=right && top <= bottom){
               for(int i = bottom; i >= top; i--){
                   result.add(matrix[i][left]);
               }
           }
           left++;
       }
       return result;
   }   
}