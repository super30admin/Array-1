// Time Complexity : O(m*n);
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

//Our initial direction is UP at (0,0); while at first row (i=0) we move right to next col (j++) and change direction
//while at last colum (j == n-1) then we move down to next row(i++) and change direction
// when our direction is down, we keep moving right (j++) when in last row (i==m-1) 
//and we move up (i++) when in first col(j=0)

class Solution {
    private static final int UP=0, DOWN=1;
    public int[] findDiagonalOrder(int[][] mat) {
        int m =mat.length;
        int n= mat[0].length;
        
        int[] result = new int[m*n];
        
        int i=0,j=0,k=0;
        
        int direction = UP;
        
        while(k<result.length) {
            result[k++] = mat[i][j];
            
            //based on direction increment i,j
            if(direction == UP) {
                //i-1,j+1
                if(j==n-1) {//move down
                    i++;
                    direction=DOWN;
                } else if(i==0) {
                    //move right
                    j++;
                    direction =DOWN;
                
                } else {
                    i--;
                    j++;
                }
            } else {
                //i+1,j-1
                if(i==m-1) {//move right
                    j++;
                    direction = UP;
                } else if(j==0) {//move down
                    i++;
                    direction = UP;
                } else {
                    i++;
                    j--;
                }
            }
        }
        
        return result;
        
    }
}