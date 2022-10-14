// Time Complexity : O(m*n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : Yes
class FindDiagonalOrder {
    public int[] findDiagonalOrder(int[][] mat) {
        int m=mat.length;
        int n=mat[0].length;
        int [] result=new int[m*n];
        int index=0;
        int row=0;
        int col=0;
            int dir=1;
        
        while(index<result.length){
            result[index]=mat[row][col];
            index++;
            if(dir==1){
            if(row==0 && col!=n-1){
                col++;
                dir=-1;
            }
                else if(col==n-1){
                    row++;
                    dir=-1;
                }
                else{
                    row--;
                    col++;
                }
            }
           else{
               if(col==0 && row!=m-1){
                   row++;
                   dir=1;
               }
               else if(row==m-1){
                   col++;
                   dir=1;
               }
               else{
                   col--;
                   row++;
               }
           }
}
        return result;
    }
}
