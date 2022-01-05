# tc : O(mn)
# sc : O(1)
class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        dir = 1    
        res = []
        m = len(mat)
        n = len(mat[0])
        r = 0 
        c = 0
        while True:
            res.append(mat[r][c])
            if r == m -1 and c == n - 1:
                break
            print( r, c)
            if dir == 1:
                if c == n -1:
                    r = r + 1
                    dir = -1
                elif r == 0: # why this came down is a logic to ponder about 
                    c = c + 1
                    dir = -1
                else:
                    c = c + 1
                    r = r - 1
                    
            elif dir == -1:
                if r == m -1:
                    c = c + 1
                    dir = 1
                elif c == 0:
                    r = r + 1
                    dir = 1
                
                else:
                    r = r + 1
                    c = c -1
        return res