//TC: O(m*n), m*n is the size of the input array
//SC: O(1)

//Approach:
//1. Just followed the rules for diagonal traversal.

class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {
        if(matrix == null || matrix.length == 0) return new int [0];
        int m = matrix.length;
        int n = matrix[0].length;
        int[] result = new int[m*n];
        int row = 0; int column = 0;
        int dir = 1; int i = 0;
        
        while(i < m*n){
            result[i] = matrix[row][column];
            if(dir == 1){
                if(column == n-1){
                    row++;
                    dir--;
                }
                else if(row == 0){
                    column++;
                    dir--;
                }
                else{
                    row--;
                    column++;
                }
            }
            else{
                if(row == m-1){
                    column++;
                    dir++;
                }
                else if(column == 0){
                    row++;
                    dir++;
                }
                else{
                    row++;
                    column--;
                }
            }
            i++;
        }
        return result;
    }
}
