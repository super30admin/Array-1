#TC => o(M*N)
#SC => o(1)  considering output array as constant

class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        m = len(mat)
        n = len(mat[0])
        r=0
        c=0
        result = []
        dir = 1
        for i in range(m*n):
            result.append(mat[r][c])
            if (dir == 1):
                if c == n-1:
                    dir = -1
                    r+=1
                elif r==0:
                    dir = -1
                    c+=1
                else:
                    r-=1
                    c+=1
            else:
                if r == m-1:
                    dir = 1
                    c+=1
                elif c == 0:
                    dir = 1
                    r+=1
                else:
                    r+=1
                    c-=1
        return result