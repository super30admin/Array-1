// Time Complexity : O(mn) where m is number of rows and n is number of columns in matrix.
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {
        if(matrix == null || matrix.length == 0) return new int[0];
        int m = matrix.length, n = matrix[0].length, i = 0, j = 0, idx = 0, dir = 1;
        int[] result = new int[m*n];
        while(idx < result.length){
            result[idx] = matrix[i][j];
            if(dir == 1){
                if(j == n-1){
                    i++; dir = -1;
                }else if(i == 0){
                    j++; dir = -1;
                }else{
                    i--;
                    j++;
                }
            }else{
                if(i == m-1){
                    j++; dir = 1;
                }else if(j == 0){
                    i++; dir = 1;
                }else{
                    j--;
                    i++;
                }
            }
            idx++;
        }
        return result;
        
        
    }
}
// Your code here along with comments explaining your approach
