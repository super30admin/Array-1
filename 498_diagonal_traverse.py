'''
## Problem 498: Diagonal Traverse

## Author: Neha Doiphode
## Date:   07-09-2022

## Description
    Given an m x n matrix mat, return an array of all the elements of the array in a diagonal order.

## Examples:
    Example 1:
        Input: mat = [[1,2,3],[4,5,6],[7,8,9]]
        Output: [1,2,4,7,5,3,6,8,9]

    Example 2:
        Input: mat = [[1,2],[3,4]]
        Output: [1,2,3,4]

## Constraints:
    m == mat.length
    n == mat[i].length
    1 <= m, n <= 104
    1 <= m * n <= 104
    -105 <= mat[i][j] <= 105

## Time complexity: O(m * n), m = rows, n = columns traversing the matrix once.

## Space complexity: O(1) as we are not using any auxiliary space.

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
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        if not len(mat):
            return []

        m = len(mat)
        n = len(mat[0])
        result = [None] * (m * n)
        row = 0
        column = 0
        dir = 1
        index = 0
        # Generic cases for diagonal order
        # When we move in upward direction, we reduce row numbers and increase column numbers
        # consider moving in upward direction as dir = 1
        # Base cases
        while index < (m * n):
            result[index] = mat[row][column]
            index += 1

            if dir == 1:
                if column == n - 1:
                    # Change the direction
                    dir = -1
                    # Increase the row
                    row += 1

                elif row == 0:
                    # Change the direction
                    dir = -1
                    # Change the column
                    column += 1

                else:
                    row -= 1
                    column += 1

            else:
                # When we move in ownward direction
                if row == m - 1:
                    # Change the direction
                    dir = 1
                    column += 1

                elif column == 0:
                    # Change the direction
                    dir = 1
                    # Increase the row
                    row += 1
                else:
                    row += 1
                    column -= 1
        return result

# Driver code
solution = Solution()
input_matrix = get_input()
print(f"Input matrix: {input_matrix}")
print(f"Output matrix in diagonal order: {solution.findDiagonalOrder(input_matrix)}")
