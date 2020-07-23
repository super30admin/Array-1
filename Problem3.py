# Time Complexity : O(m*n)
# Space Complexity: O(1)
# Works on leetcode: yes
# Approach: We use i,j as directions. For going into spirals, we need to keep track of 4 directions. Even though we do m*n iterations
# , we use r,c variables to keep track of iteration location. We need to have a check where we know the direction needs to change.
class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        if not matrix:
            return []
        res = []
        r,c,i,j = 0,0,0,1
        m, n = len(matrix), len(matrix[0])
        for _ in range(m*n):
            res.append(matrix[r][c])
            matrix[r][c]=' '
            if matrix[(r+i)%m][(c+j)%n]==' ':
                i,j = j,-i
            r+=i
            c+=j
        return res