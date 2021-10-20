// Time Complexity :O(m*n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :yes

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        List<Integer> result = new ArrayList<Integer>();
        int left = 0;
        int right = matrix[0].length -1;
        int top = 0;
        int bottom = matrix.length -1;
        
        while(result.size() < matrix[0].length * matrix.length){
            
            for(int i = left; i<= right; i++){
                result.add(matrix[top][i]);
            }
           
             for(int i = top+1; i<= bottom ;i++){
                result.add(matrix[i][right]);
            }
               
            if(top!=bottom){
            for(int i = right-1; i>=left; i--){
                result.add(matrix[bottom][i]);
            }
            }
            
            if(left!= right){
            for(int i = bottom-1; i>top; i--){
                result.add(matrix[i][left]);
            }
            }
            
            top++;
            right--;
            left++;
            bottom--;
        }
        
        return result;

    }
}