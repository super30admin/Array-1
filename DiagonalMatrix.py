#498. Diagonal Traverse
#Tc->O(mXN)
#Sc: -.O(n)


class Solution:
    def findDiagonalOrder(self, matrix: List[List[int]]) -> List[int]:
        if(matrix == None or len(matrix) == 0 or len(matrix[0])==0 ):
            return []
        
        m = len(matrix)
        n = len(matrix[0])
        result = []
        i =0
        r = 0 #rows
        c = 0 #columns
        dir = 1 #Up direction, -1 for down
        
        
        while(i<m*n):
            result.append(matrix[r][c])
            
            if(dir==1):
                if(c==n-1):
                    dir = -1
                    r+=1
                
                elif(r==0):
                    dir = -1
                    c+= 1
                else:
                    r-=1
                    c+=1
            else:
                if(r==m-1):
                    dir = 1
                    c+=1
                elif(c==0):
                    dir = 1
                    r+=1
                else:
                    r+=1
                    c-=1
            i+=1
            
        return result
            
        
       