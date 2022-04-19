# // Time Complexity : O(m*n) m=>rows n=>cols
# // Space Complexity : O(1)
# // Did this code successfully run on Leetcode : yes
class Solution(object):
    def spiralOrder(self, matrix):
        """
        :type matrix: List[List[int]]
        :rtype: List[int]
        """
        result = []

        rows = len(matrix)
        cols = len(matrix[0])

        left = 0
        down = rows - 1
        top = 0
        right = cols - 1

        while(left <= right and top <= down):
            # left to right
            if top <= down:
                for j in range(left, right+1):
                    result.append(matrix[top][j])
                top = top + 1

            # top to bottom
            if left <= right:
                for j in range(top, down+1):
                    result.append(matrix[j][right])
                right = right - 1

            # right to left
            if top <= down:
                for j in range(right, left - 1, -1):
                    result.append(matrix[down][j])
                down = down - 1

            if left <= right:
                for j in range(down, top - 1, -1):
                    result.append(matrix[j][left])
                left = left + 1

        return result
