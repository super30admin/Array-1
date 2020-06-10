#498. Diagonal Traverse
# Time Complexity : O(m*n)
# Space Complexity : O(n)
# Did this code successfully run on Leetcode :Yes
class Solution:
    def findDiagonalOrder(self, matrix: List[List[int]]) -> List[int]:
        if not matrix or not matrix[0]:
            return []
        m = len(matrix[0])
        n = len(matrix)
        dir = 1
        res = [0] * (n*m)
        r = 0
        c = 0
        i = 0    
        while(i < m*n):
            res[i] = matrix[r][c]
            if dir == 1:
                if c == n-1:
                    r += 1
                    dir = -1
                elif r == 0:
                    c += 1
                    dir = -1
                else:
                    r -= 1
                    c += 1
            else:
                if r == m-1:
                    c += 1
                    dir = 1
                elif c == 0:
                    r += 1
                    dir = 1
                else:
                    r += 1
                    c -= 1
            i += 1
        return res
        
