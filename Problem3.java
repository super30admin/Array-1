// Leetcode 54: Spiral Matrix
// Time - O(mn)
// Space - O(1)

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        int left = 0;
        int right = matrix[0].length - 1;
        int top = 0;
        int bottom = matrix.length - 1;
        
        ArrayList<Integer> spiralTraversal = new ArrayList<>();
        
        while(left <= right && top <= bottom)
        {
            
            for(int i = left; i <= right; i++){
                
                spiralTraversal.add(matrix[top][i]);
            }
            top++;
            
                
            for(int i = top; i <= bottom; i++){
                spiralTraversal.add(matrix[i][right]);
            }

            right--;

            if(top<=bottom){
                for(int i = right; i>= left; i--){
                    spiralTraversal.add(matrix[bottom][i]);
                }
                bottom--;    
            } 
            if(left<=right){
                for(int i = bottom; i>=top;i--){
                    spiralTraversal.add(matrix[i][left]);
                }
                left++;
            }
        }
        
        return spiralTraversal;
    }
}