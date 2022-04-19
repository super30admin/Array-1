# // Time Complexity : O(m*n) m=>rows n=>cols
# // Space Complexity : O(1)
# // Did this code successfully run on Leetcode : yes

class Solution(object):
    def findDiagonalOrder(self, mat):
        """
        :type mat: List[List[int]]
        :rtype: List[int]
        """

        if len(mat) == 0:
            return 0

        direction = 1
        rows = len(mat)
        cols = len(mat[0])

        result = []
        row = 0
        col = 0

        for i in range(rows*cols):
            result.append(mat[row][col])

            if direction == 1:

                if col == cols - 1:
                    direction = -1
                    row = row + 1
                elif row == 0:
                    direction = -1
                    col = col + 1
                else:
                    row = row - 1
                    col = col + 1

            elif direction == -1:

                if row == rows - 1:
                    direction = 1
                    col = col + 1
                elif col == 0:
                    direction = 1
                    row = row + 1
                else:
                    row = row + 1
                    col = col - 1

        return result
