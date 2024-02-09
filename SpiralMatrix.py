"""
Time Complexity : O(m*n)
Space Complexity : O(1)
Did this code successfully run on Leetcode :  yes
Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
"""


class Solution:
    def spiralOrder(self, matrix: list[list[int]]) -> list[int]:
        r = len(matrix)
        c = len(matrix[0])
        top = 0
        bottom = r - 1
        left = 0
        right = c - 1
        result = []
        while left <= right and top <= bottom:
            # traverse the top row
            for i in range(left, right + 1, 1):
                result.append(matrix[top][i])
            top += 1
            # traverse the right col
            for i in range(top, bottom + 1, 1):
                result.append(matrix[i][right])
            right -= 1
            # traverse the bottom row
            if top <= bottom:
                for i in range(right, left - 1, -1):
                    result.append(matrix[bottom][i])
                bottom -= 1
            # traverse the left col
            if left <= right:
                for i in range(bottom, top - 1, -1):
                    result.append(matrix[i][left])
                left += 1
        return result
