"""
Time Complexity : O(N*M), N: no of row, M:no of cols
Space Complexity : O(1)
Did this code successfully run on Leetcode : Yes

## Problem 3
Given a matrix of m x n elements (m rows, n columns), return all elements of the matrix in spiral order.

Example 1:

Input:

[

[ 1, 2, 3 ],

[ 4, 5, 6 ],

[ 7, 8, 9 ]

]
Output: [1,2,3,6,9,8,7,4,5]
Example 2:

Input:

[

[1, 2, 3, 4],

[5, 6, 7, 8],

[9,10,11,12]

]
Output: [1,2,3,4,8,12,11,10,9,5,6,7]

"""

class Solution:
    def spiralOrder(self, matrix):
        """
        By defining the boundaries of the matrix and updating it after every turn. 
        """
        # edge cases
        if len(matrix) == 0: return 0
        if len(matrix) == 1: return matrix[0]
        m, n = len(matrix), len(matrix[0])
        top, bottom = 0, m -1
        left, right = 0, n -1
        res = []
        
        while(top <= bottom and left <= right):
            # top wall
            for t in range(left, right +1):
                res.append(matrix[top][t])
            top += 1
            
            
            # right wall
            if (top <= bottom and left <= right):
                for r in range(top, bottom+1):
                    res.append(matrix[r][right])    
            right -=1
            
            
            # bottom wall
            if (top <= bottom and left <= right):
                for b in range(right, left-1, -1):
                    res.append(matrix[bottom][b])
            bottom -= 1
            
            # left wall
            if (top <= bottom and left <= right):
                for l in range(bottom, top-1, -1):
                    res.append(matrix[l][left])
            left += 1
            
        return res