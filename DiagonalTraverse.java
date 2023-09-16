class DiagonalTraverse {
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int[] result = new int[m*n];
        int row = 0, col = 0;
        boolean flag = true;
        for(int i=0; i<result.length; i++){
            result[i] = mat[row][col];
            if(flag){
                if(col == n-1){
                    flag = false;
                    row++;
                }else if(row == 0){
                    flag = false;
                    col++;
                } else{
                    row--; col++;
                }

            }else{
                if(row == m-1){
                    flag = true;
                    col++;
                    
                } else if(col == 0){
                    flag = true;
                    row++;
                }else{
                    row++; col --;
                }

            }
        }
        return result;
    }
}