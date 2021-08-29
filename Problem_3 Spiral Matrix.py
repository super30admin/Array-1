# // Time Complexity : O(mn)
# // Space Complexity : O(1)
# // Did this code successfully run on Leetcode : Yes
# // Any problem you faced while coding this : No
#
#
# // Your code here along with comments explaining your approach

class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        if not matrix or len(matrix) == 0:
            return []
        top = 0
        bottom = len(matrix) - 1
        right = len(matrix[0]) - 1
        left = 0
        result = []
        while top <= bottom and left <= right:
            # top row
            for i in range(left, right + 1):
                result.append(matrix[top][i])
            top += 1

            # right column
            for i in range(top, bottom + 1):
                result.append(matrix[i][right])
            right -= 1

            # bottom
            if top > bottom or left > right:
                break
            for i in range(right, left - 1, -1):
                result.append(matrix[bottom][i])
            bottom -= 1

            # left
            for i in range(bottom, top - 1, -1):
                result.append(matrix[i][left])
            left += 1

        return result
