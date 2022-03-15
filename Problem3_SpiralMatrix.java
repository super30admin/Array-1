// Time Complexity : O(M * N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

/*

Maintaining 4 sides of Matrix : Left, Top, Right, Bottom

Traversing from Left - Right, Top - Bottom, Right - Left and Bottom - Top

Do this 4 operations till Left <= Right and Top <= bottom

*/

// Your code here along with comments explaining your approach
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();

        if(matrix == null || matrix.length == 0){
            return result;
        }
        
        int m = matrix.length;
        int n = matrix[0].length;
        
        int left = 0, top = 0;
        int right = n - 1, bottom = m - 1;
        
        while(left <= right && top <= bottom){
            for(int i = left; i <= right; i++){  //Left to right
                result.add(matrix[top][i]);
            }
            
            top++;
            
            if(top <= bottom){
                for(int i = top; i <= bottom; i++){ // Top to bottom
                result.add(matrix[i][right]);
            } 
            }
            
            right--;
            
            if(left <= right){
            for(int i = right; i >= left; i--){  //Right to left
                result.add(matrix[bottom][i]);
            }
            }
            bottom--;
            
            if(top <= bottom){
            for(int i = bottom; i >= top; i--){ // Bottom to top
                result.add(matrix[i][left]);
            }
            
            left++;
            }
            
        }
        
        return result;
        
    }
}
