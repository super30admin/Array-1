class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {
        int m = matrix.length;
        if(m ==0) return new int[0];
        int n = matrix[0].length;
            
        int[] result = new int[m*n];
        int r = 0;
        int c = 0;
        for(int i=0; i<m*n; i++){
            result[i] = matrix[r][c];
            if((r + c) % 2 == 0){
                if(c == n-1){
                    r++;
                }
                else if(r == 0 ){
                    c++;
                }
                else{
                    c++;
                    r--;
                }   
            }
            else{
                if(r == m - 1){
                    c++;
                }
                else if(c == 0){
                    r++;
                }
                else{
                    r++;
                    c--;
                }
            }
            
        }
        return result;
    }
}