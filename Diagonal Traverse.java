//Time Complexity  :O(m*n)
//Space Complexity : O(1) if the output array space is not considered.
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no
// Your code here along with comments explaining your approach
class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {
        if(matrix == null || matrix.length==0){
            return new int[] { };
        }
        int n = matrix.length;//COL length
        int m = matrix[0].length;//ROW length
        //declare the output array of size m*n
        int[] res = new int[m*n];
        res[0] = matrix[0][0];
        //initialize row, col and direction.The direction is either up or down. At first, start from up so dir = 1.
        int row = 0,col = 0, dir=1,ptr=1;
        //iterate through the matrix
        while(ptr<m*n){
            //going upward
            if(dir==1){
                //if col is about to go out of bound then move to next row
                if(col==m-1){
                    dir = -1;
                    row++;
                    res[ptr] = matrix[row][col];
                    ptr++;
                }
                //col is changed in the first row
                else if(row==0){
                    dir = -1;
                    col++;
                    res[ptr] = matrix[row][col];
                    ptr++;
                    
                }
                //otherwise just move to next col and up
                else{
                    col++;
                    row--;
                    res[ptr] = matrix[row][col];
                    ptr++;
                }
                
            }
            //going downward
            else{
                 //if row is about to go out of bound then move to next col
                if(row == n-1)
                {
                    dir = 1;
                    col++;
                    res[ptr] = matrix[row][col];
                    ptr++;                
                }   
                //change rows to move up
                else if(col==0){
                    dir = 1;
                    row++;
                    res[ptr] = matrix[row][col];
                    ptr++;
                }
                //otherwise move to next row
                else{
                    row++;
                    col--;
                    res[ptr] = matrix[row][col];
                    ptr++;
                }
            }
        }
        
        return res;
    }
}