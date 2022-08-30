/*
Time Complexity - O(m*n) - m is number of rows and n is number of columns
Space Complexity - O(1)
*/
class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int[] output = new int[m*n];
        
        if(mat == null || mat.length == 0){
            return new int[] {};
        }
        int row = 0;
        int col = 0;
        int dir = 1;
        int index = 0;
        
        while(index < output.length){
            
            output[index] = mat[row][col];
            index++;
            // going up cases
            if(dir == 1){
            if(col == n-1){
                row++; 
                dir = -1;
            }
            else if(row == 0){
                col++; 
                dir = -1;
            }
            else { 
                col ++;
                row --;
            }
        }
        // going down cases 
        else {
            if(row == m-1){
                col ++;
                dir = 1;
            }
            else if(col == 0){
                row ++;
                dir = 1;
            }
            else
            {
                col --;
                row ++;
            }
        }
            
        }
        
        return output;
        
    }
}
