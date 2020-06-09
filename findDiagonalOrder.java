// Time Complexity :O(max(m,n)) where m and n are the length and breath of the matrix
// Space Complexity : O(1);
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english - depending on the direction the values of i and j are manipulated.
// So when the dir is 0 it means the upward travesing is taking place and i and j are changed according to that and same 
// goes for the dir equalling 1 when it the a downward traverse.

// Your code here along with comments explaining your approach

class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {
        
        if(matrix == null || matrix.length == 0) return new int[0];
        
        int i = 0; int j = 0;
        int n = matrix.length;
        int m = matrix[0].length;
        int dir = 0;
        int max = 0;
        int[] resultMatrix = new int[n*m];
        while(max < n*m){
            resultMatrix[max] = matrix[i][j]; 
            // Direction Up
            if(dir == 0){
                if(j == m-1){
                    i++;
                    dir = 1;
                }
                else if(i==0){
                    j++;
                    dir = 1;
                }
                else{
                    i --;
                    j++;
                }
            }
            //Direction Down
            else {
                if(i == n-1){
                    j++;
                    dir = 0;
                }
                else if(j==0){
                    i++;
                    dir = 0;
                }
                else{
                    j --;
                    i ++;
                }
            }
            max++;
            
    }
    return resultMatrix;     
}
}
