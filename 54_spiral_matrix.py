from typing import List


class Solution:

    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:

        """
            // Time Complexity : O(mn)
                    'm' is the number of rows, 'n' is the number of columns
            // Space Complexity : O(1)
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

        # in each while loop we do one loop (right, down, left, up)
        while len(result) < rows * cols:
            for col in range(left, right + 1):
                result.append(matrix[top][col])
            top += 1
            for row in range(top, bottom + 1):
                result.append(matrix[row][right])
            right -= 1
            if top <= bottom:
                for col in reversed(range(left, right + 1)):
                    result.append(matrix[bottom][col])
                bottom -= 1
            if left <= right:
                for row in reversed(range(top, bottom + 1)):
                    result.append(matrix[row][left])
                left += 1
        return result

    def spiral_order_recursive(self, matrix: List[List[int]]) -> List[int]:
        """
            // Time Complexity : O(mn)
                    'm' is the row, 'n' is the column
            // Space Complexity : O(min(m,n))
            // Did this code successfully run on Leetcode : Yes
            // Three line explanation of solution in plain english
                    - The logic is similar to the iterative solution
                    - The keen observation is after one loop (right, down, left, up)
                      the next traversal is a recursive structure.
        """
        # edge case
        result = []
        if not matrix:
            return result
        rows = len(matrix)
        cols = len(matrix[0])
        self._helper(matrix, 0, rows - 1, 0, cols - 1, result)
        return result

    def _helper(self, matrix: List[List[int]], top, bottom, left, right, result: List[int]) -> None:
        # base case
        if left > right or top > bottom: return
        # logic
        for col in range(left, right + 1):
            result.append(matrix[top][col])
        top += 1
        for row in range(top, bottom + 1):
            result.append(matrix[row][right])
        right -= 1
        if top <= bottom:
            for col in reversed(range(left, right + 1)):
                result.append(matrix[bottom][col])
            bottom -= 1
        if left <= right:
            for row in reversed(range(top, bottom + 1)):
                result.append(matrix[row][left])
            left += 1
        self._helper(matrix, top, bottom, left, right, result)


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
    print(h.spiral_order_recursive([
        [1, 2, 3],
        [4, 5, 6],
        [7, 8, 9]
    ]))
    print(h.spiral_order_recursive([
        [1, 2, 3, 4],
        [5, 6, 7, 8],
        [9, 10, 11, 12]
    ]))
