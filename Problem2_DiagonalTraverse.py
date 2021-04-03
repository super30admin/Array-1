# Time Complexity : O(mn)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes

# Three line explanation of solution in plain english:
"""
1. To return the elements in diagonal order, consider 2 directions - upward and downward.
2. To move in any direction, increment or decrement the corresponding row and column to move to the next diagonal element.
3. When the edges are reached, change the direction by moving to the next row or column. In case of corner position,
    change the column to row and row to column to move to the next element.
"""

# Your code here along with comments explaining your approach

def findDiagonalOrder(self, matrix: List[List[int]]) -> List[int]:
    if not matrix or len(matrix) == 0:
        return []

    row_len = len(matrix)
    col_len = len(matrix[0])
    result = []
    row, col = 0, 0

    # Initializing direction as upward
    direction = 1

    while row < row_len and col < col_len:
        result.append(matrix[row][col])

        # Traverse upward
        if direction == 1:

            # Change direction
            if col == col_len - 1:
                direction = -1
                row += 1
            elif row == 0:
                direction = -1
                col += 1

            # No change in direction
            else:
                row -= 1
                col += 1

        # Traverse downward
        else:

            # Change direction
            if row == row_len - 1:
                direction = 1
                col += 1
            elif col == 0:
                direction = 1
                row += 1

            # No change in direction
            else:
                row += 1
                col -= 1

    return result