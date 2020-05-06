# Time Complexity: O(N*M) where N and M are rows and columns of the matrix
# Space Complexity: O(1)
# Did this code successfully run on Leetcode : Yes
# Three line explanation of solution in plain english: traverse through the matrix using direction upwards
# and downwards. Move along, making sure that the next element encountered is within array bounds. After traversing
# one direction flip the direction.

class Solution:

    def findDiagonalOrder(self, matrix):

        # edge case - empty array
        if not matrix or not matrix[0]:
            return []

        # The dimensions of the matrix
        i = len(matrix)
        j = len(matrix[0])

        row = 0
        column = 0
        # to understand the direction of the traversal
        direction = 1
        result_array = []

        while row < i and column < j:
            # add current matrix
            result_array.append(matrix[row][column])

            new_row = row + (-1 if direction == 1 else 1)
            new_column = column + (1 if direction == 1 else -1)

            # if next element is within bounds
            if new_row < 0 or new_row == i or new_column < 0 or new_column == j:

                # check if direction is 1
                if direction:

                    row += (column == j - 1)
                    column += (column < j - 1)
                else:
                    column += (row == i - 1)
                    row += (row < i - 1)

                # Change the direction of traversal
                direction = 1 - direction
            else:
                row = new_row
                column = new_column

        return result_array


r = Solution()
input_array = [
    [1, 2, 3],
    [4, 5, 6],
    [7, 8, 9]
]
print(r.findDiagonalOrder(input_array))
