#time comp-O(m*n)
#space-O(1)
class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        ans=[]
        dir=1
        m=len(mat)
        n=len(mat[0])
        ans=[0]*(m*n)
        i=0
        r=0
        c=0
        while i<m*n:
                ans[i]=mat[r][c]
                #if we are traversing upwards 
                if dir==1:
                    if c==n-1:
                        r=r+1
                        dir=-1
                    elif r==0:
                        c=c+1
                        dir=-1
                    else:
                        c=c+1
                        r=r-1
                #if we are traversing downwards    
                else:
                    if r==m-1:
                        c=c+1
                        dir=1
                    elif c==0:
                        r=r+1
                        dir=1
                    else:
                        c=c-1
                        r=r+1
                i=i+1
                
        return ans
                    
                
