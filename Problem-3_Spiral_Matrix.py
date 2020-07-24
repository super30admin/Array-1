# APPROACH 1: OPTIMAL SOLUTION
# Time Complexity : O(n*m), n: number of rows of matrix and m: number of column of the matrix
# Space Complexity : O(n*m) - size of output array, else O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : None
#
#
# Your code here along with comments explaining your approach
# 1. Here we traverse in four directions - left, right, up, down. Keep track of the limits of column and row limits
# 2. if direction is right -> keep adding elements of the same row till current last column, shrink rows by 1, change direction to down
# 3. if direction is down -> keep adding elements of same column till current last row, shrink columns by 1 and change direction to left
# 4. if direction is left -> keep adding elements of the same row till current first column, shrink rows by 1 and change direction to up
# 5. if direction is up -> keep adding elements of the same column till current first row, shrink the columns by 1 and change direction to right
# 6. Keep doing until the rows and columns are shrinked and cross-over

class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        
        if not matrix:
            return None
        
        isRight, isLeft, isDown, isUp = True, False, False, False
        row_start, row_end, column_start, column_end = 0, len(matrix) - 1, 0, len(matrix[0]) - 1
        row, column, result = 0, 0, []
        
        while row_start <= row_end and column_start <= column_end:
            
            if isRight:
                row = row_start
                for column in range(column_start, column_end + 1):
                    result.append(matrix[row][column])
                    
                row_start, isRight, isDown = row_start + 1, False, True
                
                
            if row_start <= row_end and column_start <= column_end and isDown:
                column = column_end
                for row in range(row_start, row_end + 1):
                    result.append(matrix[row][column])
                    
                column_end, isDown, isLeft = column_end - 1, False, True
                
                
            if row_start <= row_end and column_start <= column_end and isLeft:
                row = row_end
                for column in range(column_end, column_start - 1, -1):
                    result.append(matrix[row][column])
                    
                row_end, isLeft, isUp = row_end - 1, False, True
                
                
            if row_start <= row_end and column_start <= column_end and isUp:
                column = column_start
                for row in range(row_end, row_start - 1, -1):
                    result.append(matrix[row][column])
                    
                column_start, isUp, isRight = column_start + 1, False, True
                
                
        return result
        
