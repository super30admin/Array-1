class Solution:
    def findDiagonalOrder(self, mat):
        m = len(mat)
        n = len(mat[0])
        
        res = [0]*(m*n)
        r = 0
        c = 0
        direction = 1 #up
        i = 0
        while i < len(res):
            res[i] = mat[r][c]
            i += 1
            
            if direction == 1: # moving up
                if c == n-1:
                    r += 1
                    direction = -1
                elif r == 0:
                    c += 1
                    direction = -1
                else:
                    r -= 1
                    c += 1
            
            else: # moving down
                if r == m-1:
                    c += 1
                    direction = 1
                elif c == 0:
                    r += 1
                    direction = 1
                else:
                    r += 1
                    c -= 1
        
        return res

obj = Solution()
print(obj.findDiagonalOrder([[1,2,3],[4,5,6],[7,8,9]]))