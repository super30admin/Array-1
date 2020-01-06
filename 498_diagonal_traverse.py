from typing import List
from collections import defaultdict
from collections import deque


class Solution:
    def findDiagonalOrder(self, matrix: List[List[int]]) -> List[int]:
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
    # h.findDiagonalOrder([
    #     [1, 2, 3, 4, 5],
    #     [6, 7, 8, 9, 10],
    #     [11, 12, 13, 14, 15],
    #     [16, 17, 18, 19, 20]
    # ])
    # print(h.findDiagonalOrder([
    #     [1, 2],
    #     [4, 5],
    #     [7, 8]
    # ]))
