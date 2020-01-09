import java.util.ArrayList;
import java.util.List;

public class Problem_3 {
	
public List<Integer> spiralOrder(int[][] matrix) {
        
        if(matrix.length == 0 || matrix == null){
            return new ArrayList<>();
        }
        
        int m = matrix.length;
        int n = matrix[0].length;
        
        int top = 0;
        int bottom = m - 1;
        
        int left = 0;
        int right = n - 1;
        
        List<Integer> output = new ArrayList<>();
        
        while(left <= right && top <= bottom){
            
            //Top row
            for(int i = left; i<= right; i++){
                output.add(matrix[top][i]);
            }
            
            top++;
            
            //right row
            for(int i = top; i<= bottom; i++){
                System.out.println(i + " : "+right);
                output.add(matrix[i][right]);
            }
            
            right--;
            
            //Bottom row
            
            if(top <= bottom){
                for(int i = right; i >= left; i--){
                output.add(matrix[bottom][i]);
                }
                
            }
            
            bottom--;
            
            //left row
            if(left <= right && top <= bottom){
                for(int i = bottom; i >= top; i--){
                output.add(matrix[i][left]);
                }    
            }
            
            
            left++;
        }
        
        return output;
    }

}
