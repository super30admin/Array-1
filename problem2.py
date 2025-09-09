"""
Space Complexity: O(1) (if the output array doesn't count as auxillary memory)

Time Complexity: O(M * N) where m = number of rows and n = number of columns

"""

class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        m, n = len(mat), len(mat[0])
        r,c = 0,0
        direction = True
        res = []
        for _ in range(m*n): 
            res.append(mat[r][c])
            if direction: 
                if c == n-1:
                    r+=1 
                    direction = False
                elif r==0:
                    c+=1
                    direction = False
                else: 
                    r-=1
                    c+=1
    
            else: 
                if r == m-1:
                    c+=1 
                    direction = True
                elif c==0:
                    r+=1
                    direction = True
                else: 
                    c-=1
                    r+=1
        return res
        





