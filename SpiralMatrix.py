# 54. Spiral Matrix
# Time Complexity : O(n) 
# Space Complexity : O(n) 
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No
# 
class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        res = []
        if not matrix:
            return res
        m = len(matrix)
        n = len(matrix[0])        
        left = 0 
        right = n-1
        top = 0
        bottom = m -1
        while top <= bottom and left <= right:
           #top
            if top <= bottom:
                for i in range(left,right+1):
                    res.append(matrix[top][i])
                top = top + 1
            #right
            if left <= right:
                for i in range(top,bottom+1):
                    res.append(matrix[i][right])
                right =  right - 1
            #bottom
            if top <= bottom:
                for i in range(right,left-1,-1):
                    res.append(matrix[bottom][i])
                bottom = bottom - 1
            #left
            if left <= right:
                for i in range(bottom,top-1,-1):
                    res.append(matrix[i][left])
                left = left + 1
        return res