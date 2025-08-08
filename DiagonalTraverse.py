class Solution:
    def findDiagonalOrder(self, mat: list[list[int]]) -> list[int]:
        
        m = len(mat)
        n = len(mat[0])
        result = [0 for i in range(m*n)]

        index = 0 # index at result array
        r = 0 # to iterate through rows in matrix
        c = 0 # to iterate through columns in matrix
        flag = 1 # upward traverse

        while index < m*n:
            result[index] = mat[r][c]
            index += 1
            if flag == 1:
                if c == n-1:
                    r += 1
                    flag = 0
                elif r == 0:
                    c += 1
                    flag = 0
                else:
                    c += 1
                    r -= 1
            else:
                if r == m-1:
                    c += 1
                    flag = 1
                elif c == 0:
                    r += 1
                    flag = 1
                else:
                    r += 1
                    c -= 1
        return result