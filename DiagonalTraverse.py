# Time Complexity : O(m*n) where n*m are the rows and colums of the matrix
# Space Complexity : O(m*n)

from typing import List

class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        # Edge case
        if not mat:
            return []
        
        m, n = len(mat), len(mat[0])
        result = [0] * (m * n)
        
        # Initialize variables for iterating over the matrix
        row, col, direction = 0, 0, 1
        
        # Traverse the matrix diagonally
        for i in range(m * n):
            result[i] = mat[row][col]
            if direction == 1:
                if col == n - 1:
                    row += 1
                    direction = -1
                elif row == 0:
                    col += 1
                    direction = -1
                else:
                    row -= 1
                    col += 1
            else:
                if row == m - 1:
                    col += 1
                    direction = 1
                elif col == 0:
                    row += 1
                    direction = 1
                else:
                    row += 1
                    col -= 1
        
        return result
