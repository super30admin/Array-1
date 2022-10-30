// Time complexity is O(m*n) and space complexity is O(1)
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();

        int m = matrix.length;
        int n = matrix[0].length;

        int rowStart = 0, rowEnd = m - 1;
        int colStart = 0, colEnd = n - 1;

        while (ans.size() != m * n) {
            // right; same row next col
            for (int i = colStart; i <= colEnd; ++i) {
                ans.add(matrix[rowStart][i]);
            }
            ++rowStart;
            // down ; same col next row
            for (int j = rowStart; j <= rowEnd; ++j) {
                ans.add(matrix[j][colEnd]);
            }
            --colEnd;

            // left ; same row prev col
            if (rowStart <= rowEnd)
                for (int i = colEnd; i >= colStart; --i) {
                    ans.add(matrix[rowEnd][i]);
                }
            --rowEnd;

            // up ; same col prev row
            if (colStart <= colEnd)
                for (int j = rowEnd; j >= rowStart; --j) {
                    ans.add(matrix[j][colStart]);
                }
            ++colStart;
        }
        return ans;
    }
}