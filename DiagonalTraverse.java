// Time Complexity: O(m*n)
// Space Complexity: O(1)
// Did this code successfully run on Leetcode : Yes

public class DiagonalTraverse {
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int[] result = new int[m*n];
        //null case
        if(mat == null) return new int[0];
        int r = 0, c = 0; int dir = 1;
        int i = 0; // index of result array
        while(i < m*n) {
            result[i] = mat[r][c];
            i++;
            //move to the next element in the matrix
            if(dir == 1) {
                if(r == 0 && c != n-1) {
                    dir = -1;
                    c++;
                }
                else if(c == n-1) {
                    dir = -1;
                    r++;
                }
                else {
                    r--;
                    c++;
                }
            }
            else {
                if(c == 0 && r != m-1) {
                    dir = 1;
                    r++;
                }
                else if(r == m-1) {
                    dir = 1;
                    c++;
                }
                else {
                    c--;
                    r++;
                }
            }
        }
        return result;
    }
}
