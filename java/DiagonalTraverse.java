// Time Complexity : O(M*N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english
/*
dir =1 for up diagonal
we update the row if it reaches end of the column and change direction
If first row update the column and direction else decrement the rows and increment the columns for the up diagonal traversal

dir=-1 for down diagonal
If last row, increment the col and update direction
if first column increment the row and direction
else keep increment the rows and decrement the columns for the down diagonal traversal
 */

// Your code here along with comments
// class Solution {
public int[]findDiagonalOrder(int[][]mat){
        if(mat==null||mat.length==0)return null;
        int m=mat.length,n=mat[0].length;
        int[]res=new int[m*n];
        int dir=1,row=0,col=0,i=0;
        while(i<m*n){
        res[i++]=mat[row][col];
        //up diagonal
        if(dir==1){
        if(col==n-1){
        row++;
        dir=-1;
        }
        else if(row==0){
        col++;
        dir=-1;
        }else{
        row--;
        col++;
        }
        } //down diagonal
        else{
        if(row==m-1){
        col++;
        dir=1;
        }else if(col==0){
        row++;
        dir=1;
        }else{
        row++;
        col--;
        }
        }
        }
        return res;
        }
        }