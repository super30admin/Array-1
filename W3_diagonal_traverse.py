class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        
        if mat is None:
            return []

        
        m = len(mat)
        n = len(mat[0])

        r = 0
        c = 0

        dir = True

        result = [0] * (m * n)

        for i in range(m*n):
            result[i] = mat[r][c]

            if dir:
                if c == n-1:
                    r+= 1
                    dir = False
                elif r == 0:
                    c += 1
                    dir = False
                else:
                    r -= 1
                    c += 1
            
            else:
                if r == m-1:
                    c+= 1
                    dir = True
                elif c == 0:
                    r += 1
                    dir = True
                else:
                    c -= 1
                    r += 1 

        return result

# Time: O(m * n)
# Space O(1)