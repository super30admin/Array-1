/**
 * https://leetcode.com/problems/diagonal-traverse/description/
 * Approach : Start from top-left of matrix and traverse the matrix diagonally
 * Then switch the direction when hitting the boundaries(top,left,right,bottom)
 * Keep updating the ans array as we move in up or down directions.
 * Time complexity : O(n*m) when n is row and m is column
 * Space complexity : O(1)
 * Did this code successfully run on Leetcode : yes
 */
class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int[] ans = new int[m*n];
        boolean dir = true;
        int r = 0;
        int c = 0;
        for(int i=0;i<(m*n);++i){
            ans[i] = mat[r][c];
            if(dir){
                if(r==0 && c!=n-1){
                    c++;
                    dir = false;
                }else if(c==n-1){
                    r++;
                    dir = false;
                }else{
                    c++;
                    r--;
                }
               
            }else{
                if(c==0 && r!=m-1)
                {
                    r++;
                     dir = true;
                }else if(r==m-1){
                    c++;
                     dir = true;
                }else{
                    r++;
                    c--;
                }
               
            }
        }
        return ans;
    }
}
