// Time Complexity :o(m*n)
// Space Complexity : o(1)
// Did this code successfully run on Leetcode :Yes

public class DiagonalTraversalMatrix {
    public int[] findDiagonalOrder(int[][] mat) {
        int n= mat.length;
        int m= mat[0].length;
        
        int[] result = new int[n*m];
        
        if(mat.length == 0 || mat[0].length == 0){
            return new int[0];
        }
        
        int i=0;
        int row =0;
        int col =0;
        
        boolean flag = true;
        
        while( row<n && col<m){
            
            if( flag ){
                
                while( row>0 && col < m-1){
                    result[i++] = mat[row][col];
                    row--;
                    col++;
                }
                result[i++] = mat[row][col];
                
                if(col == m-1){
                    row++;
                }else{
                    col++;
                }
                
            }else{
                
                while( col>0 && row < n-1){
                    result[i++] = mat[row][col];
                    row++;
                    col--;
                }
                result[i++] = mat[row][col];
                
                if(row == n-1){
                    col++;
                }else{
                    row++;
                }
                
            }
            
            flag = !flag;
        }
        
        return result;
        
    }
}
