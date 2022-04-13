from typing import List
""" Time complexity is O(n)
    Space complexity is O(1)
"""


class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:

        m = len(matrix)
        n = len(matrix[0])
        result = ['' for _ in range(0, m * n)]

        top = 0
        left = 0
        right = n - 1
        bottom = m - 1
        index = 0
        while (top <= bottom and left <= right):
            # moving left to right
            for col in range(left, right + 1):
                # result.(matrix[top][col])
                result[index] = matrix[top][col]
                index += 1
            top += 1  # here we reach at end of col and need to move top down to avoid capturing
            # 3 again

            # moving top to bottom
            for row in range(top, bottom + 1):
                # result.add(matrix[row][right])
                result[index] = matrix[row][right]
                index += 1
            right -= 1  # here we reach at bottom of right and need to move right towards to
            # avoid capturing 9 again

            # moving right to left
            if top <= bottom:
                for col in range(right, left - 1, -1):
                    # result.append(matrix[bottom][col])
                    result[index] = matrix[bottom][col]
                    index += 1
                bottom -= 1  # here we reach at left bottom corner and need to move bottom up to
                # avoid capturing 7 again

            # moving bottom to top
            if left <= right:
                for row in range(bottom, top - 1, -1):
                    # result.append(matrix[row][left])
                    result[index] = matrix[row][left]
                    index += 1
                left += 1  # here we reach at left and need to move it to avoid capturing 4 again

        return result
