#Time complexity: O(m * n)
#Space complexity: O(1)

from typing import List

class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        if mat is None or len(mat) == 0:
            return []
        
        m, n = len(mat), len(mat[0])
        result = [0] * (m * n)
        index = 0
        r, c = 0, 0
        direction = 1  # 1 is upward direction & -1 is downward direction

        while index < m * n:
            result[index] = mat[r][c]
            index += 1
            if direction == 1:
                if c == n - 1:
                    direction = -1
                    r += 1
                elif r == 0:
                    direction = -1
                    c += 1
                else:
                    r -= 1
                    c += 1
            else:
                if r == m - 1:
                    direction = 1
                    c += 1
                elif c == 0:
                    direction = 1
                    r += 1
                else:
                    r += 1
                    c -= 1
        return result
