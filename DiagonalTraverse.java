// Time Complexity : O(m*n) where 'm' is the rows of the matrix and 'n' is the columns of the matrix.
// Space Complexity : O(1) where space is constant.
// Did this code successfully run on Leetcode : Yes, https://leetcode.com/problems/diagonal-traverse/
// Any problem you faced while coding this : No


class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        if(mat.length == 0 || mat[0].length==0) return new int[0];
        int m = mat.length, n = mat[0].length;
        int i = 0, j =0;
        boolean dir = true;
        int[] result = new int[m*n];
        for(int idx=0;idx<m*n;idx++){
            result[idx] = mat[i][j];
            if(dir){
                if(j==n-1){
                    i++;
                    dir = false;
                }else if(i==0){
                    j++;
                    dir = false;
                }else{
                    i--;
                    j++;
                }
            }else{
                if(i==m-1){
                    j++;
                    dir = true;
                }else if(j==0){
                    i++;
                    dir = true;
                }else{
                    i++;
                    j--;
                }
            }
        }
        return result;
    }
}
