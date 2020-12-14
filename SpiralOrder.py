# TC : O(rows * columns)
# SC : O(1)
# Approach : We iterate through the matrix according spiral order maintaining 4 variables; left, right, top and 
# bottom. Whenever we reach boundary, we decrement or increment one of these 4 variables accordingly. Meanwhile
# everytime we check if top <= bottom and left <= right.

class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        result = []
        if not matrix or len(matrix) == 0:
            return result
        left = 0 ; right = len(matrix[0]) - 1
        top = 0 ; bottom = len(matrix) - 1
        while top <= bottom and left <= right:
            if top <= bottom and left <= right:
                for i in range(left, right+1):
                    result.append(matrix[top][i])
                top += 1
            
            if top <= bottom and left <= right:
                for i in range(top, bottom+1):
                    result.append(matrix[i][right])
                right -= 1
                
            if top <= bottom and left <= right:
                for i in range(right, left-1, -1):
                    result.append(matrix[bottom][i])
                bottom -= 1
                
            if top <= bottom and left <= right:
                for i in range(bottom, top-1, -1):
                    result.append(matrix[i][left])
                left += 1
        
        return result