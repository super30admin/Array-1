# Time Complexity: O(m*n), where m = number of rows and n = number of columns
# Space Complexity: O(1)

# Approach:
# 1. We maintain 4 pointers, left, right, top, and bottom to keep track of the rows and columns already traversed
# 2. After a left to right traversal, we increment top pointer, indicating the row above the top pointer is already traversed
# 3. After a top to bottom traversal, we decrement the right pointer, indicating the column on the right of right pointer is already traversed
# 3. After a right to left traversal, we decrement the bottom pointer
# 4. After a bottom to top traversal, we increment the left pointer
from typing import List
class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        m = len(matrix)
        n = len(matrix[0])
        res = []

        left, right = 0, n-1
        top, bottom = 0, m-1

        while left <= right and top <= bottom:
            for i in range(left, right+1):
                res.append(matrix[top][i])
            top += 1

            if top <= bottom:
                for i in range(top, bottom+1):
                    res.append(matrix[i][right])
                right -= 1
            
            if top <= bottom and left <= right:
                for i in range(right, left-1, -1):
                    res.append(matrix[bottom][i])
                bottom -= 1
            
            if top <= bottom and left <= right:
                for i in range(bottom, top-1, -1):
                    res.append(matrix[i][left])
                left += 1
        return res