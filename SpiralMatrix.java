// Time Complexity : O(Row * Col) - as we traverse every element in the matrix
// Space Complexity :O(1) - constant space
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english

//Here we fix the boundary by four pointers - Top, Left, Right and Bottom
//In Top Row: Traverse from Left - Right. Increment Top as we have processed the top row. 
//In Right Column: Traverse Top to Bottom. Decrement Right as that column is processed. 
//Check if Top <= Bottom. In Bottom Row: Traverse Right - Left. Decrement Bottom.
//Check if Left <= Right. In Left Row: Traverse Bottom - Top. Increment Left.


import java.util.List;
import java.util.ArrayList;


public class SpiralMatrix {

    public List<Integer> spiralOrder(int[][] matrix) {
        
        List<Integer> list = new ArrayList<>();
        if(matrix == null || matrix.length == 0) return list;
        
        int m = matrix.length, n = matrix[0].length;
        int T = 0, L = 0, R = n-1, B = m-1;
        
        while(T <= B && L <= R){
            
            //Top
            for(int i = L; i <= R; i++) list.add(matrix[T][i]);
            T++;
            
            //Right
            for(int i = T; i <= B; i++) list.add(matrix[i][R]);
            R--;
            
            //Bottom
            if(T <= B){
            for(int i = R; i >= L; i--) list.add(matrix[B][i]);
            B--;
            }
            
            //Left
            if(L <= R){
            for(int i = B; i >= T; i--) list.add(matrix[i][L]);
            L++;
            } 
        }
        return list;
    } 
    
}
