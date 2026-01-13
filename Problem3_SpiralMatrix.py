# Time Complexity : O(m * n) where m is rows and n is columns
# Space Complexity : O(1) excluding the output array
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

# Approach: Use four boundaries (top, bottom, left, right) to track the spiral traversal.
# Traverse right, down, left, up in sequence, updating boundaries after each direction.
# Continue until all elements are processed.

class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        if not matrix or not matrix[0]:
            return []
        
        m, n = len(matrix), len(matrix[0])
        result = []
        top, bottom, left, right = 0, m - 1, 0, n - 1
        
        while top <= bottom and left <= right:
            # Traverse right
            for j in range(left, right + 1):
                result.append(matrix[top][j])
            top += 1
            
            # Traverse down
            for i in range(top, bottom + 1):
                result.append(matrix[i][right])
            right -= 1
            
            # Traverse left (if still valid)
            if top <= bottom:
                for j in range(right, left - 1, -1):
                    result.append(matrix[bottom][j])
                bottom -= 1
            
            # Traverse up (if still valid)
            if left <= right:
                for i in range(bottom, top - 1, -1):
                    result.append(matrix[i][left])
                left += 1
        
        return result

