// Time Complexity : O(m*n) m is number of rows and n is number of columns
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        
        if(matrix == null || matrix.length == 0) {
            return new ArrayList<>();
        }
        
        List<Integer> result = new ArrayList<>();
        int left = 0, right = matrix[0].length - 1;
        int top = 0, bottom = matrix.length - 1;
        
        while (top <= bottom && left <= right) {
            
            for (int i = left; i<= right; i++) {
                result.add(matrix[top][i]);
            } 
            top++;
            
            if(top <= bottom && left <= right) {
                for (int i = top; i<= bottom; i++) {
                result.add(matrix[i][right]);
            } 
            right--;
            }
            
            if(top <= bottom && left <= right) {
                for (int i = right; i>= left; i--) {
                result.add(matrix[bottom][i]);
            } 
            bottom--;
            }
            
            if(top <= bottom && left <= right) {
                for (int i = bottom; i>= top; i--) {
                result.add(matrix[i][left]);
            } 
            left++;
            }
        }
        
        return result;
    }
}