import java.util.*;

time complexity = m *n;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> l = new LinkedList<>();
        if(matrix == null || matrix.length == 0){
            return l;
        }
        int left = 0; int right = matrix[0].length-1;
        int top = 0; int bottom = matrix.length;
        while(left <= right  && top <= bottom){
            //left to right
            for(int i = left; i <= right; i++){
                l.add(matrix[top][i]);
            }
            top++;
            
            //right to bottom
            if(left <= right  && top <= bottom){
                for(int i = top; i < bottom; i++){
                    l.add(matrix[i][right]);
                }
                right--;
            }
            
            if(left <= right  && top <= bottom){
            //right to left
                for(int i = right; i >= left; i--){
                    l.add(matrix[bottom][i]);   
                }
                bottom--;
            }
            
            //bottom to top
            if(left <= right  && top <= bottom){
                for(int i = bottom; i >= top; i--){
                    l.add(matrix[i][left]);
                }
                left ++;
            }
        }
            return l;
        
       }
}