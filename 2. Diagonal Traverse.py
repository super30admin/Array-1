from collections import defaultdict, deque

class Solution:
    # Time Complexity - O(m*n)
    # Space Complexity - O(m*n)
    def findDiagonalOrder(self, mat):
        if mat == []: return []
        m, n = len(mat), len(mat[0])

        result = defaultdict(deque)
        max_sum = m + n - 2
        for row in range(m):
            for col in range(n):
                s = row + col
                if s % 2 != 0:
                    result[s].append(mat[row][col])
                else:
                    result[s].appendleft(mat[row][col])
        output = []
        for s in range(max_sum + 1):
            output.extend(result[s])
        return output