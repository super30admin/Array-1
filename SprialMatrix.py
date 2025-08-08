class Solution:
    def spiralOrder(self, matrix: list[list[int]]) -> list[int]:
        
        m = len(matrix)
        n = len(matrix[0])
        result = []

        top = 0
        bottom = m-1
        left = 0
        right = n-1

        while top <= bottom and left <= right:
            # result[index] = matrix[r][c]

            # top traverse
            if top <= bottom and left <= right:
                for i in range(left, right+1):
                    result.append(matrix[top][i])
                top += 1
            
            # right traverse
            if top <= bottom and left <= right:
                for i in range(top, bottom+1):
                    result.append(matrix[i][right])
                right -= 1

            # bottom traverse
            if top <= bottom and left <= right:
                for i in range(right, left-1, -1):
                    result.append(matrix[bottom][i])
                bottom -= 1
            
            # left traverse
            if top <= bottom and left <= right:
                for i in range(bottom, top-1, -1):
                    result.append(matrix[i][left])
                left += 1

        return result