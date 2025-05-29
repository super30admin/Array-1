# Time Complexity: O(M * N), M * N is the size of 2D matrix
# Space Complexity: O(1)
# Did this code successfully run on Leetcode: Yes

from typing import List

class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        rows = len(mat)
        columns = len(mat[0])
        output = [None] * (rows * columns)
        row, col, up = 0, 0, True

        for index in range(len(output)):
            output[index] = mat[row][col]

            # if going up, check if top and right are breached
            if up:
                if col == columns - 1:      # right is breached
                    row += 1
                    up = False
                elif row == 0:              # top is breached
                    col += 1
                    up = False
                else:                       # no breach
                    row -= 1
                    col += 1

            # if going down, check if bottom and left are breached
            else:
                if row == rows - 1:         # bottom is breached
                    col += 1
                    up = True
                elif col == 0:              # left is breached
                    row += 1
                    up = True
                else:                       # no breach
                    row += 1
                    col -= 1

        
        return output


