// Time Complexity : O(m*n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes

// Three line explanation of solution in plain english
/**
 * Use 4 pointer left, right, top & bottom to track the boundaries.
 * Reduce the boundaries iteratively.
 * Watch for edge case to avoid array out of bound exception
 */

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int left = 0, right = n-1, top = 0, bottom = m-1;

       List<Integer> li = new ArrayList<>();

        while(left <= right && top <= bottom){
            // top row
            for (int i = left; i <= right; i++){
                li.add(matrix[top][i]);
            }
            top++;
            
            // right wall
            for (int i = top; i <= bottom; i++){
                li.add(matrix[i][right]);
            }
            right--;

            // bottom row
            if(top <= bottom){
                for (int i = right; i >= left; i--){
                    li.add(matrix[bottom][i]);
                }
            }
            bottom--;

            // left wall
            if(left <= right){
                for (int i = bottom; i >= top; i--){
                    li.add(matrix[i][left]);
                }
            }
            left++;
        }
        return li;
    }
}