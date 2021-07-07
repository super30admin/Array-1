class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        if mat == [] or len(mat) == 0:
            return [0]
        
        dire = 1
        
        m = len(mat)
        n = len(mat[0])
        
        row = col = i = 0
        
        result = [m*n]
        
        while (i<m*n):
            result[i] = mat[row][col] # updating result with matrix values
            if dire ==1:
                if col == n-1:
                    row+=1
                    dire = -1
                    
                elif row == 0:
                    col+=1
                    dire = -1
                else:
                    row-=1
                    col+=1
            else:
                if row == m-1:
                    col +=1
                    dire = 1
                elif col == 0:
                    row += 1
                    dire = 1
                else:
                    row += 1
                    col -= 1
            i += 1
                    
        return result
