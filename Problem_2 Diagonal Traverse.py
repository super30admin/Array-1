# // Time Complexity : O(mn)
# // Space Complexity : O(1)
# // Did this code successfully run on Leetcode : Yes
# // Any problem you faced while coding this : No
#
#
# // Your code here along with comments explaining your approach


class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        if not mat or not mat[0]:
            return []

        n = len(mat)
        m = len(mat[0])

        result = [0] * (n * m)

        dirs = 1
        row, column = 0, 0
        length = m * n
        for idx in range(length):
            result[idx] = mat[row][column]
            if (dirs == 1):
                if (column == m - 1):
                    row = row + 1
                    dirs = -1
                else:
                    if (row == 0):
                        column = column + 1
                        dirs = -1
                    else:
                        row = row - 1
                        column = column + 1
            else:
                if (row == n - 1):
                    column = column + 1
                    dirs = 1
                else:
                    if (column == 0):
                        row = row + 1
                        dirs = 1
                    else:
                        column = column - 1
                        row = row + 1
        return result