/**
 * TC: O(m*n) SC: O(1), returning the result array
 * Approach : simulate the way to traverse as given in the question, while looking for the edge cases at the top, bottom and corners of the matrix.
 */
class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {
        if(matrix.length == 0) return new int[0];
        int dir = 0;
        int m = matrix.length, n = matrix[0].length;
        int[] res= new int[m*n];
        int i = 0, j = 0, idx = 0;
        while(i < m && j < n){
            res[idx] = matrix[i][j];
            if(dir == 0){
                if(j+1 >= n){
                    i++;dir = 1;
                } else if( i-1 < 0){
                    j++;dir = 1;
                } else {
                    i--;j++;
                }
            }else {
                if(i+1 >= m){
                    j++;dir = 0;
                } else if( j-1 < 0){
                    i++;dir = 0;
                } else {
                    i++;j--;
                }
            }
            idx++;
        }
        return res;
    }
}