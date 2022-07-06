// Time Complexity : O(row * column)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        if(mat == null || mat.length == 0) return new int[] {};
        
        int rows = mat.length;
        int columns = mat[0].length;
        int[] result = new int[rows * columns];
        int startRow = 0, startColumn = 0;
        int index = 0;
        int dir = 1;
        
        while(index < rows * columns){
            result [index] = mat[startRow][startColumn];
            index++;
            if(dir == 1){
                if(startColumn == columns - 1){
                    dir = -1;
                    startRow++;
                }
                else if(startRow == 0){
                    dir = -1;
                    startColumn++;
                }
                else{
                    startRow--;
                    startColumn++;
                }
            }
            else{
                if(startRow == rows - 1){
                    dir = 1;
                    startColumn++;
                }
                else if(startColumn == 0){
                    dir = 1;
                    startRow++;
                }
                else{
                    startRow++;
                    startColumn--;
                }
            }
        }
        return result;
    }
}