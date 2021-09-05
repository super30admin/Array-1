class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        
        m = len(mat)  #-- rows
        n = len(mat[0]) # -- columns
        
        if(m == 1): #just one row or 1 column
            return mat[0]
        if(n==1):
            return (mat[i][0] for i in range(m))
        
        result = []
        up = 1
        i = 0
        j = 0
        
        while i < m and j < n:
                
                #going up
                if up == 1:
                    result.append(mat[i][j])
                    if j == n-1:
                        i += 1
                        up = 0
                        continue
                    elif i == 0:
                        j +=1
                        up = 0
                        continue
                    else:
                        i -=1
                        j +=1
                        continue
                
                #going down
                if up == 0:
                    result.append(mat[i][j])
                    if i == m-1:
                        j += 1
                        up = 1
                        continue
                    elif j == 0:
                        i +=1
                        up = 1
                        continue
                    else:
                        i +=1
                        j -=1
                        continue
                
                    
        return result   
                     
                    
