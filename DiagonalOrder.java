// Time Complexity : O(m * n)
// Space Complexity : O(m * n)
// Did this code successfully run on Leetcode : Yes 
// Three line explanation of solution in plain english

/*Keep two directions for travelling upwards and downwards
 * If moving upwards, keep copying the value of indices to result array and change the direction once we encounter corner of the matrix
 *  Same is followed while moving downwards
 * */ 

// Your code here along with comments explaining your approach


public class DiagonalOrder {
    public int[] findDiagonalOrder(int[][] mat) {
        
        boolean direction = true; // going downwards
        //dir = true --> going upwards
        int rows = mat.length;
        int cols = mat[0].length;
        
        int i = 0 , j = 0 ;
        int[] res = new int[rows*cols];
        
        int index = 0;
        
        while(i < rows && j < cols) {
            res[index++] = mat[i][j];
            
                if(!direction){                    
                    //traversing the diagonal downward                 
                 if(i == rows - 1 ) {                  
                    direction = !direction;
                    j++;
                    
                 } else if(j == 0 ) {   
                     i++;
                     direction = !direction;
                 }
                    else {
                        i++;
                        j--;     
                     }              
                } else {
         //traversing the diagonal upward                    
                  if(j == cols - 1) {   
                     i++;
                     direction = !direction;
                 } else if(i == 0 ) {                      
                    direction = !direction;
                    j++;
                    
                 } else {
                        i--;
                        j++;     
                     } 
                } 
        
    }
        
    return res;    
}
}