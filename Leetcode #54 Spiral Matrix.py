# Time Complexity: O(n * m).
# Space Complexity: O(1)

class Solution:
    def spiralOrder(matrix):
        if matrix is None or len(matrix) == 0:
            return []
        
        m = len(matrix)
        n = len(matrix[0])
        result = []
        top = 0
        left = 0
        right = n -1
        bottom = m -1

        while top <= bottom and left <= right:
            # top row
            for i in range(left, right + 1):
                result.append(matrix[top][i])
            top += 1

            # right column
            for i in range(top, bottom + 1):
                result.append(matrix[i][right])
            right -= 1

            # bottom row
            if top <= bottom:
                for i in range(right, left + 1, -1):
                    result.append(matrix[bottom][i])
                bottom -= 1
            
            # left column
            if left <= right:
                for i in range(bottom, top + 1, -1):
                    result.append(matrix[i][left])
                left += 1
        
        return result
    



