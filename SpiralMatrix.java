// Time Complexity : O(mxm)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english: make squre pattern and change the 4 pointers left, right, top and bottom.

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        if(matrix == null || matrix.length == 0)
            return new ArrayList<>();
        
        List<Integer> res = new ArrayList<>();
        
        int top = 0;
        int bottom = matrix.length-1;
        int left = 0;
        int right = matrix[0].length-1;
        
        while(left <= right && top <= bottom){
            
            //top
            for(int j=left; j<= right; j++){
                res.add(matrix[top][j]);
            }
            top++;
            
            //right
            for(int i=top; i<= bottom; i++){
                res.add(matrix[i][right]);
            }
            right--;
            
            //bottom
            if(top <= bottom){
                for(int j=right; j>= left; j--){
                    res.add(matrix[bottom][j]);
                }
            }
            bottom--;
            
            //left
            if(left <= right){
                for(int i=bottom; i>= top; i--){
                    res.add(matrix[i][left]);
                } 
            }
            left++;
        }
        return res;
    }
}
