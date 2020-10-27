// Time Complexity :O(n*n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : No


class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {
        // edge
        if(matrix == null || matrix.length == 0) return new int[]{};
        
        // set direction up
        int dir=1;
        // start from first element so set i=0 and j=0
        int i=0; int j=0 ;
        // number of rows
        int m = matrix.length;
        // number of columns
        int n = matrix[0].length;
        // initialize resiltant array
        int[] result = new int[m*n];
        int index =0;
        
        // iterate through all elements
        while(index < m*n){
            result[index] = matrix[i][j];
            
            // when going uop
            if(dir==1){
                
                // right corner
                 if(j==matrix[0].length-1){
                    i++; dir=-1;
                    // first row
                }else if(i==0){
                    j++; dir=-1;
                    // normal going up
                }else{
                    i--;
                    j++;
                }
                // when going down
            }else{
                
                // left corner
                if(i==matrix.length-1){
                    j++; dir=1;
                    // last column
                }else if(j==0){
                    i++; dir=1;
                    // normal going down
                }else{
                    i++;
                    j--;
                }
                
            }
            
           
            
            
            
            index++;
        }
        
        return result;
        
        
        
        
        
        
    }
}