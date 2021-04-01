class Solution:
    def findDiagonalOrder(self, matrix: List[List[int]]) -> List[int]:
        if not matrix:
            return

        m = len(matrix)
        n = len(matrix[0])

        dir = True
        r, c = 0, 0
        ans = [0] * (m * n)
        index = 0
        while index < m * n:
            ans[index] = matrix[r][c]
            index += 1
            if dir:
                if c == n - 1:
                    dir = False
                    r += 1
                elif r == 0:
                    dir = False
                    c += 1
                else:
                    r -= 1
                    c += 1
            else:
                if r == m - 1:
                    dir = True
                    c += 1
                elif c == 0:
                    dir = True
                    r += 1
                else:
                    c -= 1
                    r += 1
        return ans