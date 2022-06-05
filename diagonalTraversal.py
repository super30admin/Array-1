class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        m = len(mat)
        n = len(mat[0])
        result = []
        dir = 1
        col=0
        row=0
        
        while(len(result) < (m*n)):
            
            if dir == 1:
                result.append(mat[row][col])
                if(col==(n-1)):
                    row += 1
                    dir = -1
                    
                elif row==0:
                    col+=1
                    dir = -1
                else:
                     row = row-1
                     col = col+1      
            else:
                result.append(mat[row][col])
                if(row==(m-1)):
                    col+=1
                    dir = 1
                    
                elif col==0:
                    row+=1
                    dir = 1
                else:
                     row = row+1
                     col = col-1  
        return result
