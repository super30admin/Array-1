# Time Complexity : O(m * n)
# Space Complexity : O(1) 
# Did this code successfully run on Leetcode : Yes
# Three line explanation of solution in plain english:
# 1. Traverse the matrix left to right (top row), top to bottom (right column), right to left (bottom row), and bottom to top (left column).
# 2. four pointers (top, bottom, left, right) to track the current boundaries.
# 3. After each traversal, update the pointers to shrink the boundary inward for the next layer.

class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        if not matrix:
            return []
        
        result = []
        top = 0
        bottom = len(matrix) - 1
        left = 0
        right = len(matrix[0]) - 1

        while top <= bottom and left <= right:
            for col in range(left, right+1):
                result.append(matrix[top][col])
            top += 1

            for row in range(top, bottom+1):
                result.append(matrix[row][right])
            right -= 1

            if top <= bottom:
                for col in range(right, left -1, -1):
                    result.append(matrix[bottom][col])
                bottom -= 1

            if left <= right:
                for row in range(bottom, top -1, -1):
                    result.append(matrix[row][left])
                left += 1

        return result