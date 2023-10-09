# TC: O(n*m)
# SC: O(1)
class Solution:
    def findDiagonalOrder(self, mat):
        n = len(mat)
        m = len(mat[0])
        dir = 1 # 1 = upper -1 = lower
        res = [0]*(n*m)
        row , col = 0,0
        index = 0

        while index < n*m:
            res[index] = mat[row][col]
            index += 1
            if dir == -1:
                if row == n-1:
                    dir = 1
                    col += 1
                elif col == 0:
                    dir = 1
                    row += 1
                else:
                    row += 1
                    col -= 1
            else:
                if col == m-1:
                    dir = -1
                    row += 1
                elif row == 0:
                    dir = -1
                    col += 1
                else:
                    col += 1
                    row -= 1

        return res

