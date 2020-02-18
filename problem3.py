'''
Time Complexity :O(min(m,n) * n )
Space Complexity: O(n)
Did this code successfully run on Leetcode : Yes
Explanation:
Iteration 1 - Iterates through top row and the right column, iteration -2 - iterates through bottom row and left column
all that is left is center and adds that to the list.
'''


class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        l = []
        if len(matrix) == 0 or matrix == None:
            return []

        if len(matrix) == 1:
            return matrix[0]

        M, N = len(matrix), len(matrix[0])
        m = n = 0
        k = 0
        maxValue = min(M, N)
        while k < maxValue:
            if k % 2 == 0:
                for j in range(n, N):
                    l += [matrix[m][j]]
                for i in range(m + 1, M):
                    l += [matrix[i][N - 1]]
                m = m + 1
                N = N - 1
            else:
                for j in reversed(range(n, N)):
                    l += [matrix[M - 1][j]]

                for i in reversed(range(m, M - 1)):
                    l += [matrix[i][n]]
                n, M = n + 1, M - 1
            k = k + 1

        return l
