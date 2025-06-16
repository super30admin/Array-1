# # Iterative
# # Use four boundaries: top, bottom, left, right to keep track of the spiral path.
# # At each step, traverse right, down, left, then up while shrinking the boundaries.
# # stop when the boundaries cross each other.
# # TC = O(mn), SC= O(1)

# class Solution:
#     def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
#         m = len(matrix)
#         n = len(matrix[0])
#         top, bottom, left, right = 0, m - 1, 0, n - 1
#         result = []
#         while top <= bottom and left <= right:
#             for i in range(left, right + 1):
#                 result.append(matrix[top][i])
#             top += 1
#             for i in range(top, bottom + 1):
#                 result.append(matrix[i][right])
#             right -= 1
#             if top <= bottom:
#                 for i in range(right, left - 1, -1):
#                     result.append(matrix[bottom][i])
#                 bottom -= 1
#             if left <= right:
#                 for i in range(bottom, top - 1, -1):
#                     result.append(matrix[i][left])
#                 left += 1
#         return result

# Recursive
# Define recursive bounds (top, bottom, left, right) to extract rows and columns in spiral.
# At each level, go right - down - left - up and then shrink the bounds.
# Recursively repeat until bounds overlap or cross.
# TC = O(mn), SC = O(depth) recursion stack — in worst case O(m + n)
class Solution:
    def spiralOrder(self, matrix):
        self.result = []
        m, n = len(matrix), len(matrix[0])
        self.helper(matrix, 0, 0, m - 1, n - 1)
        return self.result

    def helper(self, matrix, top, left, bottom, right):
        if top > bottom or left > right:
            return
        for i in range(left, right + 1):
            self.result.append(matrix[top][i])
        top += 1
        for i in range(top, bottom + 1):
            self.result.append(matrix[i][right])
        right -= 1
        if top <= bottom:
            for i in range(right, left - 1, -1):
                self.result.append(matrix[bottom][i])
            bottom -= 1
        if left <= right:
            for i in range(bottom, top - 1, -1):
                self.result.append(matrix[i][left])
            left += 1
        self.helper(matrix, top, left, bottom, right)
