"""
TC : O(m *n)
SC : O(1)
"""

class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        row = len(matrix)
        col = len(matrix[0])
        res=  []
        start_row = 0
        end_row = row - 1 
        start_col = 0
        end_col = col - 1
        
        while start_row <= end_row and start_col <= end_col :
            for i in range(start_col, end_col + 1):
                res.append(matrix[start_row][i])
            

            for i in range(start_row +  1, end_row + 1):
                res.append(matrix[i][end_col])
            
            if end_row != start_row :
                for i in range(end_col - 1, start_col - 1, -1):
                    res.append(matrix[end_row][i])
            
            
            if end_col != start_col :            
                for i in range(end_row - 1, start_row, -1):
                    res.append(matrix[i][start_col]) 
                    
            start_row += 1
            start_col += 1
            end_col -= 1
            end_row -= 1
        
        return res






