// Time Complexity : O(N) where N is the total no of elements in the matrix
// Space Complexity : O(N) where N is the total no of elements in the matrix
// Did this code successfully run on Leetcode : Yes

class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {
        // edge case
        if(matrix == null || matrix.length == 0)
            return new int[0];
        int m = matrix.length;
        int n = matrix[0].length;
        int[] result = new int[m*n];
        
        int i = 0;
        int j = 0; 
        int direction = 1;
        int result_index = 0;
        
        while(result_index < result.length){
            result[result_index++] =  matrix[i][j];
            if(direction == 1){
                if(j == n-1){
                    i++;
                    direction = -1;
                }
                else if(i == 0){
                    j++;
                    direction = -1;
                }
                else{
                    i--; j++; 
                }
                
            }
            else{
                if(i == m-1){
                    j++;
                    direction = 1;
                }
                else if(j == 0){
                    i++;
                    direction = 1;
                }
                else{
                    i++; j--;
                }
            }
        }
        return result;   
    }
}