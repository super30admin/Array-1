"""
Given an m x n matrix, return all elements of the matrix in spiral order.

"""

# Time Complexity : O(m*n) matrix row and column
# Space Complexity : O(1) returning result array used for calculations
# Did this code successfully run on leetcode : Yes
# Any problem you faced while coding this : No

from typing import List

if matrix == None or len(matrix) == 0 or len(matrix[0]) == 0:
            return []
        result = []
        top = 0
        bottom = len(matrix) - 1
        left = 0
        right = len(matrix[0]) - 1
        
        while top <= bottom and left <= right:
            
            # top
            for i in range(left, right+1):
                result.append(matrix[top][i])
            top += 1
                
            # right
            for i in range(top, bottom+1):
                result.append(matrix[i][right])
            right -= 1
            
            if top <= bottom and left <= right:
                # bottom
                for i in range(right, left-1, -1):
                    result.append(matrix[bottom][i])
                bottom -= 1
            if top <= bottom and left <= right:
                # left
                for i in range(bottom, top-1, -1):
                    result.append(matrix[i][left])
                left += 1
            
        return result
        
      
        