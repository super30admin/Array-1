// Time Complexity : O(mn) where m is number of rows and n is number of columns in matrix.
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no



class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        if(matrix == null || matrix.length == 0) return new ArrayList();
        int top = 0, right = matrix[0].length - 1, bottom = matrix.length - 1, left = 0;
        List<Integer> result = new ArrayList();
        while(top <= bottom && left <= right){           
            for(int i = left; i <= right; i++){
                result.add(matrix[top][i]);
            }
            top++;
            for(int i = top; i <= bottom; i++){
                result.add(matrix[i][right]);
            }
            right--;
            if(top <= bottom && left <= right){
            for(int i = right; i >= left; i--){
                result.add(matrix[bottom][i]);
            }
            }
            bottom--;
            if(top <= bottom && left <= right){
            for(int i = bottom; i >= top; i--){
                result.add(matrix[i][left]);
            }
            }
            left++;
        }
        return result;
    }
}


// Your code here along with comments explaining your approach
