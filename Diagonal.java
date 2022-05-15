// Time Complexity : O(m*n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : YES
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach

class Diagonal {
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int size = m*n;
        int [] result = new int[size];
        if(mat == null) return result;
        int dir = 1; int r = 0; int c = 0; int i = 0;

        while(i<size) {
            result[i] = mat[r][c];
            i++;
            if(dir == 1) {
                if(r == 0 && c != n-1) {
                    c++;
                    dir = -1;
                } else if(c == n-1) {
                    r++;
                    dir = -1;
                } else {
                    r--;
                    c++;
                }

            } else {
                if(c == 0 && r != m-1) {
                    r++;
                    dir = 1;
                } else if(r == m-1) {
                    c++;
                    dir = 1;
                } else {
                    r++;
                    c--;
                }
            }
        }
        return result;
    }
}