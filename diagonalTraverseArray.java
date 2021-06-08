// Time Complexity:  O(n)
// Space Complexity: O(1)

class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int dir = 1;
        int row = 0; int cols = 0;
        int m = mat.length; int n = mat[0].length;
        int[] result = new int[m * n];
        int i=0;
        while (i < m*n){
            result[i] = mat[row][cols];
            if(dir == 1){
                if(cols == n-1){
                    row++; dir = -1;
                } else if (row == 0){
                    cols++; dir = -1;
                } else {
                    row--;
                    cols++;
                }
            } else {
                if(row == m-1){
                    cols++; dir = 1;
                } else if (cols == 0){
                    row++; dir = 1;
                } else {
                    cols--; 
                    row++;
                }
            }
            i++;
        }
        return result;
    }
}
