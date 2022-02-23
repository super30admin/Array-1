// Time Complexity : O(m * n) 
// where m is length of matrix rows and n is length of matrix columns
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes


class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int movingUp = 0;
        int movingDown = 1;
        int dir = movingUp;
        
        int m = mat.length;
        int n = mat[0].length;
        
        int i = 0;
        int j = 0;
        
        int[] result = new int[m*n];
        
        int index = 0;
        
        while (index < result.length) {
            result[index] = mat[i][j];
            ++index;
            
            if (dir == movingUp) {
                // decrease row, increase column
                // i-1, j+1
                
                if (j == n-1) { // going down
                    i++;
                    dir = movingDown;
                }
                else if (i == 0) { // going right
                    j++;
                    dir = movingDown;
                }
                else {
                    i--;
                    j++;
                }
            }
            else { // dir = movingDown
                // increase row, decrease column
                // i+1, j-1
                if (i == m-1) { // going right
                    j++;
                    dir = movingUp;
                }
                else if (j == 0) { // going down
                    i++;
                    dir = movingUp;
                }
                else {
                    i++;
                    j--;
                }
            }
        }
        return result;
    }
}