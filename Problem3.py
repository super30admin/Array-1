'''
Time Complexity: O(m*n)
Space COmplexity: O(1)
Run on Leetcode: YES
'''
class Solution:
    def spiralOrder(self, matrix: list[list[int]]) -> list[int]:
        top = 0
        left = 0
        right = len(matrix[0]) - 1
        bottom = len(matrix) - 1
        result = []
        while top <= bottom and left <= right:
            # first row
            for index in range(left, right + 1):
                result.append(matrix[top][index])
            top += 1
            if top > bottom:
                break
            #last column
            for index in range(top, bottom + 1):
                result.append(matrix[index][right])
            right -= 1
            if left > right:
                break
            #last row
            for index in range(right, left - 1, -1):
                result.append(matrix[bottom][index])
            bottom -= 1
            #first column
            for index in range(bottom, top - 1, -1):
                result.append(matrix[index][left])
            left += 1
        return result