# Time Complexity : O(m*n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No
from typing import List


class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        m = len(matrix)
        n = len(matrix[0])
        top = 0
        left = 0
        bottom = m-1
        right = n-1
        sol = []
        while left <= right and top <= bottom:
            if left <= right and top <= bottom:
                for i in range(left, right+1):
                    sol.append(matrix[top][i])
                top += 1

            if left <= right and top <= bottom:
                for i in range(top, bottom+1):
                    sol.append(matrix[i][right])
                right -= 1

            if left <= right and top <= bottom:
                for i in range(right, left - 1, -1):
                    sol.append(matrix[bottom][i])
                bottom -= 1

            if left <= right and top <= bottom:
                for i in range(bottom, top - 1, -1):
                    sol.append(matrix[i][left])
                left += 1
        return sol


if __name__ == '__main__':
    _mat = [[1, 2, 3, 4], [5, 6, 7, 8], [9, 10, 11, 12]]
    print(Solution().spiralOrder(_mat))
