#https://leetcode.com/problems/spiral-matrix/

class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        m = len(matrix)
        n = len(matrix[0])
        left = top = 0
        right = n - 1
        bottom = m - 1
        result = []
        while left <= right and top <= bottom:
            #top row
            for i in range(left, right+1):
                result.append(matrix[top][i])
            top += 1
            if left <= right and top <= bottom:
                #right col
                for i in range(top, bottom+1):
                    result.append(matrix[i][right])
                right -= 1
            if left <= right and top <= bottom:
                #bottom row
                for i in range(right, left-1, -1):
                    result.append(matrix[bottom][i])
                bottom -= 1
            if left <= right and top <= bottom:
                #left col
                for i in range(bottom, top-1, -1):
                    result.append(matrix[i][left])
                left += 1
        return result