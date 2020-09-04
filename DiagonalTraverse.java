// Time Complexity : o(n*m) where n is the number of rows and m is the number of columns
// Space Complexity : o(1)
// Did this code successfully run on Leetcode :yes
// Three line explanation of solution in plain english
/* Initialize a boolean pointer for direction as we are traversing down and up diagonally
When direction is up, then traversal is by decrementing row and increementing column.
When direction is down, then the traversal is by increementing row and decrementing column.
*/
// Your code here along with comments explaining your approach


class DiagonalTraverse {
    public int[] findDiagonalOrder(int[][] matrix) {
        
        if(matrix == null || matrix.length ==0){
            return new int[0];
        }
        
        int n = matrix.length;
        int m = matrix[0].length;
        
        int i =0, j=0, idx = 0; 
        int[] result = new int[n*m];
        boolean dir = true;
        
        while(idx<m*n){
            result[idx] = matrix[i][j];
            idx++;
            
            
            // when direction is up
            if(dir){
                //when we hit the last column then, direction becomes down and row increments
                if(j==m-1){
                    dir = false;
                    i++;
                    //when we hit the first row, then also direction changes to down and column increments
                }else if(i==0){
                    dir = false;
                    j++;
                    // when we don't hit the cut off cases, we are traversing by decrementing row and increementing column
                }else{
                    i--;
                    j++;
                    
                }
                //When direction is down
            }else{
                //when we hit the last row then, direction becomes up and column increments
                if(i==n-1){
                    dir = true;
                    j++;
                    //when we hit the first column, then also direction changes to top and row increments
                }else if(j== 0){
                    dir = true;
                    i++;
                    // when we don't hit the cut off cases, we are traversing by incrementing row and decrementing column
                }else{
                    i++;
                    j--;
                    
                }
            }
            
        }
        return result;
    }
}