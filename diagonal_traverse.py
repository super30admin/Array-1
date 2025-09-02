def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]: #Tc: O(m*n) SC: O(1)
        m=len(mat)
        n=len(mat[0])
        result=[0]*(m*n)
        r=c=0
        dir= True
        for i in range(m*n):
            result[i]=mat[r][c]
            #upward
            if dir:
                if c==n-1:
                    r+=1
                    dir=False
                elif r==0:
                    c+=1
                    dir=False
                else:
                    r-=1
                    c+=1
                
                    #downward
            else:
                if r==m-1:
                    c+=1
                    dir=True
                elif c==0:
                    r+=1
                    dir=True
                else:
                    r+=1
                    c-=1
        return result

