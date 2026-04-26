# Time Complexity --> O(m*n)
# Space Complexity --> O(1). There is no auxillary space
# Approach --> We traverse through the matrix in such a way that at each boundary, we create rules that change the direction and the way we tranverse to next within bounds element
class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        m = len(mat)
        n = len(mat[0])

        i = 0
        j = 0
        re = [0]*(m*n)
        upflag = 1
        for k in range(m*n):
            re[k] = mat[i][j]
            if upflag==1:
                if j==n-1:
                    i = i+1
                    upflag = 0
                elif i==0:
                    j = j+1
                    upflag = 0
                else:
                    i = i-1
                    j = j+1
            else:
                if i==m-1:
                    j = j+1
                    upflag = 1
                elif j==0:
                    i = i+1
                    upflag = 1
                else:
                    i = i+1
                    j = j-1
        return re
 
