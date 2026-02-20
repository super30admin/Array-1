# Time Complexity : O(n × m)
# Space Complexity : O(1) 
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No
# Approach: Traverse the matrix in spiral order using four boundaries (top, bottom, left, right).
# Move right → down → left → up and Repeat this process layer by layer until all elements are visited.



class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        n = len(matrix)
        m = len(matrix[0])
        left,top = 0,0
        right  = m - 1
        bottom = n - 1
        res = []
        while top <= bottom and left <= right:
        
            for i in range(left,right + 1):
                res.append(matrix[top][i])
            top += 1

            for i in range(top,bottom + 1):
                res.append(matrix[i][right])
            right -= 1

            if top <= bottom:
                for i in range(right,left - 1,-1):
                    res.append(matrix[bottom][i])
                bottom -= 1
            
            if left <= right:
                for i in range(bottom,top - 1,-1):
                    res.append(matrix[i][left])
                left += 1
        
        return res

