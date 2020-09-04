// Time Complexity : O(n*m) since we are looking all the elements in the matrix once. Here n is num of rows and m is num of cols
// Space Complexity : O(n*m) since we have to store the elements in the list. Here n is num of rows and m is num of cols
// Did this code successfully run on Leetcode :
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach

// we use 4 ptrs here rowbeg rowend colbeg colend as shown
// 1) for rowbeg colbeg->colend then rowbeg++
// 2)  for colEnd, rowbeg->rowend then colEnd--
// 3) for rowend, colend->colbeg rowend--
// 4) for colbeg, rowend -> rowtop colbeg++

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> result = new ArrayList();

        if (matrix.length == 0)
            return result;

        int rowBegin = 0;
        int rowEnd = matrix.length - 1;

        int colEnd = matrix[0].length - 1;
        int colBegin = 0;

        // breaking condition is where the ptrs cross each other
        while (rowBegin <= rowEnd && colBegin <= colEnd) {

            // 1)
            for (int c = colBegin; c <= colEnd; c++) {
                result.add(matrix[rowBegin][c]);
            }
            rowBegin++;

            // 2)
            for (int r = rowBegin; r <= rowEnd; r++) {

                result.add(matrix[r][colEnd]);
            }
            colEnd--;

            // 3)
            // since we are manipulating it may be possible rowbeg has crossed rowEnd and it
            // will do rowend-- even if the for loop is not running and can lead to errors.
            // so we check if it is <=
            if (rowBegin <= rowEnd) {
                for (int c = colEnd; c >= colBegin; c--) {
                    result.add(matrix[rowEnd][c]);
                }
            }
            rowEnd--;

            // 4)
            // similarly for this case as well as we are manipulating ptrs after the 1st and
            // 2nd for loop, so to keep check
            if (colBegin <= colEnd) {
                for (int r = rowEnd; r >= rowBegin; r--) {
                    result.add(matrix[r][colBegin]);
                }
            }
            colBegin++;
        }
        return result;
    }
}
