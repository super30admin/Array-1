// Time Complexity : O(n * m) where m is row and n is col length of input matrix
// Space Complexity : O(1) since we are using any additional space
// Did this code successfully run on Leetcode : yes

import java.util.*;
public class SpiralOrder {
    public static void main(String[] args) {
        
    }

    public List<Integer> spiralOrder(int[][] matrix) {
        if(matrix == null || matrix.length == 0){
            return new ArrayList<>();
        }
        List<Integer> res = new ArrayList<>();
        int row = matrix.length, col = matrix[0].length;
        int top = 0, bottom = row-1, left = 0, right = col-1;
        
        while(top <= bottom && left <= right){
            
            for(int c=left; c<=right; c++){
                res.add(matrix[top][c]);
            }
            top++;
            
            for(int r=top; r<=bottom && left <= right && top<= bottom; r++){
                res.add(matrix[r][right]);
            }
            right--;
            
            for(int c=right; c>=left && left <= right && top<= bottom; c--){
                res.add(matrix[bottom][c]);
            }
            bottom--;
            
            for(int r=bottom; r>=top && left <= right && top<= bottom; r--){
                res.add(matrix[r][left]);
            }
            left++;
        }
        
        return res;
    }
}
