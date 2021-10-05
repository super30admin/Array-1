import java.util.ArrayList;
import java.util.List;

// Time Complexity : O(m * n ) => n = number of row and m = number of column
// Space Complexity : O(1)  if we do not consdier result list space
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
class SpiralMatrix_54 {
    public List<Integer> spiralOrder(int[][] matrix) {
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0){
            return new ArrayList<>();
        }
        
        List<Integer> result = new ArrayList<>();
        
        int n= matrix.length;
        int m = matrix[0].length;
        
        int top = 0;
        int bottom = n -1;
        int left = 0;
        int right = m -1;
        
        while(top <= bottom && left <= right){
            
            for(int x=left;x <=right ;x++){
                result.add(matrix[top][x]);
            }
            top++;
            
            for(int x=top;x <=bottom ;x++){
                result.add(matrix[x][right]);
            }
            right--;
            
            if(left <= right && bottom >= top){
                for(int x=right; x >= left ;x--){
                    result.add(matrix[bottom][x]);
                }
                bottom--;

                for(int x=bottom; x >= top ;x--){
                    result.add(matrix[x][left]);
                }
                left++; 
                
            }
            
              
        }
        
        return result;
    }
}

//TC : (m * n )
//SC : (1)