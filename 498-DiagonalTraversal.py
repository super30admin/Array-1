class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        
        if not mat or not mat[0]:
            return []
        
        # matrix dimensions
        N = len(mat)
        M = len(mat[0])
        
        # row, col
        row = 0
        col = 0
        
        # direction of traversal
        direction = 1
        
        result =[]
        
        while row < N and col<M:
            
            result.append(mat[row][col])
            
            next_row = row + (-1 if direction == 1 else 1)
            next_col = col + (1 if direction == 1 else -1)
            
            if next_row < 0 or next_row == N or next_col < 0 or next_col == M:
                if direction:
                    row +=(col == M-1)
                    col +=(col < M-1)
                else:
                    col += (row == N-1)
                    row += (row< N-1)
                # flip the direction
                direction = 1-direction
            else:
                row = next_row
                col = next_col
                
        return result
        
        # Space: O(1)
        # Time: O(N.M)