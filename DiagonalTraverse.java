// Time Complexity : O(m*n), where m is the number of rows and n is the number of columns of input array
// Space Complexity : O(m*n), where m is the number of rows and n is the number of columns of input array
// Did this code successfully run on Leetcode :
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach

class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {
        
        int row_len = matrix.length;
        if(row_len==0)
            return new int[0];
        int col_len = matrix[0].length,d=1,row=0,col=0,i=0;
        int[] arr = new int[row_len*col_len];
        while(i<row_len*col_len){
            arr[i++] = matrix[row][col];
            if(d==1){
                if(col==col_len-1){
                    d*=-1;
                    row++;
                } else if(row==0){
                    col++;
                    d*=-1;
                }else{
                    col++;
                    row--;
                }
            }else{
                if(row==row_len-1){
                    d*=-1;
                    col++;
                } else if(col==0){
                    row++;
                    d*=-1;
                }else{
                    col--;
                    row++;
                }
            }
        }
        return arr;
    }
}