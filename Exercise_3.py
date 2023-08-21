# ## Problem 3
# Given a matrix of m x n elements (m rows, n columns), return all elements of the matrix in spiral order.
# Example 1:
# Input:
# [
# [ 1, 2, 3 ],
# [ 4, 5, 6 ],
# [ 7, 8, 9 ]
# ]
# Output: [1,2,3,6,9,8,7,4,5]
# Example 2:
# Input:
# [
# [1, 2, 3, 4],
# [5, 6, 7, 8],
# [9,10,11,12]
# ]
# Output: [1,2,3,4,8,12,11,10,9,5,6,7]

# // Time Complexity :O(m*n)
# // Space Complexity :O(1)
# // Did this code successfully run on Leetcode :Yes
# // Three line explanation of solution in plain english

# // Your code here along with comments explaining your approach
class Solution:
    def spiralOrder(self, matrix):
        m = len(matrix)
        n = len(matrix[0])
        top = left = 0
        right = n - 1
        bottom = m - 1
        result = []
        while (top <= bottom and left <= right):
            # top row
            for c in range(left, right + 1, 1):
                result.append(matrix[top][c])
            top += 1
            # last col
            if (left <= right):
                for r in range(top, bottom + 1, 1):
                    result.append(matrix[r][right])
            right -= 1
            # last row
            if (top <= bottom):
                for c in range(right, left - 1, -1):
                    result.append(matrix[bottom][c])
            bottom -= 1
            # first row
            if (left <= right):
                for r in range(bottom, top - 1, -1):
                    result.append(matrix[r][left])
            left += 1
        return result


matrix = [[1, 2, 3], [4, 5, 6], [7, 8, 9]]
sol = Solution()
print(sol.spiralOrder(matrix))
