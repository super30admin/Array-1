// Time Complexity : O(mn)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

// I will be having a direction valiable if direction is 1 moving upwards
// if the direction is -1 I will be moving downwards. 
//In nested if else I am ensuring row and col is within boundries

public class DiagonalTraverseSolution {
    public int[] findDiagonalOrder(int[][] mat) {
        if(mat == null || mat.length == 0) {
            return new int[] {};
        }
        int rows = mat.length;
        int cols = mat[0].length;
        int[] result = new int[rows * cols];
        int row = 0;
        int col = 0;
        int index = 0;
        // 1 -> going upwards;
        // -1 -> going downwards;
        int direction = 1;
        
        while(index < (rows * cols)) {
            result[index] = mat[row][col];
            index += 1;
            if(direction == 1) {
                if(col == (cols - 1)) {
                    direction = -1;
                    row += 1;
                } else if(row == 0) {
                    direction = -1;
                    col += 1;
                } else {
                    row -= 1;
                    col += 1;
                }
            } else {
                if(row == (rows - 1)) {
                    direction = 1;
                    col += 1;
                } else if(col == 0) {
                    direction = 1;
                    row += 1;
                } else {
                    row += 1;
                    col -= 1;
                }
            }
        }
        return result;
    }
}