"""
Handling positions by directions and row/col varibales
TC - O(mxn)
SC - O(mxn)
"""


class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        r, c = 0, 0
        m = len(mat)
        n = len(mat[0])
        ans = [None] * m * n
        d = 1
        for i in range(m * n):
            ans[i] = mat[r][c]
            if d == 1:
                if c == n - 1:
                    d = -1
                    r += 1
                elif r == 0:
                    c += 1
                    d = -1
                else:
                    c += 1
                    r -= 1
            else:
                if r == m - 1:
                    d = 1
                    c += 1
                elif c == 0:
                    r += 1
                    d = 1
                else:
                    r += 1
                    c -= 1

        return ans

