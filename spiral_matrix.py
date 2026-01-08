"""
time - o(n)
space o(1)
We maintain four boundaries left, right, top and bottom and move from left to right, top to bottom and right to left and bottom to top
as we keep moving we increment/decrement the boundaries.
"""

from typing import List


class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        result = []
        left, right, top, bottom = 0, len(matrix[0]) - 1, 0, len(matrix) - 1
        while left <= right and top <= bottom:
            for i in range(left, right + 1):
                result.append(matrix[top][i])
            top += 1

            if top <= bottom and left <= right:
                for i in range(top, bottom + 1):
                    result.append(matrix[i][right])
                right -= 1

            if right >= left and top <= bottom:
                for i in range(right, left - 1, -1):
                    result.append(matrix[bottom][i])
                bottom -= 1

            if top <= bottom and left <= right:
                for i in range(bottom, top - 1, -1):
                    result.append(matrix[i][left])
                left += 1

        return result
