 // Time Complexity : O(n*m)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :Yes




class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
      int m = mat.length;
        int n = mat[0].length;
        int [] res = new int[m*n];
        int dir =1;
        int row =0;
        int col =0;
        int i =0;
        while(i<res.length){
            res[i] = mat[row][col];
            i++;
            //upward direction
            if(dir==1){
                if(col==n-1){
                    row++;
                    dir=-1;
                }
                else if(row==0){
                    col++;
                    dir=-1;
                }
                else{
                    row--;
                    col++;
                }
            }
            //downward direction
            else{
                if(row==m-1){
                    col++;
                    dir=1;
                }
                else if(col==0){
                    row++;
                        dir=1;
                }
                else{
                    col--;
                    row++;
                }
            }
        }
        return res;
    }
}