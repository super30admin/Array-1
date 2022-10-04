#Time Complexity : O(mn)
#Space Complexity : O(1)
#Did this code successfully run on Leetcode : Yes

class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        def addDiagonal(start_row, start_col, end_row, end_col, inc):
            row, col = start_row, start_col
            
            while (row, col) != (end_row, end_col):
                res.append(mat[row][col])
                row -= inc
                col += inc
            
            res.append(mat[row][col])
        
        
        M, N = len(mat), len(mat[0])
        res = []
        go_top_right = True
        right = left = top = bottom = 0
        
        while len(res) < N * M:
            if go_top_right:
                addDiagonal(bottom, left, top, right, 1)
            else:
                addDiagonal(top, right, bottom, left, -1)
            
            if right + 1 < N:
                right += 1
            else:
                top += 1
            if bottom + 1 < M:
                bottom += 1
            else:
                left += 1
            
            go_top_right = not go_top_right
        
        return res