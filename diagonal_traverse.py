class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        '''
        Time Complexity: O(N * M)
        Space Complexity: O(1)
        '''
        # assertion
        if not mat or not mat[0]: return []
        
        # track the size of matrix
        n = len(mat)
        m = len(mat[0])
        
        row = 0
        col = 0
        
        direction = 1
        
        res = []
        
        while row < n and col < m:
            res.append(mat[row][col])
            temp_row = 0
            temp_col = 0
            
            # Set the diagonal path.  Try to draw it out first
            if direction == 1:
                temp_row = row - 1
                temp_col = col + 1
            else:
                temp_row = row + 1
                temp_col = col - 1
                
            if (
                temp_row < 0
                or temp_row == n
                or temp_col < 0
                or temp_col == m
            ):
                if direction:
                    row += (col == m - 1)
                    col += (col < m - 1)
                else:
                    col += (row == n - 1)
                    row += (row < n - 1)
                
                direction = 1 - direction
            else:
                row = temp_row
                col = temp_col
        
        return res
            
            