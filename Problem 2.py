class Solution:
    def findDiagonalOrder(self, mat):
        m = len(mat)
        n = len(mat[0])
        idx = 0
        i = 0
        j = 0
        dir = 1
        output = []

        while idx < m * n:
            output.append(mat[i][j])
            idx += 1
            if (dir == 1):
                if j == n - 1:
                    i += 1
                    dir = -1

                elif i == 0:
                    dir = -1
                    j += 1

                else:
                    i -= 1
                    j += 1

            else:
                if i == m - 1:
                    j += 1
                    dir = 1

                elif j == 0:
                    dir = 1
                    i += 1

                else:
                    j -= 1
                    i += 1
        return output

#TC:O(m*n)
#SC:O(m*n)