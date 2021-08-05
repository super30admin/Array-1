"""
Time Complexity : O(m*n) where m is no. of rows, n is no. of columns
Space Complexity : O(1)
Did this code successfully run on Leetcode : Yes
"""
class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        m = len(matrix)
        n = len(matrix[0])
        result = []
        top = 0
        bottom = m - 1
        left = 0
        right = n - 1
        while top <= bottom and left <= right:
            # Left to Right
            for i in range(left, right+1):
                result.append(matrix[top][i])
            top += 1
            
            # Top to Bottom
            for i in range(top, bottom+1):
                result.append(matrix[i][right])
            right -= 1
            
            # Right to Left
            if top <= bottom:
                for i in range(right, left -1, -1):
                    result.append(matrix[bottom][i])
                bottom -= 1
            
            # Bottom to Top
            if left <= right:
                for i in range(bottom, top - 1, -1):
                    result.append(matrix[i][left])
                left += 1
        return result
            