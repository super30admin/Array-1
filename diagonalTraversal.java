// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int[] result = new int[m*n];
        // null
        if(mat == null) return new int[0];
        int i  = 0; int j = 0; int dir = 1;
        int idx = 0; // index on my result
        while(idx < m*n){
            result[idx] = mat[i][j];
            idx++;
            if(dir == 1){
                if(i == 0 && j!=n-1){
                    j++; dir = -1;
                }else if(j == n-1){
                    i++; dir = -1;
                }else{
                    i--;
                    j++;
                }
                
            }else{
                if(j == 0 && i!=m-1){
                    i++; dir = 1;
                }else if(i == m-1){
                    j++; dir = 1;
                }else{
                    j--;
                    i++;
                }
            }
        }
        return result;
    }
}