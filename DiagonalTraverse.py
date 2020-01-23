"""
// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
        # approach:
        #     1. if col == n - 1 with up trend (right bolder), or
        # .         col == 0 with down trend (left bolder):
        #               move down, which means row += 1, and turn direction
        #     2. if row == 0 with up trend (top bolder), or
        #           row == m - 1 with down trend (bottom bolder):
        #            move right, which means col += 1 and turn direction
        #     3. Otherwise, go up-right or down-left by direction

"""
# Python3
class Solution:
    def findDiagonalOrder(self, matrix):
        """
        :type matrix: List[List[int]]
        :rtype: List[int]
        """

        m = len(matrix)
        n = len(matrix[0]) if m > 0 else 0
        if n == 0:
            return []

        result = [0 for i in range(m*n)]
        up = True
        row = col = 0

        for i in range(m*n):
            result[i] = matrix[row][col]

            # check right bolder before top bolder in up trend
            if up:
                if col == n - 1:
                    row = row + 1
                    up =  not up
                elif row == 0:
                    col = col + 1
                    up = not up
                else:
                    row = row - 1
                    col = col + 1

            # check bottom bolder before left bolder in down trend
            else:
                if row == m - 1:
                    col = col + 1
                    up = not up
                elif col == 0:
                    row = row + 1
                    up = not up
                else:
                    row = row + 1
                    col = col - 1

        return result