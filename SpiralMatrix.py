# Time Complexity : O(m*n) where n*m are the rows and colums of the matrix
# Space Complexity : O(m*n)

from typing import List

class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        # Edge case
        if not matrix:
            return []
        
        m, n = len(matrix), len(matrix[0])
        result = []
        
        # Initialize variables for keeping track of the boundaries
        top, bottom, left, right = 0, m-1, 0, n-1
        
        # Traverse the matrix in a spiral order
        while top <= bottom and left <= right:
            # Traverse the top row
            for i in range(left, right+1):
                result.append(matrix[top][i])
            top += 1
            
            # Traverse the right column
            for i in range(top, bottom+1):
                result.append(matrix[i][right])
            right -= 1
            
            # Check if we have already traversed all rows and columns
            if top <= bottom and left <= right:
                # Traverse the bottom row
                for i in range(right, left-1, -1):
                    result.append(matrix[bottom][i])
                bottom -= 1
                
                # Traverse the left column
                for i in range(bottom, top-1, -1):
                    result.append(matrix[i][left])
                left += 1
        
        return result