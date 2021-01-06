// Time Complexity : O(m*n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Logic to resolve edge cases

// Notes : Since there are two directions of traversal, either upwards or downwards, then edge cases are taking a turn one step to the right or going one step to the bottom.

public class DIagonalTraverse {
    public int[] findDiagonalOrder(int[][] matrix) {
        
        if (matrix == null || matrix.length == 0) return new int[]{};
        
        int direction = 1;
        
        int m = matrix.length;
        int n = matrix[0].length;
        
        int i = 0;
        int j = 0;
        int k = 0;
        
        int[] res = new int[m*n];
        
        while(k < m*n && i<m && j<n){
            res[k] = matrix[i][j];
                k++;
                
            if(direction == 1){ //moving upward
                if(j == n-1){ //move one step down
                    i++; 
                    direction = -1; //changing the direction
                } else if ( i == 0){ //move one step right
                    j++; 
                    direction = -1; //changing the direction
                } else { 
                    i--; j++;
                }
            } else { //moving downward
                if(i == m-1){ //move one step down
                    j++; 
                    direction = 1; //changing the direction
                } else if ( j == 0){ //move one step right
                    i++; 
                    direction = 1; //changing the direction
                } else { 
                    i++; j--;
                }
            }
        }
                 
        return res;
    }
}
