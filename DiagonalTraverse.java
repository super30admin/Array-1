
class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        if(mat==null)
            return new int[0];
        int m=mat.length,n=mat[0].length,i=0,row=0,col=0,dir=1;
        int result[]=new int[m*n];
        while(i<m*n){
            result[i]=mat[row][col];
            //up
            if(dir==1){
                if(col==n-1){
                    row++;
                    dir=-1;
                }else if(row==0){
                    col++;
                    dir=-1;
                }else{
                    row--;
                    col++;
                }
            }
            //down
            else{
                if(row==m-1){
                    dir=1;
                    col++;
                }else if(col==0){
                    row++;
                    dir=1;
                }else{
                    row++;
                    col--;
                }   
            }
            i++;
        }
        return result;
    }
}