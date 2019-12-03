# Running on Leetcode: Yes
# Runtime complexity:   O(n)
# Memory complexity:  O(mn)

'''
On Leetcode, it shows as below but I am not satisfied with the solution as it looks very clumsy. Is there any way to
improvise it?? Thanks

# Runtime: 28 ms, faster than 91.37% of Python3 online submissions for Spiral Matrix.
# Memory Usage: 12.8 MB, less than 100.00% of Python3 online submissions for Spiral Matrix.
'''

class Solution:
    def spiralOrder(self, matrix) :
        if not matrix:
            return []
        
        rows = len(matrix)
        cols = len(matrix[0])
        result = []
        
        row_top = -1
        row_bottom = rows
        col_left = -1
        col_right = cols
        
        row, col = 0, 0
        while((row_top != row_bottom) and (col_left != col_right)):
            while((col <= cols-1) and (col < col_right)):
                if len(result)==rows*cols:
                    break
                result.append(matrix[row][col])
                col += 1
            row_top += 1
            col -= 1
            row += 1
            while((row <= rows-1) and (row < row_bottom)):
                if len(result)==rows*cols:
                    break
                result.append(matrix[row][col])
                row += 1
            col_right -= 1
            col -= 1
            row -= 1
            while((col >= 0) and (col > col_left)):
                if len(result)==rows*cols:
                    break
                result.append(matrix[row][col])
                col -= 1
            row_bottom -= 1
            col += 1
            row -= 1
            while((row >= 0) and (row > row_top)):
                if len(result)==rows*cols:
                    break
                result.append(matrix[row][col])
                row -= 1
            col_left += 1
            col += 1
            row += 1
            if row_bottom < 0 or col_right < 0:
                break
        return result
