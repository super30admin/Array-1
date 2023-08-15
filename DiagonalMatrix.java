// Time Complexity : O(mn)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes

class DiagonalMatrix{
    
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int[] res = new int[m*n];
        int dir = 1;
        int i = 0;
        int j = 0;
        int idx = 0;
        while(idx < res.length){
            result[idx] = matrix[i][j];
            idx++;
            if(dir == 1){
                //up
                if(j == n-1){
                    i++;  dir=-1;
                }else if(i==0){
                    j++; dir = -1;
                }else{
                    j++; i--;
                }
            }else{
                //down
                if(i == m-1){
                    j++; dir = 1;
                }else if(j == 0){
                    i++; dir = 1;
                }else{
                    i++;
                    j--;
                }
            }
        }
        return result;
    }
}
