# Time Complexity O(n)
# Space Complexity O(1)
class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        row, col = 0, 0
        m = len(mat)
        n = len(mat[0])
        ans = [0] * m*n
        index = 0
        direction = 1
        while index < m*n:
            ans[index] = mat[row][col]
            if direction == 1:
                if col == n - 1:
                    row += 1
                    direction = -1
                elif row == 0:
                    col += 1
                    direction = -1
                else:
                    row -= 1
                    col += 1
            else:
                if row == m - 1:
                    col += 1
                    direction = 1
                elif col == 0:
                    row += 1
                    direction = 1
                else:
                    row += 1
                    col -= 1
            index += 1
        return ans