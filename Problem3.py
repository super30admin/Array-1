class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        n, m = len(matrix[0]), len(matrix)
        x, y, dx, dy = 0, 0, 1, 0
        ans = []
        
        for j in range(m*n):
            ans.append(matrix[y][x])
            matrix[y][x] = "*"
            
            if (not 0 <= x+dx < n or not 0 <= y+dy < m or matrix[y+dy][x+dx] == "*"):
                dx, dy = -dy, dx 
            x+= dx
            y += dy
            
        return ans
