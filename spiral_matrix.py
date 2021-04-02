# Time Complexity: O(mn) where m is the number of rows and n is the number of columns
# Space Complexity: O(1) if output array is not considered as extra space
# Ran on Leetcode: Yes
# Explanation: Manipulating index to find points where we have change direction

class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        if not len(matrix):
            return 0
        i = 0
        j = 0
        out = []
        path = 1
        index = 0
        m = len(matrix)
        n = len(matrix[0])
        r = m - 1
        while index < m * n:
            out.append(matrix[i][j])
            if path == 1:
                if (i + j) == (n - 1):
                    path = 2
                    i += 1
                else:
                    j += 1
            elif path == 2:
                if i == r:
                    path = -1
                    j -= 1
                    r -= 1
                else:
                    i += 1
            elif path == -1:
                if (i + j) == abs(m - 1):
                    path = -2
                    i -= 1
                else:
                    j -= 1
            else:
                if abs(i - j) == 1:
                    path = 1
                    j += 1
                else:
                    i -= 1
            index += 1
        return out
        