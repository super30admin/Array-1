""""// Time Complexity : O(m*n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :
"""
class Solution:
    def spiralOrder(self, matrix):
        m = len(matrix)
        n = len(matrix[0])
        top = 0
        bottom = m - 1
        left = 0
        right = n - 1
        result = []

        while (left <= right and top <= bottom):
            for j in range(left, right + 1):
                result.append(matrix[top][j])
            top += 1

            if left <= right:
                for i in range(top, bottom + 1):
                    result.append(matrix[i][right])
            right -= 1

            if top <= bottom:
                for j in range(right, left - 1, -1):
                    result.append(matrix[bottom][j])
            bottom -= 1

            if left <= right:
                for i in range(bottom, top - 1, -1):
                    result.append(matrix[i][left])
            left += 1
        return result



# By Recursion-
# class Solution:
#     def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
#         result = []
#         if len(matrix) == 0:
#             return result
#         self.helper(matrix, 0, len(matrix[0]) - 1, 0, len(matrix) - 1, result)
#         return result
#
#     def helper(self, matrix, left, right, top, bottom, result):
#
#         # base
#         if left > right or top > bottom:
#             return
#         # logic
#         for j in range(left, right + 1):
#             result.append(matrix[top][j])
#         top += 1
#
#         for i in range(top, bottom + 1):
#             result.append(matrix[i][right])
#         right -= 1
#
#         if top <= bottom:
#             for j in range(right, left - 1, -1):
#                 result.append(matrix[bottom][j])
#         bottom -= 1
#
#         if left <= right:
#             for i in range(bottom, top - 1, -1):
#                 result.append(matrix[i][left])
#         left += 1
#
#         self.helper(matrix, left, right, top, bottom, result)
#
