// Time Complexity : O(M*N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        List<Integer> result = new ArrayList();
        
        int top = 0, bottom = matrix.length - 1;
        int left = 0, right = matrix[0].length - 1;
        
        int curr = 0;
        
        while(top <= bottom && left <= right) {
            
            if(curr == 0) {
                for(int i = left; i <= right; i++)
                    result.add(matrix[top][i]);
                top++;
                curr = 1;
            }
            
            else if(curr == 1) {
                for(int i = top; i <= bottom; i++ )
                    result.add(matrix[i][right]);
                right--;
                curr = 2;
            }
            
            else if(curr == 2) {
                for(int i = right; i >= left; i--)
                    result.add(matrix[bottom][i]);
                bottom--;
                curr = 3;
            }
            
            else if(curr == 3) {
                for(int i = bottom; i >= top; i--)
                    result.add(matrix[i][left]);
                left++;
                curr = 0;
            }
            
        }
        return result;
    }
}