// Time Complexity : O(m*n)
// Space Complexity : O(1) 
// Did this code successfully run on Leetcode : YES
// Any problem you faced while coding this : NO


// Your code here along with comments explaining your approach
class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {
        
        if(matrix == null || matrix.length == 0) return new int [0];
        
        int m = matrix.length, n= matrix[0].length;
        int [] result = new int [m*n];
        
        int i = 0,j =0, k=0, dir = 1;


        while(k < result.length) {
            
            result[k] = matrix[i][j];
            
            //up direction
            if(dir == 1) {
                
                if(j == n-1) {
                    i++; dir = -1;
                } else if(i == 0) {
                    j++; dir = -1;
                } else {
                    i--; j++;
                }
            }
            //down direction
            else {
            	//mirror
                if(i == m-1) {
                    j++; dir = 1;
                } else if (j == 0) {
                    i++; dir = 1;
                } else {
                    i++; j--;
                }
            }
            k++;      
        }
        return result;     
    }
}
