'''
## Problem 54: Spiral matrix

## Author: Neha Doiphode
## Date:   07-09-2022

## Description
    Given an m x n matrix, return all elements of the matrix in spiral order.

## Examples
    Example 1:
        1 -> 2 -> 3
                  |
        4 -> 5    6
        |         |
        7 <- 8 <- 9

        Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
        Output: [1,2,3,6,9,8,7,4,5]

    Example 2:
        1 -> 2 -> 3 -> 4
                       |
      5 -> 6 -> 7      8
      |                |
      9 <- 10 <- 11 <- 12

        Input: matrix = [[1,2,3,4],[5,6,7,8],[9,10,11,12]]
        Output: [1,2,3,4,8,12,11,10,9,5,6,7]

## Constraints:
    m == matrix.length
    n == matrix[i].length
    1 <= m, n <= 10
    -100 <= matrix[i][j] <= 100

## Time complexity: O(m * n), where m is number of rows and n is number of columns

## Space complexity: O(1), we are not using any auxiliary data structure to get the result
                           space required to store the answer is not counted.

'''

from typing import List

def get_input():
    print("Enter the number of rows in the matrix: ", end = "")
    rows = int(input())
    print("Enter the number of columns in the matrix: ", end = "")
    columns = int(input())
    input_matrix = []
    for row in range(rows):
        l = []
        print(f"Row {row + 1}: ")
        for column in range(columns):
            inp = int(input())
            l.append(inp)
        input_matrix.append(l)

    return input_matrix

class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        if not len(matrix):
            return []

        rows = len(matrix)
        columns = len(matrix[0])

        left = 0
        right = columns - 1

        top = 0
        bottom = rows - 1

        # Start looping
        result = []
        while left <= right and top <= bottom:
            # 1. Move from left to right
            for i in range(left, right + 1):
                result.append(matrix[top][i])
            # now increment top as we are done with the first row, new top should be top + 1
            top += 1

            # 2. Move from top to bottom
            if left <= right:
                for i in range(top, bottom + 1):
                    result.append(matrix[i][right])
                    # Now that we reached bottom, decrement right as new right would be one less than the current right
                right -= 1

            if top <= bottom:
                # 3. Move from right to left
                for i in range(right, left - 1, -1):
                    result.append(matrix[bottom][i])
                    # now bottom row is covered so, decrement bottom
                bottom -= 1

            if top <= bottom and left <= right:
                # 4. Move from bottom to top
                for i in range(bottom, top - 1, -1):
                    result.append(matrix[i][left])
                    # Now we covered left column so increment left
                left += 1

        return result

# Driver code
solution = Solution()
input_matrix = get_input()
print(f"Input matrix: {input_matrix}")
print(f"Output matrix in spiral order: {solution.spiralOrder(input_matrix)}")
