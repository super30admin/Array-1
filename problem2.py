#problem 2

class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        m = len(mat)
        n = len(mat[0])
        result = [0] * (m * n)
        r = c = 0
        direction = True
        for i in range(m*n):
            result[i] = mat[r][c]
            if direction:
                if c == n-1:
                    r+=1
                    direction = False
                elif r == 0:
                    c+=1
                    direction = False
                else:
                    r-=1
                    c+=1
            else:
                if r == m-1:
                    c+=1
                    direction = True
                elif c == 0:
                    r+=1
                    direction = True
                else:
                    r+=1
                    c-=1
        return result