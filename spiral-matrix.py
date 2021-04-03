# Time Complexity : O(mn), where m is the number of rows and n is the number of columns
# Space Complexity : O(1), since the space occupied by the output array doesn't count towards the space complexity
# continued: That is a requirement of the problem itself
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        m = (0, len(matrix) - 1)
        n = (0, len(matrix[0]) - 1)

        d = "right"

        res = []

        while m[0] <= m[1] and n[0] <= n[1]:
            if d == "right":
                i = m[0]

                for j in range(n[0], n[1] + 1):
                    res.append(matrix[i][j])

                m = (m[0] + 1, m[1])
                d = "down"

            elif d == "down":
                j = n[1]

                for i in range(m[0], m[1] + 1):
                    res.append(matrix[i][j])

                n = (n[0], n[1] - 1)
                d = "left"

            elif d == "left":
                i = m[1]

                for j in range(n[1], n[0] - 1, -1):
                    res.append(matrix[i][j])

                m = (m[0], m[1] - 1)
                d = "up"

            elif d == "up":
                j = n[0]

                for i in range(m[1], m[0] - 1, -1):
                    res.append(matrix[i][j])

                n = (n[0] + 1, n[1])
                d = "right"

        return res
