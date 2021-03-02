# Time Complexity: O(m*n)
# Space Complexity: O(1)

class Solution:
    def findDiagonalOrder(self, matrix: List[List[int]]) -> List[int]:
        r = 0
        c = 0
        i = 0
        dir = 1
        if matrix == None or len(matrix) == 0:
            return
        m = len(matrix)
        n = len(matrix[0])
        res = [0] * (m * n)
        while i < m * n:
            res[i] = matrix[r][c]
            if dir == 1:
                if c == n - 1:
                    r += 1
                    dir = -1
                elif r == 0:
                    c += 1
                    dir = -1
                else:
                    r -= 1
                    c += 1
            else:
                if r == m - 1:
                    c += 1
                    dir = 1
                elif c == 0:
                    r += 1
                    dir = 1
                else:
                    r += 1
                    c -= 1
            i += 1
        return res
