# Time Complexity : O(M x N), 
# Space Complexity : O(1),
# Did this code successfully run on Leetcode : yes
# Any problem you faced while coding this : no

class Solution(object):
    def findDiagonalOrder(self, matrix):
        
        if len(matrix) == 0 or len(matrix[0]) == 0:
            return []

        rows, cols = len(matrix), len(matrix[0])
        row, col = 0, 0
        result = []

        for i in range(rows * cols):
            result.append(matrix[row][col])
            if (row + col) % 2 == 0:
                if col == (cols - 1):
                    row += 1
                elif row == 0:
                    col += 1
                else:
                    row -= 1
                    col += 1
            else:
                if row == (rows - 1):
                    col += 1
                elif col == 0:
                    row += 1
                else:
                    row += 1
                    col -= 1
        
        return result