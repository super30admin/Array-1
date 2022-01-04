# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : Yes

from typing import List


class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:

        direction = 1  # to keep a track of which direction we are heading towards to
        row = 0
        col = 0

        result = []

        # count the numbers printed
        count = 0

        # The dimensions of the matrix
        N = len(mat)
        M = len(mat[0])

        while count < N * M:

            # if the direction is going towards downward of the matrix

            if (col == M) or row == N:
                if direction == 1:
                    row = row + 2
                    col = col - 1
                    direction = -1
                else:
                    col = col + 2
                    row = row - 1
                    direction = 1

            # if the direction is going towards upward of the matrix

            elif (col == -1) or (row == -1):
                if direction == 1:
                    row = row + 1
                    if col == M:
                        col = col - 1
                        row = row + 1
                    direction = -1

                else:
                    col = col + 1
                    if row == N:
                        row = row - 1
                        col = col + 1
                    direction = 1

            result.append(mat[row][col])

            count += 1

            # printing values in a particular direction

            if direction == 1:
                col = col + 1
                row = row - 1

            else:
                col = col - 1
                row = row + 1

        return result