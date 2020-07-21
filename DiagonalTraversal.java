/**
Problem: Diagonal Traversal
Time Complexity : O(m*n), where m is the number of rows, n is the number of columns of the given matrix.
Space Complexity : O(1), as we are just returning the result array and not creating an additional space for the purpose of solving.
(In class, we were told that in most cases, result array that we are asked to return is considered to have a space complexity of O(1)).
Did it run on leetcode : Yes

Approach: Up and down Directions.
1. For the purpose of traversing, we make use of directions up and down.
2. If the direction is up, we handle all the edge cases accordingly, and we need to change the direction when we can't go up any further,
 we then decrement the rows and increment the columns to handle the 'up' case.
3. If the direction is down, we handle all the edge cases accordingly, and we need to change the direction when we can't go down any further,
 we then increment the rows and decrement the columns to handle the 'down' case.
4. As we traverse thru the elements of the matrix, we keep appending them to a resultant array.
*/

class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {
        int direction = 1; //1 = up; 0 = down;
        if(matrix == null || matrix.length == 0) 
            return new int[0];
        int m = matrix.length;
        int n = matrix[0].length;
        int result[] = new int[m*n];
        int count = 0;
        int row = 0;
        int column = 0;
        
        while(count < m*n) {
            result[count] = matrix[row][column];
            if(direction == 1) { //up
                if(column == n-1) {
                    row += 1;
                    direction = 0;
                }
                else if(row == 0) {
                    column += 1;
                    direction = 0;
                }
                else {
                    column++;
                    row--;
                }
            }
            else  { //down
                if(row == m-1) {
                    column += 1;
                    direction = 1;
                }
                else if(column == 0) {
                    row += 1;
                    direction = 1;
                }
                else {
                    row++;
                    column--;
                }
            }
            count++;
        }
        return result;
    }
}