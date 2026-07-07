# https://leetcode.com/problems/diagonal-traverse/description/

class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:

        m = len(mat)
        n = len(mat[0])

        re = [0] * m*n

        r, c = 0, 0
        dir = True

        for i in range(m*n):
            re[i] = mat[r][c]

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

        return re