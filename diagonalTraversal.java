// TC: O(m*n) where m = rows n = cols
// SC: O(1) because return type is array
// Works on Leetcode
// No problem faced

class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int n = mat[0].length;
        int m = mat.length;
        
        int result[] = new int[m * n];
        int idx = 0;
        int r = 0;
        int c = 0;
        int dir = 1; //  1->upwards , -1 -> downwards
        
        while (idx < m * n) {
            result[idx] = mat[r][c];
            idx++;
            if (dir == 1) {
                if (c == n -1) {
                    dir = -1;
                    r++;
                } else if (r == 0) {
                    dir = -1;
                    c++;
                } else {
                    r--;
                    c++;
                }
            } else {
                if (r == m - 1) {
                    dir = 1;
                    c++;
                } else if (c == 0) {
                    dir = 1;
                    r++;
                } else {
                    r++;
                    c--;
                }
            }
        }
        return result;
    }
}
