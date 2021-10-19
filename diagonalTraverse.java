// Time Complexity : O(n*m)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach

class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        
        if(mat==null)
            return null;
        
        // 1 is up; 0 is down
        
        int direction = 1;
        
        int[] diagonalTraversal = new int[mat.length * mat[0].length];
        
        int i = 0;
        
        int row = 0;
        
        int column = 0; 
        
        while(i<mat.length * mat[0].length){
            
            diagonalTraversal[i]=mat[row][column];
            i++;
            
            if(direction==1){
                
                //check first corner case
                
                if(column==mat[0].length-1){
                    
                    row++;
                    direction = 0;
                    
                    
                }  else if(row==0){
                    
                    // check the second corner case
                    column++;
                    direction=0;
                    
                } else{
                    
                    // general case for all
                    
                    column++;
                    row--;
                }
                
                
            } else{
                
                 //check first corner case
                
                if(row==mat.length-1){
                    
                    column++;
                    direction=1;
                    
                } else if(column==0){
                    
                    // check the second corner case
                    
                    row++;
                    direction = 1;
                    
                    
                } else{
                    
                    //check the general case
                    column--;
                    row++;
                    
                }
                
            }
            
            
        }
        return diagonalTraversal;
    }
}