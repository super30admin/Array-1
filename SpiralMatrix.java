// Time Complexity : O(m*n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

// Updating the boundary as we traverse.
// Make sure no coloumn or row is traversed again

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int left = 0;
        int top = 0;
        int bottom = matrix.length-1;
        int right = matrix[0].length-1;
        
        List<Integer> res = new ArrayList<>();
        
        while(top <= bottom && left <= right) {
            //top
            for (int j = left; j <= right; j++)
                res.add(matrix[top][j]);
            top++;
            
            //right
            for (int i = top; i <= bottom; i++)
                res.add(matrix[i][right]);
            right--;
            
            //bottom 
            if (top <= bottom){
                //to make sure that we are not on a row that has already been traversed. 
                for (int j = right; j >= left; j--)
                    res.add(matrix[bottom][j]);
            }            
            bottom--;
            
            //left
            if (left <= right){
                //to avoid re-traversing the same column.
                for (int i = bottom; i >= top; i--)
                    res.add(matrix[i][left]);
            }
            left++;            
        }
        
        return res;
    }
}
