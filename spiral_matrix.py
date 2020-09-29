"""
Problem: 54. Spiral Matrix
Leetcode: https://leetcode.com/problems/spiral-matrix/
Example:
    Input: [
            [ 1, 2, 3 ],
            [ 4, 5, 6 ],
            [ 7, 8, 9 ]
           ]
    Output: [1,2,3,6,9,8,7,4,5]
Solution: Traverse through first row, right col, last row, left col while taking care of the boundaries
Time Complexity: O(N), where N is the total number of elements in the input matrix. We add every element in the matrix to our final answer.
Space Complexity: O(N), for the output array
"""


class Solution:
    def spiral_matrix(self, matrix):

        # Base case
        if len(matrix) is 0 or matrix is None:
            return 0

        result = [] # empty array
        left = 0 # 1st column
        right = len(matrix[0]) - 1  # last column
        top = 0 # 1st row
        bottom = len(matrix) - 1 # last row

        while left <= right and top <= bottom:
            # top row - left to right
            for i in range(left, right + 1):
                result.append(matrix[top][i]) #1,2,3
            top += 1

            # last column - top to bottom
            for i in range(top, bottom + 1):
                result.append(matrix[i][right]) #6,9
            right -= 1

            if top <= bottom:
                # last row - right to left
                for i in range(right, left - 1, -1):
                    result.append(matrix[bottom][i]) #8,7
            bottom -= 1

            if left <= right:
                # first column - bottom to top
                for i in range(bottom, top - 1, -1):
                    result.append(matrix[i][left]) #4
            left += 1

        return result


obj = Solution()
print(obj.spiral_matrix([[ 1, 2, 3 ],[ 4, 5, 6 ],[ 7, 8, 9 ]]))





