// Time Complexity : O(N)
// Space Complexity : O(1) as o/p array is not considered as extra space
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
/*
Set boundaries as we need to travel the top row first and then right most column and bottom most row with right column decremented
and then level up the bottom row and traverse first column until unvisited number and go right and repat it until we visit all the numbers in the given array
 */

// Your code here along with comments explaining your approach
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList();
        if (matrix == null || matrix.length == 0) return ans;

        int top = 0, bottom = matrix.length - 1, left = 0, right = matrix[0].length - 1;
        int size = matrix.length * matrix[0].length;
        while (ans.size() < size) {
            for (int i = left; i <= right && ans.size() < size; i++) {
                ans.add(matrix[top][i]);
            }
            top++;

            for (int i = top; i <= bottom && ans.size() < size; i++) {
                ans.add(matrix[i][right]);
            }
            right--;
            for (int i = right; i >= left && ans.size() < size; i--) {
                ans.add(matrix[bottom][i]);
            }
            bottom--;
            for (int i = bottom; i >= top && ans.size() < size; i--) {
                ans.add(matrix[i][left]);
            }
            left++;
        }
        return ans;
    }
}