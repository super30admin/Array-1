# Time Complexity : O(m*n) where m is the number of rows and n is the number of columns
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

'''
My approach:
Use four pointers to keep track of the top, bottom, left, and right boundaries of the matrix.
Iterate through the matrix in a spiral order by moving the pointers after each side is processed.
Sides are always processed in the same order: top, right, bottom, left.
'''
class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        top, left = 0, 0
        right = len(matrix[0])-1
        bottom = len(matrix)-1

        result = []

        while top <= bottom and left <= right:
            # Left to right
            for i in range(left, right+1):
                result.append(matrix[top][i])
            top+=1

            # Top to bottom
            for j in range(top, bottom+1):
                result.append(matrix[j][right])
            right -=1

            # Right to left
            if top <= bottom:
                for i in range(right, left-1, -1):
                    result.append(matrix[bottom][i])
                bottom -= 1

            # Bottom to top
            if left <= right:
                for j in range(bottom, top-1, -1):
                    result.append(matrix[j][left])
                left+=1

        return result
