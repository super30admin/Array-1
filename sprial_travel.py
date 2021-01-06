# Time Complexity : O(m *n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        res = []
        if len(matrix) == 0 or len(matrix[0]) == 0:
            return res
        
        top = 0
        bottom = len(matrix)-1
        left = 0 
        right = len(matrix[0])-1
        size = len(matrix) * len(matrix[0])
        
        while len(res) < size:
            # top row
            for i in range(left, right+1):
                if len(res) < size:
                    res.append(matrix[top][i])
            top += 1
            
            # right column
            for i in range(top, bottom+1):
                if len(res) < size:
                    res.append(matrix[i][right])
            right -= 1
            #buttom
            for i in range(right, left-1, -1):
                if len(res) < size:
                    res.append(matrix[bottom][i])
            bottom -= 1
            #left
            for i in range(bottom, top-1, -1):
                if len(res) < size:
                    res.append(matrix[i][left])
            left += 1
            
        return res
