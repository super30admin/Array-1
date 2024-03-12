// Time Complexity : O(n*m) : m - rows, n - columns
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
// Maintain top left bottom and right pointers, keeping traversing and updating the pointers, which indirectly helps
// us look at the inner square each time

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;
        int top = 0;
        int right = n - 1;
        int bottom = m - 1;
        int left = 0;

        while (left <= right && top <= bottom){
            //top boundary
            for ( int j = left ; j<= right; j++){
                result.add(matrix[top][j]);
            }
            top++;
            //right boundary
            for ( int i = top; i<=bottom ; i++){
                result.add(matrix[i][right]);
            }
            right--;
            if (top <= bottom)
                //bottom boundary
                for ( int j = right ; j>= left; j--){
                    result.add(matrix[bottom][j]);
                }
                bottom--;
            //left boundary
            if (left <= right){
                for ( int i = bottom; i>=top ; i--){
                    result.add(matrix[i][left]);
                }
                left++;
            }
        }
        return result;
    }
}