// Time Complexity : O(n) where n is the number of elements 
// Space Complexity : O(n) for the output matrix where n is number of elements
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : None
/* Your code here along with comments explaining your approach: Use a direction flag to keep a track on your direction. While moving down to up
check the boundary conditions on row == 0 and column == column length and change your direction and position. While moving up to down, check the
boundary conditions on column == 0 and row == row length and change your direction and position again accordingly.
*/
class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {
        int k =0 ;
        int dir = 1;                                        // Keep a flag for direction
        int i =0;
        int j = 0 ;
        if(matrix==null || matrix.length==0){return new int [0];}
        int[] output = new int[matrix.length * matrix[0].length];
        while(k < output.length){
            output[k]= matrix[i][j];
            System.out.println(matrix[i][j]);
                if(dir == 1){                                       // While moving down to up
                if(j == matrix[0].length-1){                // Checking if column == column length
                    i++;
                    dir =-1;                                        // Direction changed
                } else if(i==0){
                    j++;                                        // Check if row == 0, move to the next column and reverse your direction
                    dir = -1;
                } else {
                    i--;                                        // Movement supposed to be while moving down to up
                    j++;
                }
                }else{
                    if(i ==matrix.length-1){                    // Checking if row == row length
                        j++;    
                        dir = 1;                                // Changing the direction as it is moving up to down now
                    } else if(j == 0){
                        dir =1;
                        i++;
                    } else{
                        i++;                                    // Movement supposed to be while moving up to down
                        j--;
                    }
                }
            k++;
        }
        return output;
        }
}