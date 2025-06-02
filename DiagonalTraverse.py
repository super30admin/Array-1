# Time Complexity: O(m*n) where m is the number of rows and n is the number of columns
# Space Complexity: O(1)

# Approach:
# 1. We maintain a boolean variable, dir to keep track of which direction we are in.
# 2. If we are going in an upward direction, we need to traverse to row-1, col+1
# 3. If we are going in a downward direction, we need to traverse row+1, col-1
# 4. We take care of edge cases where we are at the 0th row, or 0th column, and last row and last column.

from typing import List
class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        m, n = len(mat), len(mat[0])
        res = [0] * (m*n)
        

        dir = True

        r, c = 0, 0
        for i in range(m*n):
            res[i] = mat[r][c]
            if dir:
                if r == 0 and c != n-1:
                    c += 1
                    dir = False
                elif c == n-1:
                    r += 1
                    dir = False
                else:
                    r -= 1
                    c += 1
            else:
                if c == 0 and r != m-1:
                    r += 1
                    dir = True
                elif r == m-1:
                    c += 1
                    dir = True
                else:
                    r += 1
                    c -= 1
        return res