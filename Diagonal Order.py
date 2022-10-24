class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        m =len(mat)
        n = len(mat[0])
        UP = 0
        DOWN = 1
        res = []
        row, col = 0,0
        resIndex = 0
        direction = UP
        
        while len(res) != m*n:
            res.append(mat[row][col])
            if direction == UP:
                
                if col == n-1:
                    row = row+1
                    direction = DOWN
                    
                    
                elif row == 0:
                    col = col+1
                    direction = DOWN
                    
                else:
                    row = row-1
                    col = col+1
            else:
                if row == m-1:
                    col = col+1
                    direction = UP
                    
                elif col == 0:
                    row = row+1
                    direction = UP
                else:
                    row = row+1
                    col = col-1
        return res
                
        