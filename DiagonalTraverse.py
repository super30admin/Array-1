# Time complexity: O(m * n) where m is the number of rows and n is the number of columns of the matrix.
# Space complexity: O(1).
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        if len(mat) == 0: return []
        result = []
        row = 0
        col = 0
        direction = 1
        m = len(mat)
        n = len(mat[0])
        for i in range(m * n):
            result.append(mat[row][col])
            if direction == 1:              # Going up.
                if col == n - 1:
                    direction = -1
                    row = row + 1
                elif row == 0:
                    direction = -1
                    col = col + 1
                else:
                    row = row - 1
                    col = col + 1
            elif direction == -1:           # Going down.
                if row == m - 1:
                    direction = 1
                    col = col + 1
                elif col == 0:
                    direction = 1
                    row = row + 1
                else:
                    row = row + 1
                    col = col - 1
        return result
        
        