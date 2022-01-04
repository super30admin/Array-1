# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


from typing import List


class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:

        direction = 'R'  # keeping track of the direction in which we are proceeding

        left = 0
        top = 0

        right = len(matrix[0]) - 1
        bottom = len(matrix) - 1

        result = []

        # checking if the spiral is completed

        while (right >= left) and (bottom >= top):

            # while moving in the right direction update the top key
            if direction == 'R':
                for i in range(left, right + 1):
                    result.append(matrix[top][i])

                top = top + 1
                direction = 'D'

            # while moving in the down direction update the right key
            elif direction == 'D':
                for i in range(top, bottom + 1):
                    result.append(matrix[i][right])

                right = right - 1
                direction = 'L'

            # for left direction update bottom_key
            elif direction == 'L':
                for i in range(right, left - 1, -1):
                    result.append(matrix[bottom][i])

                bottom = bottom - 1
                direction = 'U'

            # for up direction update left_key
            else:
                for i in range(bottom, top - 1, -1):
                    result.append(matrix[i][left])

                left = left + 1
                direction = 'R'

        return result