// Time Complexity : O(n*m)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : y
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        
        int n = matrix.length, m = matrix[0].length;
        int top = 0, bottom = n-1, left = 0, right = m - 1; 
        
        while(result.size() < n*m) {
            for(int j=left; j<=right; j++) {
                result.add(matrix[top][j]);
            }
            top++;
            
            for(int i=top; i<=bottom; i++) {
                result.add(matrix[i][right]);
            }
            right--;
            
            if(result.size() < n*m) {
                for(int j=right; j>=left; j--) {
                    result.add(matrix[bottom][j]);
                }
                bottom--;
            }
             
            if(result.size() < n*m) {
                for(int i=bottom; i>=top; i--) {
                    result.add(matrix[i][left]);
                }
                left++; 
            }
        }
        
        return result; 
    }
}