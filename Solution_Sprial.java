/*

// Time Complexity : O(n *m) where n is the length of the rows and m is the length of the columns.
// Space Complexity : O(1) as we are not using any auxillary data structure.
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

Here, I am taking the four varibles for four direction and d as a condition like where we have to move.
then starting from the left to right,top to bottom, right to left, and bottom  to top.
it will iterate till the while condition is true.

*/

import java.util.*;

public class Solution_Sprial {

    public List<Integer> spiralOrder(int[][] matrix) {

        ArrayList<Integer> list = new ArrayList<>();

        int n = matrix.length;
        int m = matrix[0].length;
        // here d is for the direction and give direction with way we have to iterate.

        int d = 0;
        // for traversing the array
        // intially top at first row and bottom at last row
        // left at first column and right at last column.

        int top = 0, bottom = n - 1, left = 0, right = m - 1;

        while (top <= bottom && left <= right) {

            if (d == 0) {
                // if d == 0 then we have to take elements from the left to right column.
                for (int i = left; i <= right; i++) {

                    list.add(matrix[top][i]);
                }
                // as we added the top row incrementing that.
                top++;
                d = 1;
            } else if (d == 1) {
                // iterating from last column from top to bottom.
                for (int i = top; i <= bottom; i++) {

                    list.add(matrix[i][right]);
                }
                // as we added last column changing the pointer.
                right--;
                d = 2;
            }

            else if (d == 2) {
                // iterating from the bottom row from right to left

                for (int i = right; i >= left; i--) {

                    list.add(matrix[bottom][i]);
                }
                // as added all elements of the last row changing the pointer
                bottom--;
                d = 3;
            }

            else if (d == 3) {
                // iterating from the first column from bottom to top elements
                for (int i = bottom; i >= top; i--) {

                    list.add(matrix[i][left]);
                }

                // as add all left column elements changing it's pointer.
                left++;
                d = 0;
            }
        }

        return list;
    }
}
