# Approach: We use a boundary-based traversal, by shrinking the left, right, top, and bottom boundaries while traversing the matrix in a spiral order.
# Time Complexity: O(m*n)(each element is visited once)
# Space Complexity: O(1) (excluding output array)

from typing import List


class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        if not matrix or not matrix[0]:  # Handle empty matrix edge case
            return []

        left = 0  # Left boundary
        right = len(matrix[0]) - 1  # Right boundary
        top = 0  # Top boundary
        bottom = len(matrix) - 1  # Bottom boundary

        res = []  # Result list to store elements in spiral order

        while left <= right and top <= bottom:
            # Traverse from left to right along the top row
            for i in range(left, right + 1):
                res.append(matrix[top][i])
            top += 1  # Move the top boundary down

            # Traverse from top to bottom along the right column
            for j in range(top, bottom + 1):
                res.append(matrix[j][right])
            right -= 1  # Move the right boundary left

            # Check if there are still rows left to traverse
            if top <= bottom:
                # Traverse from right to left along the bottom row
                for k in range(right, left - 1, -1):
                    res.append(matrix[bottom][k])
                bottom -= 1  # Move the bottom boundary up

            # Check if there are still columns left to traverse
            if left <= right:
                # Traverse from bottom to top along the left column
                for x in range(bottom, top - 1, -1):
                    res.append(matrix[x][left])
                left += 1  # Move the left boundary right

        return res  # Return the final spiral order list


sol = Solution()
mat1 = [[1, 2, 3], [4, 5, 6], [7, 8, 9]]

print(sol.spiralOrder(mat1))
