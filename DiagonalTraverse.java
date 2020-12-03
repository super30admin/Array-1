class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {
        if(matrix == null || matrix.length == 0){
            return new int[0];
        }
        int m = matrix.length;
        int n = matrix[0].length;
        int[] result = new int[m*n];
        int i=0,j=0,index=0;
        int dir=0;
        while(index < m*n){
            result[index] = matrix[i][j];
            if(dir == 0){
                if(j == n-1){
                    i++;
                    dir = 1;
                }else if( i== 0){
                    j++;
                    dir = 1;
                }else{
                    i--;
                    j++;
                }
            }else{
                if(i==m-1){
                    dir =0;
                    j++;
                }else if(j==0){
                    dir=0;
                    i++;
                }else{
                    i++;
                    j--;
                }
            }
            index++;
        }
        return result;
    }
}