"""
time o(n) where n = number of elements in matrix
space o(1)
create a result array and keep adding elements based on rules ot the result array.
Rules are based on index values
if element in top row, move to right and change direction
if element in right boundary column, move down and change direction
if element in bottom row, move right and change direction
if element in left boundary row, move down and change direction
"""

from typing import List


class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        result = []
        m = len(mat)
        n = len(mat[0])
        total = m * n
        x = y = 0
        up = True
        while len(result) < total:
            print(x, y)
            result.append(mat[x][y])
            if up:
                if x == 0 and y == len(mat[0]) - 1:
                    x += 1
                    up = False
                elif x == 0 and y < len(mat[0]) - 1:
                    y += 1
                    up = False
                elif x != 0 and y == len(mat[0]) - 1:
                    x += 1
                    up = False
                else:
                    x -= 1
                    y += 1
            else:
                if x == len(mat) - 1 and y == 0:
                    y += 1
                    up = True
                elif x == len(mat) - 1 and y > 0:
                    y += 1
                    up = True
                elif x != 0 and y == 0:
                    x += 1
                    up = True
                else:
                    x += 1
                    y -= 1
        return result
