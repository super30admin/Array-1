// TC  - O(mn)
// SC - O(1)
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();

        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;

        int i = 0; // Used to iterate resultant list
        int r = 0; // Used to iterate intput matrix
        int c = 0; // Used to iterate intput matrix

        while (i < matrix.length * matrix[0].length) { // Use the max number of items possible to add into the array
                                                       // instead of using boundaries.
            while (c <= right) {
                res.add(i, matrix[top][c]);
                i += 1;
                c += 1;
            }
            top += 1;
            r = top;
            while (r <= bottom) {
                res.add(i, matrix[r][right]);
                i += 1;
                r += 1;
            }
            right -= 1;

            c = right;
            if (top <= bottom) {
                while (c >= left) {
                    res.add(i, matrix[bottom][c]);
                    i += 1;
                    c -= 1;
                }
                bottom -= 1;
                r = bottom;
            }

            if (left <= right && top <= bottom) {
                while (r >= top) {
                    res.add(i, matrix[r][left]);
                    i += 1;
                    r -= 1;
                }
                left += 1;
                c = left;

            }

        }
        return res;

    }
}
