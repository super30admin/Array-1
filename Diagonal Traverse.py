""""// Time Complexity : O(m*n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :
"""


class Solution:
    def findDiagonalOrder(self, mat):
        m = len(mat)
        n = len(mat[0])
        result = [0] * (m * n)
        i = 0
        j = 0
        index = 0
        Flag = 1
        while (index < m * n):
            result[index] = mat[i][j]
            index += 1
            if Flag == 1:
                if i == 0 and j != n - 1:
                    j += 1
                    Flag = -1
                elif j == n - 1:
                    i += 1
                    Flag = -1
                else:
                    i -= 1
                    j += 1
            else:
                if j == 0 and i != m - 1:
                    i += 1
                    Flag = 1
                elif i == m - 1:
                    j += 1
                    Flag = 1
                else:
                    i += 1
                    j -= 1
        return result
