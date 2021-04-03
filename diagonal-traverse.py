# Time Complexity : O(mn), where m is the number of rows and n is the number of columns
# Space Complexity : O(1), since the space occupied by the output array doesn't count towards the space complexity
# continued: That is a requirement of the problem itself
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

class Solution:
    def findDiagonalOrder(self, matrix: List[List[int]]) -> List[int]:
        if not matrix:
            return []

        m = len(matrix)
        n = len(matrix[0])

        arr = [None for _ in range(m * n)]

        i, j = 0, 0

        # direction: 1 for upwards and -1 for downwards
        d = 1

        for k in range(len(arr)):
            arr[k] = matrix[i][j]

            if d == 1:

                if j == n - 1:
                    d = -1
                    i += 1

                elif i == 0:
                    d = -1
                    j += 1

                else:
                    i -= 1
                    j += 1

            else:

                if i == m - 1:
                    d = 1
                    j += 1

                elif j == 0:
                    d = 1
                    i += 1

                else:
                    i += 1
                    j -= 1

        return arr
