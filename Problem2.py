'''
1. Maintain a flag that tells us the direction to traverse. Append every value encountered.
2. We start traversing up initially. If we reached top row or last column we switch the direction. Otherwise we traverse diagonally upwards.
3. Similary when traversing down, we check if we reached last row or left most column to switch direction. Else we travel down diagonally.
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