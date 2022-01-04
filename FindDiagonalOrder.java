// Time Complexity :O(n * m) where m is row and n is col length of input matrix
// Space Complexity : O(1) since we are using any additional space
// Did this code successfully run on Leetcode : yes

public class FindDiagonalOrder {
    public static void main(String[] args) {
        
    }

    public static int[] findDiagonalOrder(int[][] mat) {
        if(mat == null || mat.length == 0){
            return new int[0];
        }
        
        int row = mat.length, col = mat[0].length;
        int r = 0, c = 0, i = 0;
        boolean up = true;
        int[] res = new int[row * col];
        
        while(r < row && c < col && i < res.length){
            res[i++] = mat[r][c];
            
            if(up){
                if(c == col - 1){
                    r++;
                    up = !up;
                }else if(r == 0){
                    c++;
                    up = !up;
                }else{
                    r--; c++;
                }
            }else{
                if(r == row - 1){
                    c++;
                    up = !up;
                }else if(c == 0){
                    r++;
                    up = !up;
                }else{
                    c--; r++;
                }
            }
        }
        return res;
    }
}
