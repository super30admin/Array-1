//54 Spiral Matrix
// Solved on leetcode
// time Complexity - O(m*n)
// Space Complexity - O(1)
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int top = 0;
        int bottom=matrix.length-1;
        List<Integer> result= new ArrayList();
        int left= 0;
        int right=matrix[0].length-1;
        
        
        while(top<=bottom && left<=right){
            // moving towards right
            for(int i=left;i<=right;i++){
                result.add(matrix[top][i]);
            } 
            top++;
            // moving downwards
            for(int i=top;i<=bottom;i++){
                result.add(matrix[i][right]);
            }
            right--;
            
            // moving towards left
           if(top<=bottom){
               for(int i=right;i>=left;i--){
                result.add(matrix[bottom][i]);
            }
            bottom--;
           } 
            // moving towards top
            if(left<=right){
              for(int i=bottom;i>=top;i--){
                result.add(matrix[i][left]);
            }
            left++;  
            }
            
        }
        return result;
    }
}