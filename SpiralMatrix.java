/*
This approach solves the problem by using four pointers to mark the topmost and bottommost rows, 
and the leftmost and rightmost columns. It then spirally traverses the 2D matrix from leftmost 
to rightmost, topmost to bottommost, rightmost to leftmost, bottommost to topmost respectively.
Each time it traverses a part of the spiral, it reduces/increases the correspondingly traversed
row or column value so that it does not repeat it.

Does this code run on leetcode: Yes

Problems with this approach: None
*/
class Solution {
    //Time Complexity: O(rows*columns)
    //Space Complexity: O(1)
    public List<Integer> spiralOrder(int[][] matrix) {
        
        List<Integer> result = new ArrayList<>();
        
        if(matrix.length == 1 && matrix[0].length == 1)
        {
            result.add(matrix[0][0]);
            return result;
        }
            
        int left = 0;
        int right = matrix[0].length - 1;
        int top = 0;
        int bottom = matrix.length - 1;
        //We stop the traversal when the top/bottom and left/right overlap
        while(left <= right && top <= bottom)
        {
            for(int i = left; i <= right; i++)
                result.add(matrix[top][i]);
            
            top++;
            //We check the while loop conditions again after every traversal to make sure that it is still valid
            if(top > bottom)
                break;
            
            for(int i = top; i <= bottom; i++)
                result.add(matrix[i][right]);
            
            right--;
            
            if(left > right)
                break;
            
            for(int i = right; i >= left; i--)
                result.add(matrix[bottom][i]);
                
            bottom--;
            
            if(top > bottom)
                break;
            
            for(int i = bottom; i >= top; i--)
                result.add(matrix[i][left]);
                
            left++;
        }
        
        return result;
        
    }
}