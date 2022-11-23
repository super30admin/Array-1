class Solution:
    """
    Time complexity - O(n*m). n - no of rows in matrix m - no of columns in matrix
    Space complexity - O(1)
    """
    def spiralOrder(self, matrix: list[list[int]]) -> list[int]:
        left = 0
        top = 0
        right = len(matrix[0]) -1
        bottom = len(matrix) - 1
        result = [] 
        
        while(left <= right and top <= bottom):
            # top row
            for x in range(left, right+1):
                result.append(matrix[top][x])
            top += 1
            # right column
            for x in range(top, bottom+1):
                result.append(matrix[x][right])
            right -= 1
            # bottom row
            # check if only one row is left and is already covered.
            if top <= bottom:
                for x in range(right, left-1, -1):
                    result.append(matrix[bottom][x])
                bottom -= 1
            # left column
            # check if only one column is left and is already covered.
            if left <= right:
                for x in range(bottom ,top-1, -1):
                    result.append(matrix[x][left])
                left += 1
        return result
        