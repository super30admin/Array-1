#Time Complexity: O(n)
#Space Complexity: O(1)
class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:        
        if len(mat) == 0:
            return []
        m = len(mat)
        n = len(mat[0])
        result = [1]*(m*n)
        r = 0
        dirn = 1
        c = 0
        i = 0
        while i < (m*n):
            result[i] = mat[r][c]
            if dirn == 1:               
                if r== 0 and c!=n-1:
                    c += 1
                    dirn = -1
                
                elif c == n-1:
                    dirn = -1
                    r += 1
                else:
                    r -= 1
                    c += 1
            else:
                if c==0 and r!=m-1:
                    r += 1
                    dirn = 1
                    
                elif r==m-1:
                    dirn = 1
                    c += 1
                else:
                    r+=1
                    c-=1
            i +=1
                    
        return result
                    