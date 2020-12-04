# Time Complexity - O(N) where N = m*n

# Space Complexity - O(1)

# Did this code successfully run on Leetcode : Yes

# Any problem you faced while coding this : No

# Approach
# I have used a direction variable which indicates 1 for moving up and -1 for moving down.
# Accordingly I apply the edge cases and traverse


class Solution:
    def findDiagonalOrder(self, matrix: List[List[int]]) -> List[int]:
        if matrix == None or len(matrix) == 0:
            return []

        i, j = 0, 0
        direction = 1
        m = len(matrix)
        n = len(matrix[0])

        result = []
        count = 0
        while (count < m * n):
            result.append(matrix[i][j])
            if direction == 1:
                if j == n - 1:
                    direction = -1
                    i += 1
                elif i == 0:
                    direction = -1
                    j += 1
                else:
                    i -= 1
                    j += 1
            else:
                if i == m - 1:
                    direction = 1
                    j += 1
                elif j == 0:
                    direction = 1
                    i += 1
                else:
                    j -= 1
                    i += 1
            count += 1
        return result



