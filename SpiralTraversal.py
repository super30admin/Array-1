# Time Complexity - O(N) where N = m*n

# Space Complexity - O(1)

# Did this code successfully run on Leetcode : Yes

# Any problem you faced while coding this : No

# Approach
# I maintain 4 variables top, bottom, left, and right. There are 4 loops through I which I achieve traversal.
# left-right, top-bottom, right-left and bottom-top repeatedly till my base condtions are satisfied.


class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        result = []

        if matrix == None or len(matrix) == 0:
            return result

        m = len(matrix)
        n = len(matrix[0])
        top, bottom, left, right = 0, m - 1, 0, n - 1

        while (top <= bottom and left <= right):

            if top <= bottom and left <= right:
                for i in range(left, right + 1):
                    result.append(matrix[top][i])
                top += 1

            if top <= bottom and left <= right:
                for i in range(top, bottom + 1):
                    result.append(matrix[i][right])
                right -= 1

            if top <= bottom and left <= right:
                for i in range(right, left - 1, -1):
                    result.append(matrix[bottom][i])
                bottom -= 1

            if top <= bottom and left <= right:
                for i in range(bottom, top - 1, -1):
                    result.append(matrix[i][left])
                left += 1

        return result