// Time Complexity : o(m * n)
// Space Complexity : o( 1) cuz we aint using any auxillary ds, we were suppsoed to return int[] and we are
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english
// idea is to handle edge cases and its order
// need to understand how if else works 
// Your code here along with comments explaining your approach
class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        if(mat == null || mat.length == 0) {
            return new int[]{};
        }
        int index = 0;
        int m = mat.length;
        int n = mat[0].length;
        int[] result = new int[m * n];
        int r = 0;
        int c = 0;
        int dir = 1;
        while(index < m * n) {
            result[index] = mat[r][c];
            index++;
            if(dir == 1) {
                if(c == n - 1) {
                    dir = -1;
                    r++;
                }
                else if(r == 0) {
                    dir = -1;
                    c++;
                }
                else {
                    r--;
                    c++;
                }
            }
            else {
                if(r == m - 1) {
                    dir = 1;
                    c++;
                }
                else if(c == 0) {
                    dir = 1;
                    r++;
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