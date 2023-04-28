## Problem 2

# Given a matrix of M x N elements (M rows, N columns), return all elements of the matrix in diagonal order as shown in the below image.
#
# Input:
#
# [
#     [ 1, 2, 3 ],
#     [ 4, 5, 6 ],
#     [ 7, 8, 9 ]
# ]
#
# Output: [1,2,4,7,5,3,6,8,9]

# Time Complexity : O(m*n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

class Solution(object):
    def findDiagonalOrder(self, matrix):
        if not matrix:
            return []
        m = len(matrix)
        n = len(matrix[0])
        result = [0] * (m * n)
        i = 0
        r = 0
        c = 0
        dir = 1
        while i < m * n:
            result[i] = matrix[r][c]
            if dir == 1:
                if c == n - 1:
                    r += 1
                    dir = -1
                elif r == 0:
                    c += 1
                    dir = -1
                else:
                    r -= 1
                    c += 1
            else:
                if r == m - 1:
                    c += 1
                    dir = 1
                elif c == 0:
                    r += 1
                    dir = 1
                else:
                    r += 1
                    c -= 1
            i += 1
        return result

matrix = [[1,2,3],[4,5,6],[7,8,9]]
print(Solution().findDiagonalOrder(matrix))
