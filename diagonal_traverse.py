"""
Problem: 498. Diagonal Traverse
Leetcode: https://leetcode.com/problems/diagonal-traverse/
Solution: check - last col or not the last col, last row or not the last row
Time Complexity: O(M*N), M rows and N columns
Space Complexity: O(M*N), storing all elements of a matrix into an array
"""


class Solution:
    def diagonal_matrix(self, matrix):
        # Check for an empty matrix
        if matrix is None or len(matrix) == 0 or len(matrix[0]) == 0:
            return []

        # Dimensions of the matrix
        rows = len(matrix)
        cols = len(matrix[0])

        # Insides to navigate through each element
        row = 0
        col = 0

        # Helps to decide the direction of the diagonal
        direction = 1

        # Output array will contain all elements of the matrix
        result = []

        # Iterate over all elements of the matrix
        while row < rows and col < cols:
            # add the current element to the output array
            result.append(matrix[row][col])

            # Move along in the current diagonal direction
            # i.e. (i,j) -> (i-1,j+1) if going up and
            # (i,j) -> (i+1,j-1) if going down
            new_row = row + (-1 if direction == 1 else 1)
            new_col = col + (1 if direction == 1 else -1)

            # Check if the next element in the diagonal is within bounds or not
            if new_row < 0 or new_row == rows or new_col < 0 or new_col == cols:
                # if the current diagonal is going in upward direction
                if direction:
                    # for upward diagonal having [i,j],
                    # if [i,j+1] is within bounds, it becomes next head
                    # else [i+1,j] becomes next head
                    row += (col == cols-1) # last column
                    col += (col < cols-1) # any but last column
                else:
                    # for downward diagonal having [i,j],
                    # if [i+1,j] is within bounds, it becomes next head
                    # else [i,j+1] becomes next head
                    col += (row == rows - 1) # last row
                    row += (row < rows - 1) # any but last row

                # Flip the direction
                direction = 1 - direction
            else:
                row = new_row
                col = new_col
        return result


obj = Solution()
nums = [
 [1, 2, 3],
 [4, 5, 6],
 [7, 8, 9]
]
print(obj.diagonal_matrix(nums))