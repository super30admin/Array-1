//We use 4 boundaries to simulate spiral traversal:
//
//top → top row
//
//bottom → bottom row
//
//left → left column
//
//right → right column
//
//Traversal order:
//
//Left → Right (top row)
//
//Top → Bottom (right column)
//
//Right → Left (bottom row)
//
//Bottom → Top (left column)
//
//After each step, shrink the boundary.
//
//        Time: O(m × n)
//Space: O(1) (excluding result)

class Solution {

    public List<Integer> spiralOrder(int[][] matrix) {

        // Number of rows
        int m = matrix.length;

        // Number of columns
        int n = matrix[0].length;


        // Define boundaries
        int top = 0;        // starting row
        int bottom = m - 1; // ending row
        int left = 0;       // starting column
        int right = n - 1;  // ending column


        // Result list to store spiral order
        List<Integer> result = new ArrayList<>();


        // Continue until all boundaries are crossed
        while(top <= bottom && left <= right) {


            // 1. Traverse LEFT → RIGHT on TOP row
            for(int i = left; i <= right; i++) {

                result.add(matrix[top][i]);
            }

            // Move top boundary down
            top++;



            // 2. Traverse TOP → BOTTOM on RIGHT column
            for(int i = top; i <= bottom; i++) {

                result.add(matrix[i][right]);
            }

            // Move right boundary left
            right--;



            // 3. Traverse RIGHT → LEFT on BOTTOM row
            // Check to avoid duplicate row traversal
            if(top <= bottom) {

                for(int i = right; i >= left; i--) {

                    result.add(matrix[bottom][i]);
                }

                // Move bottom boundary up
                bottom--;
            }



            // 4. Traverse BOTTOM → TOP on LEFT column
            // Check to avoid duplicate column traversal
            if(left <= right) {

                for(int i = bottom; i >= top; i--) {

                    result.add(matrix[i][left]);
                }

                // Move left boundary right
                left++;
            }
        }


        // Return spiral traversal
        return result;
    }
}