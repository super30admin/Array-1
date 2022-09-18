import java.util.*;
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        int left=0;
        int right=matrix[0].length-1;
        int top=0;
        int bottom=matrix.length-1;
        
        List<Integer> sp=new LinkedList<>();
        
        while(left<=right&&top<=bottom){
            
            for( int i=left;i<=right;i++){
                
                    sp.add(matrix[top][i]);        
            }
            top++;
            
            if(right>=left){
            for( int i=top;i<=bottom;i++){
                
                    sp.add(matrix[i][right]);        
            }
            right--;}
            
            if(bottom>=top){
                
            for( int i=right;i>=left;i--){
                
                    sp.add(matrix[bottom][i]);        
            }
            bottom--;
            }
            
            if(left<=right){
            for( int i=bottom;i>=top;i--){
                
                    sp.add(matrix[i][left]);        
            }
            left++;
        }
        }
        return sp;
        
        
    }
}