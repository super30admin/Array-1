"""
Time Complexity : O(mn)
Space Complexity : O(1)
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this: none
"""

class Solution:
    def spiralOrder(self, matrix):
        res = []
        if matrix == None or len(matrix) == 0:
            return res
        
        t = 0
        b = len(matrix) - 1
        l = 0
        r = len(matrix[0]) - 1
        
        while (l <= r and t <= b):
            
            # iterate from left to right on top pointer
            for i in range(l, r+1):
                res.append(matrix[t][i])
            t += 1
            
            # iterate from top to bottom on right pointer
            for i in range(t, b+1):
                res.append(matrix[i][r])
            r -= 1
            
            # iterate from right to left on bottom pointer
            if t <= b:
                for i in range(r, l-1, -1):
                    res.append(matrix[b][i])
                b -= 1
            
            # iterate from bottom to top on left pointer
            if l <= r:
                for i in range(b,t-1,-1):
                    res.append(matrix[i][l])
                l += 1
                
        return res                
    
s = Solution()
print(s.spiralOrder([[1,2,3],[4,5,6],[7,8,9]]))
print(s.spiralOrder([[6,9,7]]))