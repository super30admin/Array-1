
"""
Time Complexity : O(m*n) as we travers through the whole matrix
Space Complexity : O(1) as we are returning the array
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : No


Your code here along with comments explaining your approach
In this question, we need to traverse the matrix in diagonals. We divide the solution into 2 parts, one
when we are going up and the other when we are going down.When we are going up, the other position would be 
row-1 and col+1. For this situation, we have 2 edge cases, one when we reach the last column, in that case, we
will just change the direction and increment the row. Another edge case would be when we reach topmost row.
In such situation, we cannot decrement the row, so we just change the diection and increment the column.
Just the opposite edge cases come into picture when we are going downwards. Either we reach the last row or we
reach the first column. 
"""


class Solution(object):
    def findDiagonalOrder(self, matrix):
        if not matrix:
            return []
        m = len(matrix)
        n = len(matrix[0])
        result = [0 for i in range(m*n)]
        idx = 0
        dirc = 1
        i = 0
        j = 0
        while idx < m*n:
            result[idx] = matrix[i][j]
            if dirc == 1:
                if j == n-1:
                    i += 1
                    dirc = -1
                elif i == 0:
                    j += 1
                    dirc = -1
                else:
                    i -= 1
                    j += 1
            else:
                if i == m-1:
                    j += 1
                    dirc = 1
                elif j == 0:
                    i += 1
                    dirc = 1
                else:
                    j -= 1
                    i += 1
            idx += 1
        return(result)
