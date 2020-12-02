// 54. Spiral Matrix (PR#27)

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        List<Integer> result  = new ArrayList<>();
        
        if (matrix == null || matrix.length == 0) 
            return result;
        
        int left = 0, right = matrix[0].length -1 ;
        int top = 0, bottom = matrix.length -1 ;
        
        while ( top <= bottom && left <= right)
        {
            for (int i = left; i <= right; i++ )
            {
                result.add(matrix[top][i]);
            }
            top++;
            
            if(top <= bottom && left <= right)
            for (int i = top; i <= bottom; i++ )
            {
                result.add(matrix[i][right]);
            }
            right--;
            
            if(top <= bottom && left <= right)
            for (int i = right; i >= left; i-- )
            {
                result.add(matrix[bottom][i]);
            }
            bottom--;
            
            if(top <= bottom && left <= right)
            for (int i = bottom; i >= top; i-- )
            {
                result.add(matrix[i][left]);
            }
            left++;
            
        }
        return result; 
    }
}

/*

Complexity Analysis

Time Complexity: 
O(N), where N is the total number of elements in the input matrix. We add every element in the matrix to our final answer.

Space Complexity:
O(1) without considering the output array, since we don't use any additional data structures for our computations.
*/