/* Time Complexity: O(m*n)
 * Space Complexity: O(1)
 * Did this code successfully run on Leetcode : yes
 * Any problem you faced while coding this : No
 */

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        List<Integer> result = new ArrayList<>();
        //null
        if(matrix == null) return result; 
        int left = 0;
        int right = n-1;
        int top = 0;
        int bottom = m-1;
        while(left <= right && top <= bottom){
            //top row
            for(int j = left; j <= right; j++){
                result.add(matrix[top][j]);
            }
            top++;
            //right col
            for(int i = top; i <= bottom; i++){
                result.add(matrix[i][right]);
            }
            right--;
            //bottom row
            if(top <= bottom){
                for(int j = right; j >= left; j--){
                    result.add(matrix[bottom][j]);
                }
            }
            bottom--;
            //left col
            if(left <= right){
                for(int i = bottom; i >= top; i--){
                    result.add(matrix[i][left]);
                } 
            }
            
            left++;
        }
        return result;
    }
}
