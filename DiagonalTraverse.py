# Time Complexity : O(m*n)
# Space Complexity : O(1)

# The code ran on LeetCode

# Maintain a boolean flag to check if we are moving up or down. If we are away from boundary, move the indices normally. When at boundary, check which index (row or column) need to be moved, also change direction at each boundary

class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        
        m = len(mat); n = len(mat[0])
        idx = 0; res = [0]*(m*n)
        direction = 'up'
        i = j = 0
        while idx < len(res):
            res[idx] = mat[i][j]
            idx+=1
            if direction == 'up':
                if i == 0 and j != n-1:
                    j+=1; direction = 'down'
                elif j == n-1:
                    i+=1; direction = 'down'
                else:
                    i-=1; j+=1
            else:
                if j == 0 and i != m-1:
                    i+=1; direction = 'up'
                elif i == m-1:
                    j+=1; direction = 'up'
                else:
                    i+=1; j-=1
        return res