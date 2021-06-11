class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {
        
        if(matrix == null || matrix.length == 0) 
            return new int[0];
        int row=0; int col=0;
        int m=matrix.length; int n=matrix[0].length; int dir=1;
        int[] result = new int[m*n];
        int i=0;
        while(i<m*n){
            result[i] = matrix[row][col];
            
            if(dir==1){
                if(col==n-1){
                    row++;dir=-1;
                } else if(row==0){
                    col++;dir=-1;
                } else{
                   row--;col++; 
                }
            } else {
                    if(row==m-1){
                        col++;dir=1;
                    } else if(col==0){
                        row++;dir=1;
                } else {
                   col--;row++;
                }
            }
        i++;
        }
        return result;
    }
}