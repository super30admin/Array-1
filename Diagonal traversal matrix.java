/*
class Solution:
    def findDiagonalOrder(self, matrix: List[List[int]]) -> List[int]:
        if matrix is None or len(matrix) == 0:
            return []
        
        rows, cols = len(matrix), len(matrix[0])
        result = [0] * (rows *cols)
        i, j = 0, 0
        direction = 1
        
        for index in range(len(result)):
            result[index] = matrix[i][j]
            
            if direction == 1:
                if j == cols - 1:
                    direction = -1
                    i += 1
                elif i == 0:
                    j += 1
                    direction = -1
                else:
                    i -= 1
                    j += 1
            else:
                if i == rows - 1:
                    direction = 1
                    j += 1
                elif j == 0:
                    i += 1
                    direction = 1
                else:
                    i += 1
                    j -= 1
        
        return result
*/

// Time Complexity : O(rows * cols)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english: Everytime I maintained a direction variable and I took care of edge cases where 
// row would be 0 or at max index and same for column as well

class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {
        if (matrix == null || matrix.length == 0){
            return new int[0];
        }
        
        int rows = matrix.length, cols = matrix[0].length;
        int[] result = new int[rows*cols];
        int i = 0, j = 0;
        int direction = 1;
        
        for (int k=0; k<result.length; k++){
            result[k] = matrix[i][j];
            if (direction == 1){
                if (j == cols - 1){
                    direction = -1;
                    i += 1;
                }
                    
                else if (i == 0){
                     j += 1;
                    direction = -1;
                }
                   
                else{
                    i -= 1;
                    j += 1;
                }
                    
            }
                
            else{
                if (i == rows - 1){
                    direction = 1;
                    j += 1;
                }
                    
                else if(j == 0) {
                    i += 1;
                    direction = 1;
                }
                    
                else{
                    i += 1;
                    j -= 1;
                }
                    
            }
                