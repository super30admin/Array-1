// Time Complexity : O(m*n) m-rows n -columns of gvn matrix
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english

/**
 * Diagonal Movement : 2 ways only - Move upwards or downwards. Hence write 2 separate logics for them.
 */

// Your code here along with comments explaining your approach
class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {
        if(matrix == null || matrix.length == 0) return new int[0];

        int dir = 1,count = 0,i=0,j=0;
        int[] res = new int[matrix.length*matrix[0].length];

        while(count< (matrix.length*matrix[0].length)){
            res[count++] = matrix[i][j];
            if(dir == 1){                                       //Moving upwards
                if(j==matrix[0].length-1)                               //at the end of matrix row..then move down and change direction
                {
                    i++;
                    dir = -1;
                }else if(i == 0){                                       //at the first row....then move down and change direction
                    j++;
                    dir = -1;
                }else                                                   //move upwards
                {
                    i--;
                    j++;
                }
            }else{                                             //Moving downwards
                if(i == matrix.length-1){                             //at the last row....move to the next coln and change the direction
                    j++;
                    dir = 1;
                }else if(j == 0){                                      //at the first column...move to next row and change direction
                    i++;
                    dir = 1;
                }else                                                   // move downwards
                {
                    i++;
                    j--;
                }
            }
        }
        return res;

    }
}