# Time Complexity: O(M * N), M * N is the size of matrix
# Space Complexity: O(1)
# Did this code successfully run on Leetcode: Yes


from typing import List

class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        rows = len(matrix)
        columns = len(matrix[0])
        top = 0
        left = 0
        bottom = rows - 1
        right = columns - 1
        result = []

        while left <= right and top <= bottom:
            # move right
            for col in range(left, right + 1):
                result.append(matrix[top][col])
            
            top += 1

            # move bottom
            for row in range(top, bottom + 1):
                result.append(matrix[row][right])
            
            right -= 1

            if top <= bottom:
                # move left
                for col in range(right, left - 1, -1):
                    result.append(matrix[bottom][col])
                
                bottom -= 1

            if left <= right:
                # move up
                for row in range(bottom, top - 1, -1):
                    result.append(matrix[row][left])
                
                left += 1

        return result