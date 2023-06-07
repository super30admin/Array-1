class Solution(object):
    def findDiagonalOrder(self, mat):
        """
        Time complexity: O(m * n), where m --> rows and n --> columns.
        Space complexity: O(m * n) for the result list.

        :type mat: List[List[int]]
        :rtype: List[int]
        """
        rows = len(mat)
        cols = len(mat[0])
        # Create a list of the appropriate size to store the result
        result = [0] * (rows * cols)
        idx, i, j = 0, 0, 0  # Initialize variables
        # Flag to determine the direction (upwards or downwards)
        direction = True

        while idx < len(result):
            # Store the current element in the result list
            result[idx] = mat[i][j]

            if direction:
                if i == 0 and j != cols - 1:  # If at the first row and not at the last column
                    j += 1
                    direction = False  # Change direction to downwards
                elif j == cols - 1:  # If at the last column
                    i += 1
                    direction = False  # Change direction to downwards
                else:
                    i -= 1
                    j += 1  # Move diagonally upwards
            else:
                if j == 0 and i != rows - 1:  # If at the first column and not at the last row
                    i += 1
                    direction = True  # Change direction to upwards
                elif i == rows - 1:  # If at the last row
                    j += 1
                    direction = True  # Change direction to upwards
                else:
                    i += 1
                    j -= 1  # Move diagonally downwards

            idx += 1  # Increment the index

        return result
