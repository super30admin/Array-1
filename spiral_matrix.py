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
        
        while (
            row_index <= row
            and col_index <= col
        ):
            for i in range(col_index, col + 1):
                res.append(matrix[row_index][i])
            row_index += 1
            
            for i in range(row_index, row + 1):
                res.append(matrix[i][col])
            col -= 1
            
            if row_index <= row:
                for i in range(col, col_index-1, -1):
                    res.append(matrix[row][i])
                row -= 1
            
            if col_index <= col:
                for i in range(row, row_index-1, -1):
                    res.append(matrix[i][col_index])
                col_index += 1
        return res
        
        
        