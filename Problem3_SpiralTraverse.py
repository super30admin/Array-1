# Time Complexity : O(mn)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes

# Three line explanation of solution in plain english:
"""
1. To return the elements in spiral order, consider 4 directions - right, left, up and down.
2. When moving in any direction, add all the elements in the corresponding direction to the result array and then
    increment or decrement the corresponding row or column.
3. Then switch the direction and continue the above step until all directions meet and all elements are traversed.
"""

# Your code here along with comments explaining your approach

def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
    if not matrix or len(matrix) == 0:
        return []

    row_len = len(matrix)
    col_len = len(matrix[0])
    result = []

    top = 0
    bottom = row_len - 1
    left = 0
    right = col_len - 1

    direction = 0

    # Loop until top meets bottom and left meets right
    while (top <= bottom and left <= right):

        # Traverse right
        if direction == 0:
            for col in range(left, right + 1):
                result.append(matrix[top][col])
            top += 1

        # Traverse down
        if direction == 1:
            for row in range(top, bottom + 1):
                result.append(matrix[row][right])
            right -= 1

        # Traverse left
        if direction == 2:
            for col in range(right, left - 1, -1):
                result.append(matrix[bottom][col])
            bottom -= 1

        # Traverse up
        if direction == 3:
            for row in range(bottom, top - 1, -1):
                result.append(matrix[row][left])
            left += 1

        direction = (direction + 1) % 4

    return result