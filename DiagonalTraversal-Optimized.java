//Problem 27 : Optimized - Diagonal Traverse
// Time Complexity : O(n*m), where n & m are rows and columns
// Space Complexity : (O(1)), because extra array is the output array which is not auxillary
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach 
/*
  Steps:
  1) Create a one dimensional array, Initialise one variable called direction (dir), if dir = 1 means moving upward else means moving downward 
  2) Increment and decrement row and column pointer accordingly  
*/


import java.util.*;

class Solution27Optimized {
    public int[] findDiagonalOrder(int[][] matrix) {
        
        if(matrix==null || matrix.length==0){
            return new int[0];
        }
        //TC: O(row*col), SC:O(1), because resultant array is not auxillary array;
        int row = matrix.length;
        int col = matrix[0].length;
        
        int res[] = new int[row*col];
        
        
        int idx=0;
        int dir = 1;//for upward
        int i=0;
        int j=0;
        
        while(idx<res.length){
            res[idx++] = matrix[i][j];
            if(dir==1){//when upward
                
                if(j==col-1){//while moving upwards reached last column, increment row(i) only and change direction
                    i++;
                    dir = -1;
                }else if(i==0){//while moving upward reached first row but not the last col, increment col(j) only and change direction
                    j++;
                    dir = -1;
                }else{
                    i--;
                    j++;
                }
                
            }else{//when downward
                
                if(i==row-1){//while moving downwards, reached last row when, increment col(j) only and change direction
                    j++;
                    dir = 1;
                }else if(j==0){//while moving downwards, reached first column but not the last row, increment row(i) only and change direction
                    i++;
                    dir = 1;
                }else{
                    i++;
                    j--;
                } 
            }
            
            
        }
        
        return res;
    }
}