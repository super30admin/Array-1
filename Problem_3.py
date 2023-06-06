# Time Complexity: O(m * n)
# Space Complexity: O(1)
# Did this code successfully run on Leetcode: Yes
# Any problem you faced while coding this: No

class Solution(object):
    def spiralOrder(self, matrix):
        """
        :type matrix: List[List[int]]
        :rtype: List[int]
        """
        if not matrix:
            return []
        m = len(matrix)
        n = len(matrix[0])
        ans = []
        r1 = 0
        c1 = 0
        r2 = (m - 1)
        c2 = (n - 1)
        while len(ans) < (m * n):
            j = c1
            while j <= c2 and len(ans) < (m * n):
                ans.append(matrix[r1][j])
                j += 1
            i = (r1 + 1)
            while i <= (r2 - 1) and len(ans) < (m * n):
                ans.append(matrix[i][c2])
                i += 1
            j = c2
            while j >= c1 and len(ans) < (m * n):
                ans.append(matrix[r2][j])
                j -= 1
            i = (r2 - 1)
            while i >= (r1 + 1) and len(ans) < (m * n):
                ans.append(matrix[i][c1])
                i -= 1
            r1 += 1
            c1 += 1
            r2 -= 1
            c2 -= 1
        return ans