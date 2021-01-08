// TC: O(m*n) ->m,n -> dimensions of matrix
// SC: O(1) -> No extra space required
// Did it run successfully on Leetcode?: Yes

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList();
        
        if ( matrix == null || matrix.length == 0)
            return result;
        
        int m = matrix.length;
        int n = matrix[0].length;
        
        int top = 0;
        int bottom = m-1;
        int left = 0;
        int right = n-1;
        
        while ( top <= bottom && left <= right)
        {
            
            // print top row
            for ( int i = left; i <= right; i++)
            {
                result.add(matrix[top][i]);
            }
            top++;
            
        
            // print right column
            for ( int i = top; i <= bottom; i++)
            {
                result.add(matrix[i][right]);
            }
            right--;
            
            
            // print bottom row
           if ( top <= bottom ){
            for ( int i = right; i >=  left; i--)
            {
                result.add(matrix[bottom][i]);
            }
            bottom--;
            }
            
            // print left column
           if ( left <= right){
            for ( int i = bottom; i >= top; i--)
            {
                result.add(matrix[i][left]);
            }
            left++;
            }
        }
        return result;    
    }
}
