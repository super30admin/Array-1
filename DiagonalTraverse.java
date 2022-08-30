// Time Complexity : O(m*n) where m is the number of rows and n is the number of columns
// Space Complexity : O(1) - output array is not considered for space complexity
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach
/* https://leetcode.com/problems/diagonal-traverse/ */

class DiagonalTraverse {
    public int[] findDiagonalOrder(int[][] mat) {

        //null check
        if(mat == null || mat.length == 0)
            return new int[] {};

        int m = mat.length; //number of rows
        int n = mat[0].length; // number of columns

        int[] result = new int[m*n];
        int r = 0;
        int c = 0;
        int dir = 1; //initital direction to be 1
        int idx = 0;

        while(idx < result.length){

            result[idx] = mat[r][c];
            idx++;

            //up direction - top wall and right wall
            if(dir == 1){
                if(c == n-1){
                    dir = -1;
                    r++;
                }
                else if(r == 0){
                    dir = -1;
                    c++;
                }
                else {
                    r--;
                    c++;
                }
            }
            else{ //down direction - left wall and bottom wall
                if(r == m-1){
                    dir = 1;
                    c++;
                }
                else if(c == 0){
                    dir = 1;
                    r++;
                }
                else{
                    r++;
                    c--;
                }
            }
        }
        return result;
    }
}