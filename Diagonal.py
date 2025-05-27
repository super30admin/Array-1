# Time Complexity: O(m*n)
# Spcae complexity: O(m*n)

class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        if not mat or not mat[0]:
            return []
        m = len(mat) # Row
        n = len(mat[0]) # Col
        arr = [None] * (m*n)
        idx = 0
        direction = 1 # 1 = up-right, 0 = down-left
        row = 0
        col = 0
        while (idx<(m*n)):
            arr[idx] = mat[row][col]
            if direction == 1:
                if col == n-1:
                    row+=1
                    direction = 0
                elif row == 0:
                    col += 1
                    direction = 0
                else:
                    row -= 1
                    col += 1
            else:
                if row == m-1:
                    col+=1
                    direction = 1
                elif col == 0:
                    row += 1
                    direction = 1
                else:
                    row += 1
                    col -= 1
            idx += 1
        return arr
            