class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        
        
        m = len(mat)
        n = len(mat[0])
        result = []
        direction = 1 # 1 is going upward direction and -1is going downward direction
        index = 0
        row,col = 0,0
        
        while index < (m*n): # Time Complexity is (m x n) where m is row and n is the col of matrix
            
            result.append(mat[row][col])
            index += 1
            
            if direction == 1: # Upward direction
                
                if col == n - 1: # If the index is at the last column then change the direction to downward and increase the row
                    direction = -1
                    row += 1
                elif row == 0: # If the index is at the First row then change the direction to downward and increase the col
                    direction = -1
                    col += 1
                else:
                    row -= 1
                    col += 1
            else: # Downward direction
                if row == m - 1: # If the index is at the last row then change the direction to upward and increase the col
                    direction = 1
                    col += 1
                elif col == 0: # If the index is at the First col then change the direction to upward and increase the row
                    direction = 1
                    row += 1
                else:
                    row += 1
                    col -= 1
        return result
    
    # Time Complexity is O(m x n) where m is row and n is the col of matrix
    # Space Complexity is O(1) because an array is expected as a result