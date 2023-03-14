// Time Complexity : O(m*n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
/*
We maintain a flag to check if its going upwards or down. 
While going down, we increment row and decrement column and vice versa for going up. 
We also check edge cases and increment or decrement rows and columns accordingly. 
 */

public class Array2 {
    public int[] findDiagonalOrder(int[][] mat) {
        int r = 0; 
        int c = 0; 
        int m = mat.length; 
        int n = mat[0].length;
        int res[] = new int[m*n];
        boolean dir = true; 
        int inx = 0;
        while( inx < m * n){
            res[inx] = mat[r][c];
            inx++;
            if(dir){
                if(r == 0 && c != n-1){
                    c++; 
                    dir = false;
                }
                else if( c == n-1){
                    r++;
                    dir = false; 
                }
                else {
                    r--;
                    c++;
                }
            }
            else {
                if( c == 0 && r != m-1){
                    r++;
                    dir = true;
                }
                else if( r == m - 1){
                    c++; 
                    dir = true;
                }
                else {
                    r++; 
                    c--;
                }
            }
        }
        return res;
    }
}
