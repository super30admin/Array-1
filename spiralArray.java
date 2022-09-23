// TC: O(m*n)
// SC: O(1)
// Solved on Leetcode
// No problem faced
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return new ArrayList<>();
        }
        
        List<Integer> result = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;
        int up = 0;
        int down = m - 1;
        int left = 0;
        int right = n - 1;
        
        while(result.size() < m * n) {
            for(int col = left; col <= right; col++) {
                result.add(matrix[up][col]);
            }
            for(int row = up + 1; row <= down; row++) {
                result.add(matrix[row][right]);
            }
            if (up != down) {
                for(int col = right - 1; col >= left; col--) {
                    result.add(matrix[down][col]);
                }
            }
            if (right != left) {
                for(int row = down - 1; row > up; row--) {
                    result.add(matrix[row][left]);
                }
            }
            left++;
            right--;
            up++;
            down--;
        }
        return result;
    }
}
