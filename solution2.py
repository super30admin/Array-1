# // Time Complexity : o(n)
# // Space Complexity :o(1)
# // Did this code successfully run on Leetcode : yes
# // Any problem you faced while coding this : so many cases to consider gave me a headache..
#
#
# // Your code here along with comments explaining your approach
class Solution:
    def findDiagonalOrder(self, matrix: List[List[int]]) -> List[int]:
        if not matrix:
            return []
        result = []
        dir = "up"
        i, j = 0, 0

        m = len(matrix)
        n = len(matrix[0])

        while len(result) < m * n:
            while True:
                result.append(matrix[i][j])
                if dir == "up":
                    if i == 0 or j == n - 1:
                        break
                    i -= 1
                    j += 1
                elif dir == "down":
                    if j == 0 or i == m - 1:
                        break
                    i += 1
                    j -= 1

            # transition:
            if dir == "up":
                if i == 0 and j < n - 1:
                    j += 1
                    dir = "down"
                elif i >= 0 and j == n - 1:
                    i += 1
                    dir = "down"
            elif dir == "down":
                if j == 0 and i < m - 1:
                    i += 1
                    dir = "up"
                elif j >= 0 and i == m - 1:
                    j += 1
                    dir = "up"

        return result