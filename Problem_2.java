
public class Problem_2 {

public int[] findDiagonalOrder(int[][] matrix) {
        
        if(matrix.length == 0 || matrix == null){
            return new int[]{};
        }
        
        int[] output = new int[matrix.length * matrix[0].length];
        int i = 0;
        int row = 0;
        int col = 0;
        int m = matrix.length;
        int n = matrix[0].length;
        
        int dir = 1;
        
        while(i < matrix.length * matrix[0].length){
            
            
            output[i] = matrix[row][col];
            
            
            if(dir == 1){
                if(col == n-1){
                    dir = -1;
                    row++;
                }else if(row == 0){
                    col++;
                    dir  = -1;
                }else{
                    row--;
                    col++;
                }
            }else{
                if(row == m-1){
                    dir = 1;
                    col++;
                }else if(col == 0){
                    dir = 1;
                    row++;
                }else{
                    row++;
                    col--;
                }
            }    
            
            i++;
        }
        
        return output;
    }
}
