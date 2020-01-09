"""
Time Complexity : O(mn)
Space Complexity : O(1)
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this: none
"""

class Solution:
    def findDiagonalOrder(self, matrix):
        if matrix == None or len(matrix) == 0:
            return []
        
        m = len(matrix)
        n = len(matrix[0])
        res = [0] * (m*n)
        c = 0
        r = 0
        i = 0
        direc = 1
        
        while i < m*n:
            res[i] = matrix[r][c]
            if direc == 1:
                if c == n-1:
                    r += 1
                    direc = -1
                elif r == 0:
                    c += 1
                    direc = -1
                else:
                    r -= 1
                    c += 1
            
            else:
                if r == m-1:
                    c += 1
                    direc = 1
                elif c == 0:
                    direc = 1
                    r += 1
                else:
                    r += 1
                    c -= 1
            i += 1
            
        return res

s = Solution()
print(s.findDiagonalOrder([[1,2,3],[4,5,6],[7,8,9]]))