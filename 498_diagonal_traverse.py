from typing import List
from collections import defaultdict
from collections import deque


class Solution:
    def findDiagonalOrder(self, matrix: List[List[int]]) -> List[int]:
        """
            // Time Complexity : O(mn)
            // Space Complexity : O(1)
            // Did this code successfully run on Leetcode :
                    Yes
            // Three line explanation of solution in plain english :
                    - We have two directions to traverse, up and down
                    - For each direction we have three case
                        - We are at the end of the col (up direction)
                          or we are at the end of the row (down direction)
                        - We are at the start of the row (up direction)
                          or we are the start of column (down direction)
                        - We are some where in between (normal case)
                    - For each such case we adjust the row and col values
                      and direction
        """
        # direction we are traversing
        # 1 means up, -1 means down
        rows = len(matrix)
        cols = len(matrix[0])
        dir = 1
        row = col = 0
        result = []
        while len(result) < rows * cols:
            result.append(matrix[row][col])
            # Up Direction
            if dir == 1:
                # case 1
                if col == cols - 1:
                    row += 1
                    dir = -1
                # case 2
                elif row == 0:
                    col += 1
                    dir = -1
                # case 3
                else:
                    row -= 1
                    col += 1
            # Down direction
            elif dir == -1:
                # case 1
                if row == rows - 1:
                    col += 1
                    dir = 1
                # case 2
                elif col == 0:
                    row += 1
                    dir = 1
                # case 3
                else:
                    row += 1
                    col -= 1
        return result

    def find_diagonal_order_using_deque(self, matrix: List[List[int]]) -> List[int]:
        """
            // Time Complexity : O(mn)
            // Space Complexity : O(mn)
            // Did this code successfully run on Leetcode :
                    Yes
            // Three line explanation of solution in plain english :
                    - The sum of the row and col the element is the diagonal it
                      belongs to
                    - For each element add it to the corresponding diagonal number
                      (key) in the dictionary with the list as its value
                    - If it is a even diagonal append to the left else right
        """
        result = []
        if not matrix:
            return result

        no_of_diagonals = rows + cols - 1
        rows = len(matrix)
        cols = len(matrix[0])
        dic = defaultdict(deque)

        for row in range(rows):
            for col in range(cols):
                if (row + col) % 2 == 0:
                    dic[row + col].appendleft(matrix[row][col])
                else:
                    dic[row + col].append(matrix[row][col])

        for line in range(no_of_diagonals):
            result += dic[line]
        return result


if __name__ == '__main__':
    h = Solution()
    print(h.findDiagonalOrder([
        [1, 2, 3],
        [4, 5, 6],
        [7, 8, 9]
    ]))
    print(h.findDiagonalOrder([
        [1, 2, 3, 4, 5],
        [6, 7, 8, 9, 10],
        [11, 12, 13, 14, 15],
        [16, 17, 18, 19, 20]
    ]))
    print(h.findDiagonalOrder([
        [1, 2],
        [4, 5],
        [7, 8]
    ]))
