class Solution:
    def findDiagonalOrder(self, mat):
        # Getting the dimensions of the matrix
        m, n = len(mat), len(mat[0])
        # Initializing the result array to store the traversal
        result = [0] * (m * n)
        # Setting the starting position
        row = col = 0
        # Using a flag to keep track of the current direction (True for up-right, False for down-left)
        direction = True

        # Iterating through each element in the matrix
        for i in range(m * n):
            # Adding the current element to the result
            result[i] = mat[row][col]

            # Checking if moving in up-right direction
            if direction:
                # If at the last column, moving down and changing direction
                if col == n - 1:
                    row += 1
                    direction = False
                # If at the first row, moving right and changing direction
                elif row == 0:
                    col += 1
                    direction = False
                # Otherwise, moving up and right
                else:
                    row -= 1
                    col += 1
            # Checking if moving in down-left direction
            else:
                # If at the last row, moving right and changing direction
                if row == m - 1:
                    col += 1
                    direction = True
                # If at the first column, moving down and changing direction
                elif col == 0:
                    row += 1
                    direction = True
                # Otherwise, moving down and left
                else:
                    row += 1
                    col -= 1

        # Returning the diagonal traversal result
        return result

# Time Complexity (TC): O(m * n), since visiting each element once
# Space Complexity (SC): O(m * n), for storing the result array