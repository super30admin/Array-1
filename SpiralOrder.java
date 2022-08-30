import java.util.ArrayList;
import java.util.List;

/**
## Problem 3
Given a matrix of m x n elements (m rows, n columns), return all elements of the matrix in spiral order.
 
Time Complexity :   O (M*N) 
Space Complexity :  O (1) 
Did this code successfully run on Leetcode :    Yes (54. Spiral Matrix)
Any problem you faced while coding this :       No
 */

class SpiralOrder {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<Integer>();
        
        int m = matrix.length;     // rows
        int n = matrix[0].length;  // columns
        
        int top = 0, bottom = m - 1;
        int left = 0, right = n - 1;
        while( left <= right && top <= bottom){
            // Top wall
            if(top <= bottom){
                for(int j=left; j<= right; j++){
                    list.add(matrix[top][j]);
                }
                top++;
            }
            
            // Right wall
            if( left <= right){
                for(int i=top; i<= bottom; i++){
                    list.add(matrix[i][right]);
                }
                right--;
            }
            
            // Bottom wall
            if(top <= bottom){
                for(int j= right; j>= left; j--){
                    list.add(matrix[bottom][j]);
                }
                bottom--;
            }
            
            // Left wall
            if( left <= right){
                for(int i=bottom; i>= top; i--){
                    list.add(matrix[i][left]);
                }
                left++;
            }
        }
        return list;
    }
    
    public static void main(String args[]) 
    { 
        SpiralOrder obj = new SpiralOrder();
        int[][] mat = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        int[] res = obj.spiralOrder(mat);

        // print result
        for(int num: res){
            System.out.print(num +" ");
        }
    }
}