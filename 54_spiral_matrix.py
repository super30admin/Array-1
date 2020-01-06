from typing import List
from enum import Enum


class Solution:

    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:

        """
            // Time Complexity : O(mn)
                    'm' is the number of rows, 'n' is the number of columns
            // Space Complexity : O(mn)
            // Did this code successfully run on Leetcode :
                    Yes
            // Three line explanation of solution in plain english :
                    - For each direction we have a pointer. Four pointers in
                      total. Top row, Bottom row, left column, right column
                    - Traverse clockwise, right, down, left, up
                    - To traverse right: Row is constant (Top pointer)
                            traverse between left and right column
                      To traverse down: Column is constant (Right pointer)
                            traverse between top and bottom rows
                      To traverse left: Row is constant (Bottom pointer)
                            traverse between left and right column
                      To traverse up: Column is constant (Left pointer)
                            traverse between top and bottom rows
        """
        result = []

        if not matrix:
            return result
        rows = len(matrix)
        cols = len(matrix[0])
        top, bottom, left, right = 0, rows - 1, 0, cols - 1

        while len(result) < rows * cols:
            for col in range(left, right + 1):
                if len(result) < rows * cols: result.append(matrix[top][col])
            top += 1
            for row in range(top, bottom + 1):
                if len(result) < rows * cols: result.append(matrix[row][right])
            right -= 1
            for col in reversed(range(left, right + 1)):
                if len(result) < rows * cols: result.append(matrix[bottom][col])
            bottom -= 1
            for row in reversed(range(top, bottom + 1)):
                if len(result) < rows * cols: result.append(matrix[row][left])
            left += 1
        return result


if __name__ == '__main__':
    h = Solution()
    print(h.spiralOrder([
        [1, 2, 3],
        [4, 5, 6],
        [7, 8, 9]
    ]))
    print(h.spiralOrder([
        [1, 2, 3, 4],
        [5, 6, 7, 8],
        [9, 10, 11, 12]
    ]))
