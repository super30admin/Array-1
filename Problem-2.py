# 498. Diagonal Traverse
# https://leetcode.com/problems/diagonal-traverse/

# Time complexiety: O(nm) 
# Space complexiety: O(1)

class Solution:
    def findDiagonalOrder(self, mat):
        direction = 0 # 0 - up, 1 - down
        res = []
        n = len(mat)
        m = len(mat[0])

        row = 0
        col = 0

        while len(res) < n*m:
            res.append(mat[row][col])
            if direction == 0:
                if row == 0:
                    if col == m-1:
                        row += 1
                        direction = 1
                    else:
                        col += 1
                        direction = 1
                elif col == m-1:
                    row += 1
                    direction = 1
                else:
                    row -= 1
                    col += 1
            else:
                if col == 0:
                    if row == n-1:
                        col += 1
                        direction = 0
                    else:
                        row += 1
                        direction = 0
                elif row == n-1:
                    col += 1
                    direction = 0
                else:
                    col -= 1
                    row += 1
        return res

obj = Solution()
obj.findDiagonalOrder([[1,2,3],[4,5,6],[7,8,9]])
obj.findDiagonalOrder([[1,2],[3,4]])
