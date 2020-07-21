// Time Complexity : O(M*N) where M is the number of Rows & N is number of columns.
// Space Complexity : O(N) - Output Array Space

// Approach:
//     Traverse in up & down direction using dir variable until i reaches M*N.
//     Keep eye on when i reach the boundaries during traversal.

class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {
        
        if(matrix == null || matrix.length<1)
            return new int[]{};
        
        int M = matrix.length;
        int N = matrix[0].length;
        
        int[] result = new int[M*N];
        
        int dir = 1;
        int row = 0;
        int col= 0;
        
        int i =0;
        
        while(i<M*N){
            result[i] = matrix[row][col];
            if(dir == 1){
                if (col == N-1){
                    row++;
                    dir = -1;
                } else if(row == 0){
                    col++;
                    dir = -1;
                } else{
                    col++;
                    row--;
                }
            } else if(dir == -1){
                if(row == M-1){
                    col++;
                    dir = 1;
                }else if(col == 0){
                    row++;
                    dir = 1;
                } else{
                    row++;
                    col--;
                }
            }
            i++;
        }    
        return result;
    }
}