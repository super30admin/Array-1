// Time Complexity :O(m*n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english
//here we have a big loop which will run until left <= right && top <= bottom this condition is breached and now we are iterating from 
// left to right, top to bottom,right to left, bottom to top while shrinking the matrix and we are also checking if the condition is breached 
// in any iteration because we are adding and subtracting top, bottom , left and right inorder to shrink the matrix.



import java.util.*;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        if(matrix==null || matrix.length==0)return result;
        int m = matrix.length;
        int n = matrix[0].length;
        int left = 0;
        int top = 0;
        int bottom = m-1;
        int right = n-1;
        while(left <= right && top <= bottom){
            //top
            if(left <= right && top <= bottom){
               for(int i=left;i<=right;i++){
                   result.add(matrix[top][i]);
               } top++;      
            }
            //right
            if(left <= right && top <= bottom){
                for(int i = top ;i<=bottom;i++){
                    result.add(matrix[i][right]);
                }right--;
            }
            //bottom
            if(left <= right && top <= bottom){
                for(int i = right;i>=left;i--){
                    result.add(matrix[bottom][i]);
                }bottom--;
                
            }
            //left
            if(left <= right && top <= bottom){
                for(int i=bottom;i>=top;i--){
                    result.add(matrix[i][left]);
                }left++;
            }
        }return result;
    }
}