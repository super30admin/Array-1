## Problem 3
# Given a matrix of m x n elements (m rows, n columns), return all elements of the matrix in spiral order.
#
# Example 1:
#
# Input:
#
# [
#     [ 1, 2, 3 ],
#     [ 4, 5, 6 ],
#     [ 7, 8, 9 ]
# ]
# Output: [1,2,3,6,9,8,7,4,5]

# Time Complexity : O(m*n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

class Solution(object):
    def spiralOrder(self, matrix):
        if not matrix:
            return []
        m = len(matrix)
        n = len(matrix[0])
        result = [0] * (m * n)
        i = 0
        r = 0
        c = 0
        left = 0
        right = n - 1
        top = 0
        bottom = m - 1
        while i < m * n:
            result[i] = matrix[r][c]
            if r == top and c < right:
                c += 1
            elif c == right and r < bottom:
                r += 1
            elif r == bottom and c > left:
                c -= 1
            elif c == left and r > top:
                r -= 1
            if r == top and c == left:
                left += 1
                right -= 1
                top += 1
                bottom -= 1
                r = top
                c = left
            i += 1
        return result

matrix = [[1,2,3],[4,5,6],[7,8,9]]
print(Solution().spiralOrder(matrix))
