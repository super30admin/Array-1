// Time Complexity : O(m * n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
/*
 * Note: we are either moving up or down, so take dir having dummy values of 1 and -1 to indicate direction.
 * main catch is to swap the check and first check if we have hit last coloum while going upwards or last row while going downwards
 * so that we dont go out of bounds without traversing. 
*/

public class DiagonalOrder {
    public int[] findDiagonalOrder(int[][] mat) {
        if(mat == null || mat.length < 1) {
            return new int[] {}; 
        }
        int m = mat.length; //rows
        int n = mat[0].length; //columns
        int[] result = new int[m * n];
        int r = 0; 
        int c = 0;
        int index = 0;
        int dir = 1; //1 -> upward and -1 -> downward
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
                    r++;
                    c--;
                }
            }
        }
        return result;
    }
}
