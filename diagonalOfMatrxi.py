"""
498. Diagonal Traverse

Time = O(mn); m = number of rows, n = number of cols
space = O(mn); m = number of rows, n = number of cols
Successfully excecuted on leetcode

Approach - 
1. Use the end of previous diagonal to find out head of the next diagonal
2. For even diagonal; Head would be the node to the right of the tail of the previous diagonal. If the tail in the last column the head would be the node below the tail.
3. For odd diagonal; Head would be the node directly below the tail of the previous diagonal. If the tail in the last row the head would be the node right next to the tail.
"""
class Diagonal:
    def findDiagonalOrder(self, matrix: List[List[int]]) -> List[int]:
        if len(matrix) == 0:
            return []

        row = 0
        col = 0
        m = len(matrix)
        n = len(matrix[0])

        res = []

        i = 0
        while i < m * n:
            res.append(matrix[row][col])
            if (row + col) % 2 == 0: # even diagonal is moving down 
                if col == n - 1: # for last coloumn,point node to next row
                    row += 1
                elif row == 0: # for first row, point node to next coloumn
                    col += 1
                else:
                    row -= 1 # else, decrease row index, increase col imdex
                    col += 1
            else:  # Odd diagonal moving upward
                if row == m - 1: # for last row, point node to next col
                    col += 1
                elif col == 0: # for first col, point node to next row
                    row += 1
                else:
                    row += 1
                    col -= 1

            i += 1

        return res