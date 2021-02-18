# Time complexity - O(mn) (where m,n: rows and column length)
# Space Complexity: O(1) 
# Did this code successfully run on LeetCode?: Yes
# Problems faced while coding this:None

class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        rows, cols = len(matrix), len(matrix[0])
        result = []
        
        left, top = 0, 0
        right = cols - 1
        bottom = rows - 1
        
        while top <= bottom and left <= right:
            for i in range(left, right+1):
                result.append(matrix[top][i])
            top += 1
            
            if left <= right:
                for i in range(top, bottom+1):
                    result.append(matrix[i][right])
                right -= 1
                
            if top <= bottom:
                for i in range(right, left-1, -1):
                    result.append(matrix[bottom][i])
                bottom -= 1
                
            if left <= right:
                for i in range(bottom, top-1, -1):
                    result.append(matrix[i][left])
                left += 1
        return result