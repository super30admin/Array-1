//TC: O(m*n)
//SC: O(1)

class Solution {
    
    List<Integer> res = new ArrayList<>();
    
    public List<Integer> spiralOrder(int[][] matrix) {
        
        helper(matrix, 0, matrix[0].length-1, 0, matrix.length-1);
        return res;
     
    }
    
    private void helper(int[][] matrix, int left, int right, int top, int bottom){
        
        //base case
        if(left >right || top > bottom){
            return;
        }
        
        //top row
        for(int i=left; i<=right; i++)
            res.add(matrix[top][i]);
        top++;
        
        //right column
        for(int i=top; i<=bottom; i++)
            res.add(matrix[i][right]);
        right--;
        
        //bottom row
        if(top <= bottom) {
            for(int i=right; i>=left; i--)
                res.add(matrix[bottom][i]);
        }
        
        bottom--;
        
        //left column
        if(left <= right) {        
            for(int i=bottom; i>=top; i--)
                res.add(matrix[i][left]);
        }
        left++;
        
        helper(matrix, left, right, top, bottom);
    }
}