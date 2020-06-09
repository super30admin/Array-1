/*
    Space Complexity : O(1) No Space is required 
    time Complexity : O(M*N) M =  no of rows, N=  no of columns,
    isWorkedonLeetcode : YES
    Difficulty faced :  in handling the edge case
*/

import java.util.ArrayList;
import java.util.List;


public class Spiral_Matrix{
    public List<Integer> spiralOrder(int[][] matrix) {
        
        if (matrix == null || matrix.length == 0 ) return new ArrayList<Integer>();
        
        int row = matrix.length;
        int col =  matrix[0].length;
        
        int top = 0;
        int left = 0;
        int right =  col - 1;
        int bottom =  row - 1;
        ArrayList<Integer> al =  new ArrayList<Integer>();
        
        while( top <=  bottom && left <= right){
            
//             go from left to right
            if ( top <=  bottom && left <= right){
                for(int i= left; i<= right; i++){
                    al.add(matrix[top][i]);        
                }    
            }
            
               // change top go till bottom
            top++;
            
            if ( top <=  bottom && left <= right){
                for(int i = top;i <= bottom; i++){
                    al.add(matrix[i][right]);
                }   
            }
         // decrement right and go towards left
            right--;
            
            if ( top <=  bottom && left <= right){
                for(int i = right; i>=left ; i--){
                    // al.add(matrix[bottom][i]);
                        al.add(matrix[bottom][i]);
                }    
            }
            
             
//             decrement bottom and go upwards
            bottom--;
            if ( top <=  bottom && left <= right){
                for(int i=bottom;i >=top;i--){
                    al.add(matrix[i][left]);
                }    
            }
            
               // increment the left
            left++;
            
        }
        return al;
        
    }
}