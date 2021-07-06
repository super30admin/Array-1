class Solution:
    def findDiagonalOrder(self, mat) :

        if mat == None or len(mat) == 0:
            return 0

        direction = 1
        m = len(mat)
        n = len(mat[0])
        row = 0
        col = 0
        i = 0
        t = m * n
        result = [0] * t

        while i <= t:
            result[i] = mat[row][col]
            if direction == 1:
                if col == n - 1:
                    row = row + 1
                    direction = -1
                elif row == 0:
                    col = col + 1
                    direction = -1
                else:
                    row = row - 1
                    col = col + 1
            else:
                if row == m - 1:
                    col = col + 1
                    direction = 1
                elif col == 0:
                    row = row + 1
                    direction = 1
                else:
                    row = row + 1
                    col = col - 1

            i = i + 1

        return result


sol=Solution()
mat = [[1,2,3,4],[5,6,7,8],[9,10,11,12]]
print(sol.findDiagonalOrder(mat))