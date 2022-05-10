#Time complexity: O(m*n)
#Space complexity: O(1)
class Solution:
    def findDiagonalOrder(self, mat):
        res=[]
        i,j,direction,x=0,0,1,0
        m,n=len(mat),len(mat[0])
        for x in range(m*n):
            res.append(mat[i][j])
            if direction == 1:
                if j==n-1:
                    direction=-1
                    i+=1
                elif i==0:
                    direction=-1
                    j+=1
                else:
                    i-=1
                    j+=1
            else:
                if i==m-1:
                    direction=1
                    j+=1
                elif j==0:
                    direction=1
                    i+=1
                else:
                    j-=1
                    i+=1
        return res
        