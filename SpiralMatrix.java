// Time Complexity : O(mn) where m is the column length and n is the row length
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int rowBegin = 0, rowEnd = matrix.length - 1;
        int colBegin = 0, colEnd = matrix[0].length - 1;
        while(result.size() < matrix.length * matrix[0].length) {
            // for first column
            for(int i=colBegin;i<=colEnd && result.size() < matrix.length * matrix[0].length;i++) {
                result.add(matrix[rowBegin][i]);
            }
            // for last row
            for(int i=rowBegin+1;i<=rowEnd && result.size() < matrix.length * matrix[0].length;i++) {
                result.add(matrix[i][colEnd]);
            }
            // for last column
            for(int i=colEnd - 1;i>=colBegin && result.size() < matrix.length * matrix[0].length;i--) {
                result.add(matrix[rowEnd][i]);
            }
            // for first row
            for(int i=rowEnd - 1; i>=rowBegin + 1 && result.size() < matrix.length * matrix[0].length;i--) {
                result.add(matrix[i][colBegin]);
            }
            rowBegin++;
            rowEnd--;
            colBegin++;
            colEnd--;
        }
        return result;
    }
}
