// Time Complexity : O(m*n); where m = number of rows and n = number of columns
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

// Your code here along with comments explaining your approach

class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        
        // check for null or empty matrix
        if(mat == null || mat.length == 0) return new int[0];
        
        
        // find number of rows and columns of the input matrix
        int m = mat.length;
        int n = mat[0].length;
        
        // create an answer array of m*n size
        int [] answer = new int [m*n];
        
        // intialize row and column variables as 0 for starting from mat[0][0]
        int r = 0;
        int c = 0;
        
        int i = 0;
        // initalize direction as upwards
        int direction = 1;
        
        while(i < m*n){
            
            answer[i] = mat[r][c];
            i++;
            
            // for upward direction
            if(direction == 1){
                
                //if we hit the last column then change the row and direction
                if(c == n - 1){
                    r++;
                    direction = -1;
                }
                //if we hit the first row then change the column and direction
                else if( r == 0){
                    c++;
                    direction = -1;
                }
                // else keep going upwards diagonally
                else{
                    r--;
                    c++;
                }
            }
            
            // for downward direction
            else{
                
                //if we hit the last row then change the column and direction
                if(r == m-1){
                    c++;
                    direction = 1;
                }
                //if we hit the first column then change the row and direction
                else if(c == 0){
                    r++;
                    direction = 1;
                }
                // else keep going downwards diagonally
                else{
                    r++;
                    c--;
                }
            }
            
        }
        return answer;
    }
}