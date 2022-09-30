class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        if(mat.length == 0 || mat[0].length == 0) return new int[0];
        int m = mat.length;
        int n = mat[0].length;
        int arr[] = new int[m*n];
        int row = 0, col = 0, i = 0;
        boolean dir = true;
        while(row<m && col<n){
            if(dir){
                while(row>0 && col < n-1){
                    arr[i++] = mat[row][col];
                    row--;
                    col++;
                }
                arr[i++] = mat[row][col];
                if(col == n-1){
                    row++;
                }
                else{
                    col++;
                }
            }
            else{
                while(col>0 && row < m-1){
                    arr[i++] = mat[row][col];
                    row++;
                    col--;
                }
                arr[i++] = mat[row][col];
                if(row == m-1){
                    col++;
                }
                else{
                    row++;
                }
            }
            dir = !dir;
        }
        return arr;
}
    
    
}