from typing import List
""" Time complexity is O(m*n) as we traverse the matrix once
    Space complexity is O(1) as apart from the array which is to be returned, we didn't us any extra space
"""
class Solution:
    def findDiagonalOrder(mat: List[List[int]]) -> List[int]:
        if len(mat) == 0:
            return []

        m = len(mat)
        n = len(mat[0])
        index = row = col = 0
        direction = 1

        result = [0 for _ in range(0, m * n)]

        while index < m * n:
            result[index] = mat[row][col]
            index += 1
            if direction == 1:
                if col == n - 1:
                    direction = -1
                    row += 1
                elif row == 0:
                    direction = -1
                    col += 1
                else:
                    row -= 1
                    col += 1
            else:
                if row == m - 1:
                    direction = 1
                    col += 1
                elif col == 0:
                    direction = 1
                    row += 1
                else:
                    row += 1
                    col -= 1
        return result

    findDiagonalOrder([[1,2,3],[4,5,6],[7,8,9]])
