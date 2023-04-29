"""
https://leetcode.com/problems/spiral-matrix/
 
Time Complexity : O(m*n) where m is the number of rows and n is the number of cols in an input matrix
Space Complexity : O(1) No Auxillary data structure is used

Did this code successfully run on Leetcode : Yes

Three line explanation of solution in plain english:
1. Four directions, four pointers to restrict the boundries.
2. Every time we move, change these pointers accordingly to restrict the bounderies.
3. Updating the base variables in a loop so need to add check in a while loop as well
"""


class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        m = len(matrix)
        n = len(matrix[0])

        result = []
        top = 0
        bottom = m - 1
        left = 0
        right = n - 1

        while (top <= bottom and left <= right):
            # top row
            for j in range(left, right+1):
                result.append(matrix[top][j])
            top += 1

            # right wall
            for i in range(top, bottom+1):
                result.append(matrix[i][right])
            right -= 1

            # bottom row
            if top <= bottom:
                for j in range(right, left-1, -1):
                    result.append(matrix[bottom][j])
            bottom -= 1

            # left wall
            if left <= right:
                for i in range(bottom, top-1, -1):
                    result.append(matrix[i][left])
            left += 1

        return result
