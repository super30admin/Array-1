// Time Complexity : The time complexity is O(M*N) where M is the number of rows and N is the number of columns.
// Space Complexity : The space complexity is O(1).
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
// If we are traversing from top to bottom diagonally, the next row would be row+1 and the next column would be column-1.
// Similarly if we are traversing from bottom to top diagonally, the next row would be row-1 and the next column would be column+1.
// For every alternate traversal, the direction changes. The head of the diagonal is determined from the previous state.

// Your code here along with comments explaining your approach
class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {

        if(matrix.length == 0 || matrix[0].length == 0){
            return new int[0];
        }

        int M = matrix.length;
        int N = matrix[0].length;

        int[] output = new int[M*N];
        int index = 0;
        int direction = 1; // Direction 1 represents traversing bottom to top

        int row = 0;
        int column = 0;

        while(row < M && column < N){

            output[index++] = matrix[row][column];

            // Next position is obtained
            int newRow = row + (direction == 1 ? -1 : 1);
            int newColumn = column + (direction == 1 ? 1 : -1);

            // If we reach the end of row or column, head of the next diagonal changes
            if(newRow < 0 || newRow == M || newColumn < 0  || newColumn == N){

                if(direction == 1){
                    row += (column == N - 1 ? 1 : 0) ;
                    column += (column < N - 1 ? 1 : 0);
                }
                else{
                    column += (row == M - 1 ? 1 : 0);
                    row += (row < M - 1 ? 1 : 0);
                }

                direction = 1-direction;
            }
            else{
                row = newRow;
                column = newColumn;
            }

        }

        return output;

    }
}