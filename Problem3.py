# Time Complexity: O(m * n)
# Space Complexity: O(1)
class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        result = []
        m = len(matrix)
        n = len(matrix[0])
        top = 0
        bottom = m - 1
        left = 0
        right = n - 1
        
        while top <= bottom and left <= right:
            # Traverse on top: from left to right
            for j in range(left, right + 1):
                result.append(matrix[top][j])
            top += 1
            
            # Traverse on right: from top to bottom
            for i in range(top, bottom + 1):
                result.append(matrix[i][right])
            right -= 1
            
            # Check if there are more rows and columns to traverse
            if top <= bottom and left <= right:
                # Traverse on bottom: from right to left
                for j in range(right, left - 1, -1):
                    result.append(matrix[bottom][j])
                bottom -= 1
            
            # Check if there are more rows and columns to traverse
            if top <= bottom and left <= right:
                # Traverse on left: from bottom to top
                for i in range(bottom, top - 1, -1):
                    result.append(matrix[i][left])
                left += 1
        
        return result
