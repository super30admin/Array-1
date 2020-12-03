/*
class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        rows, cols = len(matrix), len(matrix[0])
        result = []
        
        left, top = 0, 0
        right = cols - 1
        bottom = rows - 1
        
        while top <= bottom and left <= right:
            for i in range(left, right+1):
                result.append(matrix[top][i])
            top += 1
            
            if top <= bottom and left <= right:
                for i in range(top, bottom+1):
                    result.append(matrix[i][right])
                right -= 1
                
            if top <= bottom and left <= right:
                for i in range(right, left-1, -1):
                    result.append(matrix[bottom][i])
                bottom -= 1
                
            if top <= bottom and left <= right:
                for i in range(bottom, top-1, -1):
                    result.append(matrix[i][left])
                left += 1
        return result
*/

// Time Complexity : O(rows * cols)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english: Maintained 4 pointers left, right, top, bottom and everytime after travelling
// in one direction incremented or decremented the pointers 

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        if (matrix == null || matrix.length == 0)
            return result;
        
        int rows = matrix.length, cols = matrix[0].length;
        int left = 0, top = 0, right = cols - 1, bottom = rows - 1;
        while (top <= bottom && left <= right){
            for (int i=left; i<= right; i++){
                result.add(matrix[top][i]);
            }
            top ++;
            
            if (top <= bottom && left <= right){
                for (int i=top; i<= bottom; i++){
                result.add(matrix[i][right]);
            }
                right --;
            }
            
            if (top <= bottom && left <= right){
                for (int i=right; i>=left; i--){
                result.add(matrix[bottom][i]);
            }
                bottom --;
            }
            
            
            if (top <= bottom && left <= right){
                for (int i=bottom; i>=top; i--){
                result.add(matrix[i][left]);
            }
                left ++;
            }
            
        }
        
        return result;
        
        
    }
}
