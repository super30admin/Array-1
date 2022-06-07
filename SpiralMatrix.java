// Time Complexity : O(MN)
// Space Complexity : O(MN)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> ans = new ArrayList<>();

        if (matrix == null || matrix.length == 0) return ans;

        int m = matrix.length;
        int n = matrix[0].length;

        int left = 0, right = n - 1;
        int top = 0, bottom = m - 1;

        while (left <= right && top <= bottom) {

            // Traverse left -> right and check the terminating condition
            for (int j = left; j <= right; j++) ans.add(matrix[top][j]);
            top++;
            if (top > bottom) break;

            // Go top to bottom
            for (int i = top; i <= bottom; i++) ans.add(matrix[i][right]);
            right--;
            if (right < left) break;

            // Go right - left
            for (int j = right; j >= left; j--) ans.add(matrix[bottom][j]);
            bottom--;
            if (bottom < top) break;

            // go bottom to top
            for (int i = bottom; i >= top; i--) ans.add(matrix[i][left]);
            left++;

        }

        return ans;
    }

}