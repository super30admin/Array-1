#Time Complexity - O(m * n)
#Space Complexity - O(1)
class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        result = []
        m = len(mat) - 1 
        n = len(mat[0]) - 1
        
        row = 0
        col = 0
        
        UP = 1
        DOWN = 0
        
        i, j = 0, 0
        
        while len(result) != (m + 1)*(n + 1):
            if UP == 1:
                while j <= col:
                    result.append(mat[i][j])
                    i -= 1
                    j += 1
                i += 1
                j -= 1
                if col != n:
                    j += 1
                    col += 1
                    row += 1 if row + 1 <= m else 0
                else:
                    i += 1
                    row += 1 if row + 1 <= m else 0
                DOWN = 1
                UP = 0
            else:
                while i <= row:
                    result.append(mat[i][j])
                    i += 1
                    j -= 1
                j += 1
                i -= 1
                if row != m:
                    i += 1
                    row += 1
                    col += 1 if col + 1 <= n else 0
                else:
                    j += 1
                    col += 1 if col + 1 <= n else 0
                DOWN = 0
                UP = 1
                
        return result