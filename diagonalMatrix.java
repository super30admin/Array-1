/*
Time complexity : O(m*n)
Space complexity: O(1)
*/
public class diagonalMatrix {
    public int[] findDiagonalOrder(int[][] mat) {
        if(mat == null) return new int[0];
        int m = mat.length;
        int n = mat[0].length;
        int [] res = new int[m*n];
        int k = 0;
        int dir = 1;
        int i = 0, j = 0;
        while(k < m*n) {
            res[k] = mat[i][j];
            k++;
            if(dir == 1) {
                if(j == n-1) {
                    i++; dir = -1;
                } else if(i == 0) {
                    j++; dir = -1;
                } else {
                    i--; j++;
                }
            } else {
                if(i == m-1) {
                    j++; dir = 1;
                } else if(j == 0) {
                    i++; dir = 1;
                } else {
                    j--; i++;
                }
            }
        }
        return res;
    }
}