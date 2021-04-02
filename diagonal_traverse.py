# Time Complexity: O(mn) where m is the number of rows and n is the number of columns
# Space Complexity: O(1) if output array is not considered as extra space
# Ran on Leetcode: Yes
# Explanation: Manipulating index to find points where we have change direction

class Solution:
    def findDiagonalOrder(self, matrix: List[List[int]]) -> List[int]:
        out = []
        if not len(matrix):
            return out
        path = 1
        i = 0
        j = 0
        index = 0
        m = len(matrix)
        n = len(matrix[0])
        while index < m * n:
            out.append(matrix[i][j])
            if path == 1:
                if j == n-1:
                    path = -1
                    i += 1
                elif i == 0:
                    path = -1
                    j += 1
                else:
                    i -= 1
                    j += 1
            else:
                if i == m - 1:
                    path = 1
                    j += 1
                elif j == 0:
                    path = 1
                    i += 1
                else:
                    j -= 1
                    i += 1
            index += 1
        return out
        