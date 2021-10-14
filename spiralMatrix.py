"""
Time Complexity: O(m*n)
Space Complexity: O(1)
"""

class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:

        m = len(matrix)  # row
        n = len(matrix[0])  # column
        top = 0
        bottom = m - 1
        left = 0
        right = n - 1
        solution = []

        # base condition
        while (len(solution) < m * n):

            # top row
            for i in range(left, right + 1):
                solution.append(matrix[top][i])

            # right column
            for i in range(top + 1, bottom + 1):
                solution.append(matrix[i][right])

            # bottom row
            if top != bottom:
                for i in range(right - 1, left - 1, -1):
                    solution.append(matrix[bottom][i])

            # left row
            if left != right:
                for i in range(bottom - 1, top, -1):
                    solution.append(matrix[i][left])

            left += 1
            right -= 1
            top += 1
            bottom -= 1

        return solution
