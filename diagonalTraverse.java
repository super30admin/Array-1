// Time Complexity : O(N*M)
// Space Complexity : O(N*M)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
/*
1. If we are in index 0 and are dir -1 then go to next column and become dir=1, if dir=1 and row=0 the dir=-1 and go to nect column
2. Everytime on coming to index 0 we basically change the direction
3. If we're in the middle we keep going
4. If we reach the end rotate and go below

*/

// Your code here along with comments explaining your approach

class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {
        if(matrix == null || matrix.length == 0) return new int[0];
        int r = 0; int c = 0; int dir = 1;
        int m = matrix.length; int n = matrix[0].length;
        int[] result = new int[m*n];
        int i=0;
        while(i<m*n) {
            result[i] = matrix[r][c];
            if(dir == 1) {
                if(c == n-1) {
                    //Last element
                    r++; dir = -1;
                } else if(r==0) {
                    //First element
                    c++;dir=-1;
                }else {
                    //Middle normal element
                    r--;c++;
                }
            } else {
                if(r==m-1) {
                    //First element
                    c++;dir = 1;
                } else if(c == 0) {
                    //Last Element
                    r++; dir = 1;
                } else {
                    //Middle normal element
                    c--;r++;
                }
            }
            i++;
        }
        return result;
    }
}
