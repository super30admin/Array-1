// Time Complexity : O(mn)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes


class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;
        int left = 0;
        int right = n - 1;
        int top = 0;
        int bottom = m - 1;
        while(top <= bottom && left <= right) {
            for(int j = left; j <= right; j++) {
                res.add(matrix[top][j]);
            }
            top++;
            for(int i = top; i <= bottom; i++) {
                res.add(matrix[i][right]);
            }
            right--;
            if(top <= bottom) {
                for(int j = right; j >= left; j--) {
                    res.add(matrix[bottom][j]);
                }
                bottom--;
            }
            if(left <= right) {
                for(int i = bottom; i >= top; i--) {
                    res.add(matrix[i][left]);
                }
                left++;
            }
        }
        
        return res;
    }
}