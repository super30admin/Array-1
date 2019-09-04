/**
 * Given a matrix of m x n elements (m rows, n columns), return all elements of
 * the matrix in spiral order.
 * 
 * Space Complexity: O(MN)
 * Time Complexity: O(MN)
 * 
 * As discussed, this problem tests the critical thinking ability on bookkeeping that needs to be done
 * Maintaining indices here and handling cases where we hit the edges is important!
 * 
 * Leetcode Result:
 * Runtime: 0 ms, faster than 100.00% of Java online submissions for Spiral Matrix.
 * Memory Usage: 34.6 MB, less than 100.00% of Java online submissions for Spiral Matrix.
 */
public class SpiralOrder {
    /**
     * 
     * @param matrix
     * @return
     */
    public List<Integer> spiralOrder(int[][] matrix) {
        List result = new LinkedList();

        if (matrix.length == 0) {
            return result;
        }

        // these 2 variables help maintain bounds
        int top = 0, bottom = matrix.length - 1;
        int left = 0, right = matrix[0].length - 1;
        int cursor = 0; // current element being processed

        while (top <= bottom && left <= right) {

            for (cursor = left; cursor <= right; cursor++) {
                result.add(matrix[top][cursor]);
            }

            for (cursor = top + 1; cursor <= bottom; cursor++) {
                result.add(matrix[cursor][right]);
            }

            if (top < bottom && left < right) { // make sure that we are within bounds
                for (cursor = right - 1; cursor > left; cursor--) {
                    result.add(matrix[bottom][cursor]);
                }
                for (cursor = bottom; cursor > top; cursor--) {
                    result.add(matrix[cursor][left]);
                }
            }

            top++;
            bottom--;
            left++;
            right--;
        }
        return result;
    }
}