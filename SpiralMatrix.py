# Time complexity: O(m * n) where m is the number of rows and n is the number of columns of the matrix.
# Space complexity: O(1).
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        if len(matrix) == 0: return []
        m, n = len(matrix), len(matrix[0])
        down, right = m-1, n-1
        up, left = 0, 0
        result = []          
        while up <= down and left <= right:
            # Moving left to right first.
            for i in range(left, right + 1):
                result.append(matrix[up][i])
            up += 1             # Row is traversed, move down.
            
            # Moving top to bottom.
            for i in range(up, down + 1):
                result.append(matrix[i][right])
            right -= 1          # Column is traversed, move left.
            
            # Moving right to left.
            if up <= down:      # Since up is updated, we have to check if it is still valid.
                for i in reversed(range(left, right + 1)):
                    result.append(matrix[down][i])
                down -= 1        # Row is traversed, move up.
            
            # Moving bottom to top.
            if left <= right:
                for i in reversed(range(up, down + 1)):
                    result.append(matrix[i][left])
                left += 1       # Column is traversed, move right.
                
        return result
                    