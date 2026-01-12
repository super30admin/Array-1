// Time Complexity :O(m*n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english : We keep track of the current direction (RIGHT, DOWN, LEFT, UP) using an enum. We use bounds (rightBound, downBound, leftBound, upperBound) to know when to turn and shrink the spiral. In each iteration, we add the current element to the output list and moves the row/column according to the direction. When a bound is reached, it changes direction and updates the corresponding bound until all elements are added.

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> output = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;
        enum Direction {UP, DOWN, LEFT, RIGHT}
        int rightBound = n-1;
        int downBound = m-1;
        int leftBound = 0;
        int upperBound = 1;
        int row = 0;
        int col = 0;
        Direction dir = Direction.RIGHT;
        for(int i=0; i<m*n; i++) {
            output.add(matrix[row][col]);
            if (dir == Direction.RIGHT) {
                if(col == rightBound) {
                    row++;
                    rightBound--;
                    dir = Direction.DOWN;
                } else {
                    col++;
                }
            } else if (dir == Direction.DOWN) {
                if (row == downBound) {
                    col--;
                    downBound--;
                    dir = Direction.LEFT;
                } else {
                    row++;
                }
            } else if (dir == Direction.LEFT) {
                if (col == leftBound) {
                    row--;
                    leftBound++;
                    dir = Direction.UP;
                } else {
                    col--;
                }
            } else {
                if (row == upperBound) {
                    col++;
                    upperBound++;
                    dir = Direction.RIGHT;
                } else {
                    row--;
                }
            }
        }
        return output;
    }
}
