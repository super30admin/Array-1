#T.C. O(m*n) where m = no of rows, n = no of columns
#S.C. O(n) due to result array

class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        row = len(matrix)
        col = len(matrix[0])
        top = 0
        bottom = row - 1
        left = 0
        right = col - 1
        result = []
        while left <= right and top <= bottom:
            #top
            for j in range(left, right+1):
                result.append(matrix[top][j])

            top += 1
             #right
            for i in range(top, bottom + 1):
                result.append(matrix[i][right])
            right -= 1
            
            if not (left <= right and top <= bottom):
                break

            #bottom
            for j in range(right, left - 1, -1):
                result.append(matrix[bottom][j])
            bottom -= 1

            #left
            for i in range(bottom, top - 1, -1):
                result.append(matrix[i][left])
            left += 1

        return result
            
