/*
Author: Akhilesh Borgaonkar
Problem: LC 498. Diagonal Traverse (Array-1)
Approach: Finding the edge cases when the coordinates change rows and columns across the directions of traversal upwards and downwards.
Time Complexity: O(m*n) where m & n are number of rows and columns of matrix resp.
Space complexity: O(1) constant
LC verified
*/

class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {
        
        if(matrix == null || matrix.length==0)
            return new int[0];
        int r = matrix.length, c = matrix[0].length;
        int[] output = new int[r*c];
        int dir = 1, i = 0;
        int row = 0, col = 0;

        while(i < r*c){
            output[i]=matrix[row][col];	//put in output array in the sequence of traversal
            
            if(dir == 1){				//going upward
                if(col == c-1){			//edge case-1
                    row++;
                    dir = -1;
                } else if(row == 0){	//edge case-2
                    dir = -1;
                    col++;
                } else {				//routine upward traversal
                    row--;	
                    col++;
                }  
                
            } else {    				//dir=-1 (going downward)
                if(row == r-1){			//edge case-1
                    col++;
                    dir = 1;
                                        
                } 
                else if(col == 0){		//edge case-2
                    row++;
                    dir = 1;
                } 
                else {					//routine downward traversal
                    row++;
                    col--;    
                }
            }
            i++;
        }
        return output;
    }
}