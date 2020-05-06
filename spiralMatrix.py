# Time Complexity: O(N) where N is number of elements in the input array
# Space Complexity: O(N)
# Did this code successfully run on Leetcode : Yes
# Three line explanation of solution in plain english: For the spiral, four pointers are defined.
# The traversal is done from pointer to pointer
class Solution:
    def spiralOrder(self, matrix):
        result_array = []
        # edge case
        if not matrix or len(matrix) == 0:
            return []
        # left, right, top and bottom pointers
        left = 0
        right = len(matrix[0]) - 1
        top = 0
        bottom = len(matrix) - 1

        while left <= right and top <= bottom:
            # top
            for i in range(left, right, 1):
                result_array.append(matrix[top][i])
            top += 1
            # right
            for i in range(top, bottom, 1):
                result_array.append(matrix[i][right])
            right -= 1
            # bottom
            if top <= bottom:
                for i in range(right, left, 1):
                    result_array.append(matrix[[bottom][i]])
            bottom -= 1
            # left
            if left <= right:
                for i in range(bottom, top, 1):
                    result_array.append(matrix[[i][left]])
            left += 1
        return result_array
