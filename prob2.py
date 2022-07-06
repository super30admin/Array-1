class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        m = len(mat)
        n = len(mat[0])
        res = [0] * (m * n)
        r = 0
        c = 0
        dir = 1
        i = 0
        while(i<m*n):
            res[i]=mat[r][c]
            if(dir == 1):
                if(c==(n-1)):
                    dir = -1
                    r += 1
                elif(r==0):
                    dir = -1
                    c +=1  
                else:
                    r -= 1
                    c +=1
            else:
                if(r==(m-1)):
                    dir = 1
                    c+=1
                elif(c==0):
                    dir = 1
                    r+=1
                
                else:
                    r+=1
                    c-= 1
            i += 1
            
        return res
        
        
        