"""
Time Complexity : O(m*n) - number of elements in the matrix. 
Space Complexity : O(1)
    
"""

class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        if not mat or len(mat) == 0:
            return []
        
        m = len(mat)
        n = len(mat[0])
        result = [None for _ in range(m*n)]
        i = 0
        r = 0
        c = 0
        dir_ = 1 
        
        while i < m*n:
            result[i] = mat[r][c]
            
            if dir_ == 1:
                if c == n - 1:
                    r += 1 
                    dir_ = -1
                
                elif r == 0:
                    c += 1 
                    dir_ = -1 
                
                else:
                    c += 1 
                    r -= 1 
            
            else:
                if r == m - 1:
                    c += 1 
                    dir_ = 1 
                
                elif c == 0:
                    r += 1 
                    dir_ = 1 
                
                else:
                    r += 1
                    c -= 1 
                    
            i += 1 
        
        return result 
        
                
                
        
        

    