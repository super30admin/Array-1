# The time complexity - O(m * n) because we iterate over the matrix once.
# The space complexity - O(1) excluding the output array.

from typing import List

class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        rows, cols = len(mat), len(mat[0])
        result = [0] * (rows * cols)

        going_up = True
        row, col = 0, 0
        for i in range(rows * cols):
            result[i] = mat[row][col]

            # If going up, move diagonally up and right
            if going_up:
                if row == 0 and col != cols - 1:
                    # If at top row, move right
                    col += 1
                    going_up = False
                elif col == cols - 1:
                    # If at right column, move down
                    row += 1
                    going_up = False
                else:
                    # Move diagonally up and right
                    row -= 1
                    col += 1
            else:
                # If going down, move diagonally down and left
                if col == 0 and row != rows - 1:
                    # If at left column, move down
                    row += 1
                    going_up = True
                elif row == rows - 1:
                    # If at bottom row, move right
                    col += 1
                    going_up = True
                else:
                    # Move diagonally down and left
                    row += 1
                    col -= 1
        return result
