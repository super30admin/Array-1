'''
Problem 3

Given a matrix of m x n elements (m rows, n columns), return all elements of the matrix in spiral order.

Example 1:

Input:

[

[ 1, 2, 3 ],

[ 4, 5, 6 ],

[ 7, 8, 9 ]

] Output: [1,2,3,6,9,8,7,4,5] Example 2:

Input:

[

[1, 2, 3, 4],

[5, 6, 7, 8],

[9,10,11,12]

] Output: [1,2,3,4,8,12,11,10,9,5,6,7]
'''

class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]: # type: ignore
        m = len(matrix)
        n = len(matrix[0])

        result = []
        top = 0
        bottom = m-1
        left = 0
        right = n-1

        while top <= bottom and left <= right:
            #top row
            if top <= bottom and left <= right:
                for j in range(left, right+1):
                    result.append(matrix[top][j])
                top = top+1

            #right col
            if top <= bottom and left <= right:
                for i in range(top, bottom+1):
                    result.append(matrix[i][right])
                right = right -1

            #bottom row
            if top <= bottom and left <= right:
                for j in range(right, left-1, -1):
                    result.append(matrix[bottom][j])
                bottom = bottom -1

            #left col
            if top <= bottom and left <= right:
                for i in range(bottom, top-1, -1):
                    result.append(matrix[i][left])
                left = left + 1
        return result                            
