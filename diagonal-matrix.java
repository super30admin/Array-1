//time complexity: O(m*n)
//space complexity: O(1)
//Did it run successfully on leetcode: YES
class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {
        if(matrix.length == 0 || matrix == null) {
           return new int[0];
        }
        
        int m = matrix.length;
        int n = matrix[0].length;
        int[] result = new int[m * n];
        int row = 0;
        int col = 0;
        int index = 0;
        int dir = 1; //1 for upward direction; -1 for downward direction
        
        while(index < m * n) {
            result[index] = matrix[row][col];
            index++;
            
            if(dir == 1) {
                if(col == n - 1) {
                    dir = -1;
                    row++;
                } 
                else if(row == 0) {
                    dir = -1;
                    col++;
                } 
                else {
                    row--;
                    col++;
                }
                
            } else {
                if(row == m - 1) {
                    dir = 1;
                    col++;
                } 
                else if(col == 0) {
                    dir = 1;
                    row++;
                } 
                else {
                    row++;
                    col--;
                }
                
            }
        }
        
        return result;
    }
}
