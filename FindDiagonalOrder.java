// Time Complexity : O(M*N) we are just iterating over the matrix
// Space Complexity : O(1)  as we need result matrix to return we are not using any additional space
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no
// Three line explanation of solution in plain english: After observing the upward and downward directions we can see a general case(row-- and column++ to go up and row++ and column-- to go down) and 2 egde cases per direction(first row and last column for going up and first column and last row to go down)

// Your code here along with comments explaining your approach

class FindDiagonalOrder {
    public int[] findDiagonalOrder(int[][] mat) {
        
        // null cases
        if(mat.length  == 0 || mat == null){
            return new int[0];
        }
        
        //initializing variables 
        int m = mat.length;
        int n = mat[0].length;
        int noOfElements = m*n;
        int result[] = new int[noOfElements];
        
        int dir = 1; // dir is 1 for upward direction and -1 for downward direction
        int count = 0;
        int i = 0 ;
        int j = 0;
        while(count < noOfElements){
           result[count] = mat[i][j];
           count++;
           if(dir == 1){
               if(j == n-1){
                   dir = -1;
                   i++;
               }
               else if(i == 0){ 
                   dir = -1;
                   j++;
               }
               else{ // general case for going up
                   i--;
                   j++;
               }
               
           } 
           else{
               if(i == m-1){
                   dir = 1;
                   j++;
               }
               else if(j == 0){
                   dir = 1;
                   i++;
               }
               else{ // general case for going down
                   i++;
                   j--;
               }
           }
        
            
        }
        return result;

        
    }
}