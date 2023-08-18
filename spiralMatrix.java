// Time Complexity : O (m * n) m = # of rows, n = # of columns
// Space Complexity : O (1) no extra space
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Yes, faced minor issues while coding

import java.util.*;
public class spiralMatrix {

    public static List<Integer> spiral(int[][] matrix){
        if(matrix == null || matrix.length == 0) return new ArrayList<>();
        int m = matrix.length; int n = matrix[0].length;
        int top = 0; int bottom = m - 1; int left = 0; int right = n - 1;
        List<Integer> result = new ArrayList<>();
        while (top <= bottom && left <= right){

            // top row
            if(top <= bottom && left <= right){
                for(int i = left; i <= right; i++){
                    result.add(matrix[top][i]);
                }
                top++;
            }

            // right col
            if(top <= bottom && left <= right){
                for(int i = top; i <= bottom; i++){
                    result.add(matrix[i][right]);
                }
                right--;
            }
            
            // bottom row
            if(top <= bottom && left <= right){
                for(int i = right; i >= left; i--){
                    result.add(matrix[bottom][i]);
                }
                bottom--;
            }
            
            // left col
            if(top <= bottom && left <= right){
                for(int i = bottom; i >= top; i--){
                    result.add(matrix[i][left]);
                }
                left++;
            }


        }

        return result;
    }

    public static void main(String[] args) {

        int[][] matrix = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        System.out.println(spiral(matrix));
        
    }
    
}
