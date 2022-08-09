# Time Complexity : O(m*n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No
from typing import List


class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        m = len(mat)
        n = len(mat[0])
        _sol = []
        _idx = 0
        _dir = 1
        col = 0
        row = 0
        while _idx < (n * m):
            _sol.append(mat[row][col])
            _idx += 1
            if _dir == 1:
                if col == n - 1:
                    _dir = -1
                    row += 1
                elif row == 0:
                    col += 1
                    _dir = -1
                else:
                    row -= 1
                    col += 1
            else:
                if row == m - 1:
                    _dir = 1
                    col += 1
                elif col == 0:
                    row += 1
                    _dir = 1
                else:
                    col -= 1
                    row += 1

        return _sol


if __name__ == '__main__':
    # _mat = [[1, 2, 3], [4, 5, 6], [7, 8, 9]]
    _mat = [[2, 3]]
    print(Solution().findDiagonalOrder(_mat))
