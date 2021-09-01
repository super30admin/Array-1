#Time complexity - O(MxN)
#Space complexity - O(1)
#Did this run in leetcode - yes

class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        if len(mat) == 0 or len(mat[0]) == 0:
            return []

        rows, cols = len(mat), len(mat[0])
        row, col = 0, 0
        result = []

        for i in range(rows * cols):
            result.append(mat[row][col])
            if (row + col) % 2 == 0:
                if col == (cols - 1):
                    row += 1
                elif row == 0:
                    col += 1
                else:
                    row -= 1
                    col += 1
            else:
                if row == (rows - 1):
                    col += 1
                elif col == 0:
                    row += 1
                else:
                    row += 1
                    col -= 1
       
        return result
                