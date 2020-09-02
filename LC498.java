// Time Complexity : O(M*N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {
        //if matrix is empty, return empty array
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0){
            return new int[0];
        }
        
        //size of matrix and length of array
        int n = matrix.length;
        int m = matrix[0].length;
        
        //initialize pointers for matrix
        int i = 0;
        int j = 0;
        //index pointer for output array
        int index = 0;
        //flag to check when to change the direction upward or downward
        int direction = 1;
        
        //initialize output array
        int[] output = new int[m*n];
        
        while(index < m*n){
            //keep filling the output array with the element we are currently on in the matrix
            output[index] = matrix[i][j];
            //move to the next array position
            index += 1;
            
            //going upwards
            if(direction == 1){
                //check if we are in the last column, we change direction 
                if(j == m-1){
                    i += 1;
                    direction = -1;
                } 
                //check if we are in the first row, we change direction
                else if(i == 0){
                    j += 1;
                    direction = -1;
                }
                //else just keep goinf upwards
                else{
                    i -= 1;
                    j += 1;
                }   
            } 
            //just the opposite, now we go downwards
            else{
                if(i == n-1){
                    j += 1;
                    direction = 1;
                } 
                else if(j == 0){
                    i += 1;
                    direction = 1;
                }
                else{
                    j -= 1;
                    i += 1;
                }    
            }
        }
        //return the output array
        return output;
    }
}