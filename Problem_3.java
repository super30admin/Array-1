// Time Complexity : O(m*n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
// take four pointer and go through each element, be sure to chake the base condition at the end of each traverser
// Your code here along with comments explaining your approach
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0) return result;
        int m = matrix.length; int n = matrix[0].length;
        int top = 0; int bottom = m-1;
        int left = 0; int right = n-1;
        while( top <= bottom && left <= right){
            // left to right
            for( int j = left; j <= right ; j++){
                result.add(matrix[top][j]);
            }
            top++;
            // top to bottom
            for( int i = top; i <= bottom; i++){
                result.add(matrix[i][right]);
            }
            right--;
            if(top <= bottom){
                // right to left
                for( int j = right; j >= left; j--){
                    result.add(matrix[bottom][j]);
                }
                bottom--;
            }
            if(left <= right){
                // bottom to top
                for( int i = bottom ; i >= top ; i--){
                    result.add(matrix[i][left]);
                }
                left++;
            }
        }
        return result;
    }
}