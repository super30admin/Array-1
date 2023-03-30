# Time Complexity : O(n) because we are traversing the matrix once
# Space Complexity : O(1) because we are not using any extra space
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


# Your code here along with comments explaining your approach in three sentences only
"""
In this code we are using the up, down, left, right variables to keep track of the boundaries 
and we continue to append elements in a clockwise fashion with the loops
"""

class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        # return matrix.pop(0) + self.spiralOrder([list(i) for i in zip(*matrix)][::-1]) if matrix else []
        
        result = []
        rows, columns = len(matrix), len(matrix[0])
        up = left = 0
        right = columns - 1
        down = rows - 1

        while len(result) < rows * columns:
            for col in range(left, right + 1):
                result.append(matrix[up][col])

            for row in range(up + 1, down + 1):
                result.append(matrix[row][right])

            if up != down:
                for col in range(right - 1, left - 1, -1):
                    result.append(matrix[down][col])

            if left != right:
                for row in range(down - 1, up, -1):
                    result.append(matrix[row][left])

            left += 1
            right -= 1
            up += 1
            down -= 1

        return result