// Time Complexity : O(n * m)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

public class DiagnonalTraverse {
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int i = 0, j= 0;
        boolean d = true;
        int[] res = new int[m*n];

        for(int k = 0; k < m*n; k++) {
            res[k] = mat[i][j];
            if(d) {
                if(j == n-1) {
                    i++;
                    d = false;
                } else if(i==0) {
                    j++;
                    d= false;
                } else {
                    i--;
                    j++;
                }
            } else {
                if (i == m-1) {
                    j++;
                    d = true;
                } else if(j == 0) {
                    i++;
                    d = true;
                } else {
                    i++;
                    j--;
                }
            }
        }

        return res;
    }
}
