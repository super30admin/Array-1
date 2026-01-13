# Time Complexity : O(m * n) where m is rows and n is columns
# Space Complexity : O(1) excluding the output array
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

# Approach: Traverse diagonals by tracking direction (up-right or down-left) and adjusting row/column indices.
# When hitting boundaries, change direction and adjust indices to move to the next diagonal.
# Continue until all elements are processed.

class Solution:
    def findDiagonalOrder(self, matrix: List[List[int]]) -> List[int]:
        if not matrix or not matrix[0]:
            return []
        
        m, n = len(matrix), len(matrix[0])
        result = []
        row, col = 0, 0
        direction = 1  # 1 for up-right, -1 for down-left
        
        for _ in range(m * n):
            result.append(matrix[row][col])
            
            # Move in current direction
            row -= direction
            col += direction
            
            # Handle boundary cases
            if row >= m:
                row = m - 1
                col += 2
                direction = -direction
            elif col >= n:
                col = n - 1
                row += 2
                direction = -direction
            elif row < 0:
                row = 0
                direction = -direction
            elif col < 0:
                col = 0
                direction = -direction
        
        return result

