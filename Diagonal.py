# Time Complexity: O(m*n)
# Space Complexity: O(1)
  
class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        
        m = len(mat)
        n = len(mat[0])
        
        result = [0 for i in range(m*n)]
        
        i = 0
        j = 0
        dir = 1
        idx = 0
        
        while idx < m*n:
            result[idx] = mat[i][j]
            idx += 1
            
            if dir == 1:
                if (i == 0 and j != n-1):
                    j += 1
                    dir = -1
                elif j == n-1:
                    i += 1
                    dir = -1
                else:
                    i -= 1
                    j += 1
            else:
                if (j == 0 and i != m-1):
                    i += 1
                    dir = 1
                elif i == m-1:
                    j += 1
                    dir = 1
                else:
                    i += 1
                    j -= 1
                    
         
        return result        
            
        
