// Time Complexity :O(M*N)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :Yes

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int rows = matrix.length;
        int columns = matrix[0].length;
        int up = 0;
        int left = 0;
        int right = columns - 1;
        int down = rows - 1;
        
        while(result.size() < rows*columns){
            for(int col = left; col <= right; col++){
                result.add(matrix[up][col]);
            }
            for (int row = up + 1; row <= down; row++) {
                result.add(matrix[row][right]);
            }
            if (up != down) {
                // Traverse from right to left.
                for (int col = right - 1; col >= left; col--) {
                    result.add(matrix[down][col]);
                }
            }
            if (left != right) {
                // Traverse upwards.
                for (int row = down - 1; row > up; row--) {
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
