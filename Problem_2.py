"""
Problem : 2

Time Complexity : O(m*n)
Space Complexity : O(m*n)

Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : No


going in the diagonal direction until we hit the columns out of bound
then going down until we hit the row out of bound
repeating the same procedure until we reach the end of the matrix
"""

# Diagonal Traverse

class Solution(object):
    def findDiagonalOrder(self, mat):
        m=len(mat)
        n=len(mat[0])

        res=[0 for _ in range(m*n)]
        i,j,idx=0,0,0
        dir=True
        
        while idx<len(res):
            res[idx]=mat[i][j]
            idx+=1
            if dir==True:
                # up
                if i==0 and j!=n-1:
                    j+=1
                    dir=False
                elif j==n-1:
                    i+=1
                    dir=False
                else:
                    i-=1
                    j+=1



            else:
                # down
                if j==0 and i!=m-1:
                    i+=1
                    dir=True
                elif i==m-1:
                    j+=1
                    dir=True
                else:
                    j-=1
                    i+=1
        return res
