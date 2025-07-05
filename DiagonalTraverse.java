/* 498. Diagonal Traverse
 * Given an m x n matrix mat, return an array of all the elements of the array in a diagonal order.
Constraints:
m == mat.length
n == mat[i].length
1 <= m, n <= 104
1 <= m * n <= 104
-105 <= mat[i][j] <= 105
Example 1:
Input: mat = [[1,2,3],[4,5,6],[7,8,9]]
Output: [1,2,4,7,5,3,6,8,9]
 */

/*
Time Complexity:-O(m*n)
Space Complexity:-O(1)//using same input array for answer
Approach:-The idea is to traverse the matrix diagonally.
There are two directions:
Up-right (↗): row--, col++
Down-left (↙): row++, col--
When we hit the top or right border, switch direction to down-left.
When we hit the bottom or left border, switch direction to up-right.
We continue until we've added all elements to the result array.

*/
public class DiagonalTraverse {
    public int[] findDiagonalOrder(int[][] mat) {
        // Edge case: if input is empty, return an empty array
        if (mat == null || mat.length == 0) {
            return new int[] {};
        }
        int m = mat.length;// number of rows
        int n = mat[0].length; // number of columns
        int dir = 1; // direction: 1 = up-right, -1 = down-left
        int[] answer = new int[m * n]; // output array to hold the result
        int row = 0, column = 0;// starting position
        int index = 0; // index to fill the answer array
        // Loop until we've processed every element in the matrix
        while (index < m * n) {
            answer[index] = mat[row][column]; // store the current element
            index++; // move to next index in answer array
            // Moving up-right
            if (dir == 1) {
                if (column == n - 1) { // hit right boundary
                    dir = -1;// switch direction to down-left
                    row++; // move down to next row
                } else if (row == 0) {// hit top boundary
                    dir = -1;// switch direction
                    column++; // move right to next column
                } else {// normal up-right movement
                    row--;
                    column++;
                }
            } else {// Moving down-left
                if (row == m - 1) { // hit bottom boundary
                    dir = 1;// switch direction to up-right
                    column++;// move right
                } else if (column == 0) { // hit left boundary
                    dir = 1;// switch direction
                    row++;// move down
                } else {// normal down-left movement
                    column--;
                    row++;
                }
            }
        }
        return answer;// return the final result array
    }
}
