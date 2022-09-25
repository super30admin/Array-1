# Time Complexity: O(m * n) where m and n are number of rows and columns respectively
# Space Complexity: O(1)

# The code sucessfully ran on Leetcode

class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        if len(mat) == 0 or mat == None:
            return []
        
        m = len(mat)
        n = len(mat[0])
        r = 0
        c = 0
        direction = 1
        result = [0] * (m * n)
        idx = 0
        
        while(idx < m * n):
            result[idx] = mat[r][c]
            idx += 1
            
            if direction == 1:
                if c == n - 1:
                    r += 1
                    direction = -1
                
                elif r == 0:
                    c += 1
                    direction = -1
                    
                else:
                    r -= 1
                    c += 1
                    
            elif direction == -1:
                if r == m - 1:
                    c += 1
                    direction = 1
                
                elif c == 0:
                    r += 1
                    direction = 1
                
                else:
                    r += 1
                    c -= 1
                    
        return result
        