// Time Complexity : 3ms (faster than 5.23% submissions)
// Space Complexity : 42Mb (less than 61.19% submissions)
// Did this code successfully run on Leetcode : YES
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach

class Solution {

    private static int up = 0, down = 1, left = 2, right = 3;

    public List<Integer> spiralOrder(int[][] matrix) {

        int m = matrix.length, n = matrix[0].length;
        int[] arr = new int[m * n];

        int row = 0, col = 0;
        int index = 0;
        int direction = right;

        int rightB = n, downB = m, leftB = 0, upB = 1;

        while (index != m * n) {
            arr[index] = matrix[row][col];
            index++;

            if (direction == right) {

                if (col == rightB - 1) {
                    direction = down;
                    row++;
                    rightB--;
                } else {
                    col++;
                }

            } else if (direction == down) {
                if (row == downB - 1) {
                    direction = left;
                    col--;
                    downB--;
                } else {
                    row++;
                }

            } else if (direction == left) {

                if (col == leftB) {
                    direction = up;
                    row--;
                    leftB++;
                } else {
                    col--;
                }

            } else {

                if (row == upB) {
                    direction = right;
                    col++;
                    upB++;
                } else {
                    row--;
                }

            }
        }

        List<Integer> list = IntStream.of(arr).boxed().collect(Collectors.toList());

        return list;

    }
}