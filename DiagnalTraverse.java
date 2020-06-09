// Time Complexity : O(m*n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes

class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {
        
        
        if(matrix  == null || matrix.length == 0 )
            return new int[]{};
        int m = matrix.length;
        int n = matrix[0].length;
        int[] result = new int[m*n];
        int direction = 1;
        int i = 0;
        int j = 0;
        int k=0;
      
        while(k < m*n){
            result[k] = matrix[i][j];
			//if upwards
            if(direction == 1){
            if(j == n-1)
            {
                i++;
                direction = -1;
            }
            else if(i == 0)
            {  
                j++;
                direction = -1; 
            }
            else{
                i--;
                j++;
            }
            
        }
		//if downwards
        else{
            if(i == m -1){
                j++;
                direction = 1;
            }
             else if( j == 0){
                direction = 1;
                i++;
            }
            else{
                j--;
                i++;
            }
            
        }
            k++;
            
        }
       
        return result;
    }
}