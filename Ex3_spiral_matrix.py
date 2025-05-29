# Time Complexity : O(m * n) where m = number of rows, n = number of columns
# Space Complexity : O(1) excluding the result list, since we're not using any extra space
# Did this code successfully run on Leetcode : YES
# Any problem you faced while coding this : No

from typing import List

class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        
        if not matrix or not matrix[0]:
            return []
        
        res = []
        rows = len(matrix)
        cols = len(matrix[0])
        
        top, bottom = 0, rows - 1
        left, right = 0, cols - 1

        while len(res) < rows * cols:
            # Traverse from Left to Right
            for col in range(left, right + 1):
                res.append(matrix[top][col])
            top += 1

            # Traverse from Top to Bottom
            for row in range(top, bottom + 1):
                res.append(matrix[row][right])
            right -= 1

            # Traverse from Right to Left
            if top <= bottom:
                for col in range(right, left - 1, -1):
                    res.append(matrix[bottom][col])
                bottom -= 1

            # Traverse from Bottom to Top
            if left <= right:
                for row in range(bottom, top - 1, -1):
                    res.append(matrix[row][left])
                left += 1

        return res


if __name__ == "__main__":
    sol = Solution()
    
    # Test case 1
    matrix1 = [[1, 2, 3], [4, 5, 6], [7, 8, 9]]
    print(sol.spiralOrder(matrix1))  # Output: [1, 2, 3, 6, 9, 8, 7, 4, 5]

    # Test case 2
    matrix2 = [[1, 2, 3, 4], [5, 6, 7, 8], [9, 10, 11, 12]]
    print(sol.spiralOrder(matrix2))  # Output: [1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7]

    # Test case 3
    matrix3 = [[1]]
    print(sol.spiralOrder(matrix3))  # Output: [1]

    # Test case 4
    matrix4 = [[1, 2], [3, 4]]
    print(sol.spiralOrder(matrix4))  # Output: [1, 2, 4, 3]

    # Edge case
    matrix5 = []
    print(sol.spiralOrder(matrix5))  # Output: []
