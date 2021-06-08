class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        '''
        Time Complexity: O(N)
        Space Compleixty: O(N)
        '''
        
        # assert
        if len(matrix) == 0: return []
        
        res = []
        
        row_index = 0
        col_index = 0
        
        row = len(matrix) - 1
        col = len(matrix[0]) - 1
        
        # essentially here you create four if statements.  Once for each direction
        while (
            row_index <= row
            and col_index <= col
        ):  
            # top row
            for i in range(col_index, col + 1):
                res.append(matrix[row_index][i])
            row_index += 1
            
            # right col
            for i in range(row_index, row + 1):
                res.append(matrix[i][col])
            col -= 1
            
            # bottom row, you need the if statements for bottom and left col
            # BECAUSE if you don't have this then it will go out of bounds
            # you should keep this in mind for array type problems
            if row_index <= row:
                for i in range(col, col_index-1, -1):
                    res.append(matrix[row][i])
                row -= 1
            
            # left col
            if col_index <= col:
                for i in range(row, row_index-1, -1):
                    res.append(matrix[i][col_index])
                col_index += 1
        return res
        
        
        