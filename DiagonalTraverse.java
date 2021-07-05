// Time Complexity : O(n*m)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes


// Your code here along with comments explaining your approach

class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {
        
        //edge condition
        if(matrix == null || matrix.length == 0){
            return new int[0];
        }
        
        //number of rows and columns of given matrix
        int n = matrix.length;//row
        int m = matrix[0].length;//column
        
        //declaring a new array of size n*m
        int[] result = new int[n*m];
        
        //direction - upward traversal = 1, downward traversal = -1
        int dr = 1;
        
        //declaring 2 pointers to keep track of row and column
        int r = 0;
        int c = 0;
        
        for(int i = 0; i < n*m; i++){
            
            result[i] = matrix[r][c];
            
            // upward traversal
            if(dr == 1){
                //if end of column reaches increment row
                //else if it is in row 0 just increment column
                //else move to above rows next column
                if(c == m-1){
                    r++;
                    dr = -1;
                }else if( r == 0){
                    c++;
                    dr= -1;
                }else{
                    r--;
                    c++;
                }
            }
            //downward traversal
            else{
                // if we are in last row just increment column
                //else if we are in column 0 increment the column
                //else move to next rows previous column
                if(r == n-1){
                    c++;
                    dr = 1;
                }else if(c == 0){
                    r++;
                    dr = 1;
                }else{
                    r++;
                    c--;
                }
            }
        }
        
        return result;
    }
}
