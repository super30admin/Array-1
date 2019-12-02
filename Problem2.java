/**
LeetCode Submitted : YES
Time Complexity : O(N)
Space Complexity : O(1)

We are storing the pointers (row/column) based on direction we are moving forward and back and correspondingly changing directions if we reach boundary conditions

**/



class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {
        
        
        if(matrix == null || matrix.length < 1)    
        {
            int out1[] = {}; 
            return out1;
        
        }
            
        int num_rows = matrix.length;
        int num_cols = matrix[0].length;
        
        int[] out = new int[num_rows * num_cols]; 
            
        int dir = 2; //Backward 
        
        //Assign the matrix first position
        out[0] = matrix[0][0];
        
        int i = 0; 
        int j = 0;
        
        int count = 1;
        
        while(i >= 0 && j >= 0 && i < num_rows && j < num_cols && count < out.length){
            
            if(dir == 1){
              if(i == num_rows - 1)
                    j = j + 1;
                else
                    i = i + 1;
                
                while(i >= 0 && j < num_cols){
                    
                    out[count] = matrix[i][j];
                    count ++;
                    i--;
                    j++;
                }
                
                i++;
                j--;
                dir = 2;
            }else{ //Backward
                if(j == num_cols - 1)
                    i = i + 1;
                else
                    j = j + 1;
                
                while(j >= 0 && i < num_rows){
                    
                    out[count] = matrix[i][j];
                    count ++;
                    i++;
                    j--;
                }
                
                i--;
                j++;
                dir = 1;
                
        }
        
        
        }
        return out;
    }
        
}
