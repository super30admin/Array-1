/**
 * https://leetcode.com/problems/spiral-matrix/description/
 * Approach 1: We use 4 boundaries - top,bottom,left and right to keep track of spiral path
 * At each step we traverse, right, down, left, and up then shrink the boundaries
 * We stop when boundaries cross each other.
 * 
 * Time complexity : O(n*m)
 * Space complexity : O(1)
 */
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        int r = matrix.length;
        int c = matrix[0].length;
        int top = 0;
        int bottom = r-1;
        int left = 0;
        int right = c-1;
        while(top<=bottom && left<=right){
            for(int j=left; j<=right;++j){
                list.add(matrix[top][j]);
            }
            top++;
            for(int i=top;i<=bottom;++i){
                list.add(matrix[i][right]);
            }
            right--;
            if(top<=bottom){
                for(int j=right;j>=left;--j){
                list.add(matrix[bottom][j]);
               }
            }
            bottom--;
            if(left<=right){
                for(int j=bottom;j>=top;--j){
                list.add(matrix[j][left]);
               }
            }
            
            left++;
        }
        return list;
    }
}
/**
 * https://leetcode.com/problems/spiral-matrix/description/
 * Approach 2: We use 4 boundaries - top,bottom,left and right to keep track of spiral path
 * At each step we traverse, right, down, left, and up then shrink the boundaries
 * We stop when boundaries cross each other.
 * 
 * Time complexity : O(n*m)
 * Space complexity : O(depth) depth of recursion which in worst case O(m+n)
 */
class Solution {
    List<Integer> ans;
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        this.ans = new ArrayList<>();
        int top = 0, left = 0, bottom = m - 1, right = n - 1;
        helper(matrix, top, left, bottom, right);
        return ans;
    }

    private void helper(int[][] matrix, int top, int left, int bottom, int right) {
        if(top>bottom || left>right) return;
        for (int i = left; i <= right; i++) {
            ans.add(matrix[top][i]);
        }
        top++;
        for (int i = top; i <= bottom; i++) {
            ans.add(matrix[i][right]);
        }
        right--;
        if (top <= bottom) {
            for (int i = right; i >= left; i--) {
                ans.add(matrix[bottom][i]);
            }
            bottom--;
        }
        if (left <= right) {
            for (int i = bottom; i >= top; i--) {
                ans.add(matrix[i][left]);
            }
            left++;
        }
        helper(matrix, top, left, bottom, right);
    }
}
