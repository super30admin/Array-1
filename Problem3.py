# Time Complexity : O(m * n)   # We touch each element exactly once
# Space Complexity : O(1)      # Ignoring the output list
# Did this code successfully run on Leetcode : Yes
# Three line explanation of solution in plain english :
# 1. Use four pointers (top, bottom, left, right) to track boundaries of the spiral.
# 2. Traverse top row → right column → bottom row → left column, shrinking boundaries after each.
# 3. Stop when all rows and columns are processed.

class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        if not matrix:
            return []

        m, n = len(matrix), len(matrix[0])
        result = []

        # Initialize boundaries
        top, bottom = 0, m - 1
        left, right = 0, n - 1

        while top <= bottom and left <= right:
            # Traverse top row (left → right)
            for c in range(left, right + 1):
                result.append(matrix[top][c])
            top += 1  # Move boundary down

            # Traverse right column (top → bottom)
            for r in range(top, bottom + 1):
                result.append(matrix[r][right])
            right -= 1  # Move boundary left

            # Traverse bottom row (right → left), if still valid
            if top <= bottom:
                for c in range(right, left - 1, -1):
                    result.append(matrix[bottom][c])
                bottom -= 1  # Move boundary up

            # Traverse left column (bottom → top), if still valid
            if left <= right:
                for r in range(bottom, top - 1, -1):
                    result.append(matrix[r][left])
                left += 1  # Move boundary right

        return result
