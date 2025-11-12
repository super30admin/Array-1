class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        dir = True 
        r = c = 0 
        m,n = len(mat), len(mat[0])
        result = [0] * (m * n)

        for i in range(m*n):
            result[i] = mat[r][c]

            if dir: 
                if c == n - 1:
                    dir = False 
                    r += 1
            
                elif r == 0: 
                    dir = False 
                    c += 1 

                else: 
                    r -= 1 
                    c += 1 
            else:
                if r == m-1:
                    dir = True 
                    c += 1

                elif c == 0:
                    dir = True 
                    r += 1
                else: 
                    r += 1 
                    c -= 1 
        return result


