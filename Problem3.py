"""
Implemented using an iterative technique, where I used four variables — top, bottom, left, and right — which shrink after each full rotation to process the inner elements.
Time Complexity: O(m * n)
Space Complexity: O(m * n)
"""
class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        left = 0
        right = len(matrix[0]) - 1
        top = 0
        bottom = len(matrix) - 1
        result = []
        while left <= right and top <= bottom:
            # from left to right
            for i in range(left, right + 1):
                result.append(matrix[top][i])
            top += 1

            # from top to bottom
            for j in range(top, bottom + 1):
                result.append(matrix[j][right])
            right -= 1

            # from right to left
            if top <= bottom:
                for k in range(right, left - 1, -1):
                    result.append(matrix[bottom][k])
                bottom -= 1
            
            # from bottom to top
            if left <= right:
                for l in range(bottom, top - 1, -1):
                    result.append(matrix[l][left])
                left += 1
        return result