# Time Complexity: O(m*n)
# Space Complexity:O(1)
# Passed LeetCode

class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        dir = 1
        m = len(mat)
        n = len(mat[0])
        result = [0] * (m * n)
        col = row = 0

        for i in range(m * n):
            result[i] = mat[row][col]
            if dir == 1:  # upward direction
                if col == n - 1:
                    dir = 0
                    row += 1
                elif row == 0:
                    dir = 0
                    col += 1
                else:
                    col += 1
                    row -= 1

            else:  # downward direction
                if row == m - 1:
                    dir = 1
                    col += 1
                elif col == 0:
                    dir = 1
                    row += 1
                else:
                    col -= 1
                    row += 1

        return result
