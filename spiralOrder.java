// Time Complexity : O(M*N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :Yes

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        if(matrix == null || matrix.length == 0){
            return result;
        }
        int left = 0, right = matrix[0].length - 1;
        int top = 0, bottom = matrix.length - 1;
        while(top <= bottom && left <= right){
            //left to right
            for(int i = left; i<= right; i++){
                //top(1st row)
                result.add(matrix[top][i]);
            }
            top++;
            
            //top to botom
            if(top<= bottom && left<= right){
                for(int i = top; i<=bottom; i++){
                    result.add(matrix[i][right]);
                }
                right--;
            }
            
            //bottom from right to left
            if(top<= bottom && left<= right){
                for(int i = right; i>=left; i--){
                    result.add(matrix[bottom][i]);
                }
                bottom--;
            }
            
            //bottom to top
            if(top<= bottom && left<= right){
                for(int i = bottom;i>=top; i--){
                    result.add(matrix[i][left]);
                }
                left++;
            }
        }
        return result;
    }
}