class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        m=len(mat)
        n=len(mat[0])
        res=[0 for i in range(0,m*n)]

        r=0
        c=0
        dir1=True

        for i in range(0,m*n):
            res[i]=mat[r][c]
            print(res[i])
            if dir1==True:
                if c==n-1:
                    r+=1
                    dir1=False
                elif r==0 and c<n-1:
                    c+=1
                    dir1=False
                else:
                    r-=1
                    c+=1
            else:
                if r==m-1:
                    c+=1
                    dir1=True
                elif c==0 and r<m-1:
                    r+=1
                    dir1=True
                else:
                    r+=1
                    c-=1
        return res

        