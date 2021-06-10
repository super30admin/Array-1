"""
Approach:
Since the direction of the traversal is changing when we touch the boundaries. We'd have to maintain a varialbe to
indicate the direction of traversal.

"""


class Solution(object):
    def findDiagonalOrder(self, mat):
        """
        :type mat: List[List[int]]
        :rtype: List[int]
        """
        row_len = len(mat)
        col_len = len(mat[0])

        r ,c = 0 ,0
        result = []
        d = 1
        while r < row_len and c < col_len:
            result.append(mat[r][c])

            if d == 1:
                if c == col_le n -1:
                    r += 1
                    d = - 1-
                elif r == 0:
                    c += 1
                    d = -1
                else:
                    r -= 1
                    c += 1

            else:
                if r == row_len -1:
                    c += 1
                    d = 1
                elif c == 0:
                    r += 1
                    d = 1
                else:
                    r += 1
                    c -= 1

            # print(result)
        return result

"""
TC: O(n)
SC: O(1)
"""