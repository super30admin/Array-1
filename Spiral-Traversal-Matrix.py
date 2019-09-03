
# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Three line explanation of solution in plain english:
# Here I have taken all the corner cases for right, left, up and down direction.
# And iterated through the matrix

class Solution(object):
    def spiralOrder(self, matrix):
        """
        :type matrix: List[List[int]]
        :rtype: List[int]
        """
        if not matrix:
            return []
        
        output = []
        direction = 1           # 1:right -1:left 2:up -2:down
        nRows = len(matrix)-1
        nCols = len(matrix[0])-1
        row, col = 0, 0
        
        while (len(output) < (nRows+1)*(nCols+1)):
            output.append(matrix[row][col])
            matrix[row][col] = ''
            if direction == 1:
                if col == nCols:
                    row += 1
                    direction = -2
                elif matrix[row][col+1] == '':
                    row += 1
                    direction = -2
                else:
                    col += 1
            elif direction == -1:
                if col == 0:
                    row -= 1
                    direction = 2
                elif matrix[row][col-1] == '':
                    row -= 1
                    direction = 2
                else:
                    col -= 1
            elif direction == 2:
                if row == 0:
                    col += 1
                    direction = 1
                elif matrix[row-1][col] == '':
                    col += 1
                    direction = 1
                else:
                    row -= 1
            elif direction == -2:
                if row == nRows:
                    col -= 1
                    direction = -1
                elif matrix[row+1][col] == '':
                    col -= 1
                    direction = -1
                else:
                    row += 1
        return output
