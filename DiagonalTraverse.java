// Time Complexity  : O(m * n) where m = number of rows, n = number of columns
// Space Complexity : O(1) excluding the output array (result), we use constant extra space
// Did this code successfully run on Leetcode : Yes
// Approach:
// 1. Traverse the matrix diagonally using a direction flag (`dirUp`) to switch between upward and downward traversals.
// 2. At each step, compute the next cell based on current direction and matrix boundaries.
// 3. Store elements in the result array while changing direction only when hitting matrix borders.

public class DiagonalTraverse {
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;

        int[] result = new int[m * n];
        int r = 0, c = 0;
        boolean dirUp = true;

        for(int i = 0; i < m * n; i++){
            result[i] = mat[r][c];

            if(dirUp){
                if(c == n - 1){
                    r++;
                    dirUp = false;
                }else if(r == 0){
                    c++;
                    dirUp = false;
                }else{
                    r--;
                    c++;
                }
            }else{
                if(r == m - 1){
                    c++;
                    dirUp = true;
                }else if(c == 0){
                    r++;
                    dirUp = true;
                }else{
                    r++;
                    c--;
                }
            }
        }
        return result;
    }
}
