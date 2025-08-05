// Time Complexity : O(m * n), where m is the number of rows and n is the number of columns in the matrix
// Space Complexity : O(1), excluding the result array (output does not count towards auxiliary space)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain English :
// We traverse the matrix diagonally in a zig-zag pattern (up-right and down-left).
// We switch direction whenever we hit a boundary (top, bottom, left, or right).
// We keep collecting elements in the result array during the traversal.
import java.util.*;
class DiagonalTraverse {
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;           // Number of rows
        int n = mat[0].length;        // Number of columns
        int[] arr = new int[m * n];   // Output array to store the result
        boolean dir = true;           // Direction flag: true means moving up-right, false means down-left
        int r = 0, c = 0;             // Starting position

        // Traverse the entire matrix and fill the result array
        for (int i = 0; i < m * n; i++) {
            arr[i] = mat[r][c]; // Add current element to the result

            if (dir) { // Moving in the upward direction
                if (c == n - 1) { // If at the last column, move down and change direction
                    r++;
                    dir = false;
                } else if (r == 0) { // If at the first row, move right and change direction
                    c++;
                    dir = false;
                } else { // Normal up-right movement
                    r--;
                    c++;
                }
            } else { // Moving in the downward direction
                if (r == m - 1) { // If at the last row, move right and change direction
                    c++;
                    dir = true;
                } else if (c == 0) { // If at the first column, move down and change direction
                    r++;
                    dir = true;
                } else { // Normal down-left movement
                    c--;
                    r++;
                }
            }
        }

        return arr; // Return the filled result array
    }
    public static void main(String[] args) {
        DiagonalTraverse sol = new DiagonalTraverse();

        int[][] mat = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        int[] result = sol.findDiagonalOrder(mat);

        System.out.println("Diagonal order: " + Arrays.toString(result));
    }
}