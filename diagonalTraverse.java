// Time Complexity: O(n*m)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {
        //edge condition
        if(matrix == null || matrix.length == 0){
            return new int[0];
        }
        int row = matrix.length;
        int col = matrix[0].length;
        
        //directions can be up or down 
        int dir = 1; //initial direction is 1(up)
        //declaring the size of the array to be of size row*col
        int[] result = new int[row * col];
        
        //declaring two pointers, r and c which keep track of current row and columns
        int r = 0;
        int c = 0;
        
        for(int i = 0;i < row * col; i++){
            
            result[i] = matrix[r][c];
            
            //dir=1 means upward traversal
            if(dir == 1){
                
                //if col end is reached, increment row
                //else if it is in row=0 increment col as row cant decrement more
                //else move to above rows and next col element
                if(c == (col-1)){
                    r++;
                    dir = -1;
                }
                else if(r == 0){
                    c++;
                    dir = -1;
                }
                else{
                    r--;
                    c++;
                }
            }
            //dir = -1 means downward traversal
            else{
                //if row end is reached, increment col
                //else if it is in col=0 increment col as col cant decrement more
                //else move to above rows and previous col element
                
                if(r == row-1){
                    c++;
                    dir = 1;
                }
                else if(c == 0){
                    r++;
                    dir = 1;
                }
                else{
                    r++;
                    c--;
                }
            }
        }
        
        return result;
    }
}