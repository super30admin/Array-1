// Time Complexity : O(m*n)
// Space Complexity : O(1) 
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        
        //edge case
        if(matrix.length == 0 || matrix == null){
            return result;
        }
        
        int row = matrix.length;
        int col = matrix[0].length;
        
        //declaring four pointers to keep track of four directions, i.e., top, bottom, left and right
        int left = 0;
        int right = col-1;
        int top = 0;
        int bottom = row - 1;
        
        while(left <= right && top <= bottom){
            //top
            for(int i = left;i <= right; i++){
                result.add(matrix[top][i]);
            }
            top++;
            
            //right
            for(int i = top;i <= bottom; i++){
                result.add(matrix[i][right]);
            }
            right--;
            
            //bottom
            if(top <= bottom){
                for(int i = right; i >= left; i--){
                    result.add(matrix[bottom][i]);
                }
                bottom--;
            }
            
            //left
            if(left <= right){
                for(int i = bottom; i >= top; i--){
                    result.add(matrix[i][left]);
                }
                left++;
            }
        }
        
        return result;
        
    }
}