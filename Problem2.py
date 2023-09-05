'''
1. 
'''

class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:

        i = 0
        j = 0
        m = len(mat)
        n = len(mat[0])
        upflag = True
        res = []

        for _ in range(m*n):
            res.append(mat[i][j])
            if upflag:
                if j==n-1: #Last column
                    upflag = False
                    i+=1
                elif i==0: #First row
                    upflag = False
                    j+=1
                else: #Normal conditions
                    i-=1
                    j+=1
            else:
                if i==m-1:
                    upflag = True
                    j+=1
                elif j==0:
                    upflag = True
                    i+=1
                else:
                    i+=1
                    j-=1
        return res