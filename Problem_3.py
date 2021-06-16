"""
Time Complexity : O(m*n) - number of elements in the matrix. 
Space Complexity : O(1)
    
"""

class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        if not matrix or len(matrix) == 0:
            return []
        
        m = len(matrix)
        n = len(matrix[0])
        
        result = []
        c1 = 0
        c2 = n - 1 
        r1 = 0
        r2 = m - 1 
        
        while c1 <= c2 and r1 <= r2:
            
            for j in range(c1, c2+1): 
                result.append(matrix[r1][j])
            r1 += 1 
            
            if c1 <= c2:
                for i in range(r1, r2+1):
                    result.append(matrix[i][c2])
                c2 -= 1 
            
            if r1 <= r2:
                for j in range(c2, c1-1, -1):
                    result.append(matrix[r2][j])
                r2 -= 1
            
            if c1 <= c2 :
                for i in range(r2, r1-1, -1):
                    result.append(matrix[i][c1])
                c1 += 1 
        
        return result 