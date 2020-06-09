class Solution {
    
    // Time Complexity: O(m*n) - m*n is the size of the matrix
    //Space Complexiity: O(1) - only resultant list is used
    // Work in LeetCode: Yes
    public int[] findDiagonalOrder(int[][] matrix) {
        if( matrix == null  || matrix.length == 0) return new int[]{};
        int[] res = new int[matrix.length * matrix[0].length];
        int k = 0;
        int r = 0;
        int c = 0;
        int dir = 1;
        int m = matrix.length;
        int n = matrix[0].length;
        while (k < m * n ) {
            res[k++] = matrix[r][c];
            if(dir == 1) {
            if (c == n -1 ) {
                r++;dir = -1;
            }
            else if (r == 0) {
                c++; dir = -1;
                
            }
            else {
                r--;c++;
            }
            }
            else
            {
               if (r == m -1 ) {
                c++;dir = 1;
            }
            else if (c == 0) {
                r++; dir = 1;
                
            }
            else {
                c--;r++;
            } 
            }
        }
        return res;
    }
}
