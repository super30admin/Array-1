# Time Complexity - O(mn)
# Space Complexity - O(1)

class Solution:
    
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        direc = 1
        r = 0
        c = 0
        m = len(mat)
        n = len(mat[0])
        result = [None]*m*n
        i=0
        while i<m*n:
            result[i] = mat[r][c]
            i = i+1
            if direc==1:
                if c==n-1:
                    r = r+1
                    direc = -1
                elif r==0:
                    c = c+1
                    direc = -1
                else:
                    r = r-1
                    c = c+1
            else:
                if r==m-1:
                    c = c+1
                    direc = 1
                elif c==0:
                    r = r+1
                    direc = 1
                else:
                    r = r+1
                    c = c-1
        return result
