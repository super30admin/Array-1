"""
TC:O(M *N)
Sc:O(1)
"""
class Solution:
    
    def findDiagonalOrder(self, matrix: List[List[int]]) -> List[int]:
        
        if not matrix or not matrix[0]:
            return []
        
        row_max, col_max = len(matrix), len(matrix[0])
        
        row, col = 0, 0
        
        direction = 1

        res = []

        while row < row_max and col < col_max:

            res.append(matrix[row][col])

            new_row = row + (-1 if direction == 1 else 1)
            new_column = col + (1 if direction == 1 else -1)

            if new_row < 0 or new_row == row_max or new_column < 0 or new_column == col_max:
                
                if direction == 1:
                    row += 1 if col == col_max - 1 else 0
                    col +=  1 if col < col_max - 1 else 0
                else:
                    col += (row == row_max - 1)
                    row += (row < row_max - 1)
                    
                direction = 1 - direction        
            else:
                row = new_row
                col = new_column
                        
        return res   