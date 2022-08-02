//TC: O(mn) iterating through all the  elements in the 2D array
// SC: O(1) res[] is output
//leetcode: successful
class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
         int res[] = new int[m*n];
        if(mat == null || mat.length==0)
            return new int[] {};
        int row =0;
        int col = 0;
        int dir = 1;
        int index =0;
        while(index < res.length){
            res[index] = mat[row][col];
            index++;
            if(dir ==1){
            if(row ==0 && col != n-1)
            { col++;
             dir =-1;
            }
            else if(col== n-1)
            {
                row++;
                dir =-1;
            }
            else{
                row--;
                col++;
            }            
            }
           else {
               if(col==0 && row!=m-1){
                   row++;
                   dir = 1;
               }
               else if(row==m-1 ){
                   col++;
                   dir =1;
               }
               else {
                   row++;
                   col--;
               }
        }
        }
       return res;
    }
}
