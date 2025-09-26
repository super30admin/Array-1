class Solution:
    def spiralOrder(self, matrix):
        # Getting the number of rows (m) and columns (n)
        m = len(matrix)
        n = len(matrix[0])

        # Initializing the boundaries for traversal
        top, bottom, left, right = 0, m - 1, 0, n - 1

        # Creating a list to store the spiral order
        result = []

        # Iterating while the boundaries are valid
        while top <= bottom and left <= right:

            # Traversing from left to right along the top row
            for i in range(left, right + 1):
                result.append(matrix[top][i])
            top += 1  # Moving the top boundary down

            # Traversing from top to bottom along the right column
            for i in range(top, bottom + 1):
                result.append(matrix[i][right])
            right -= 1  # Moving the right boundary left

            # Checking if there are rows remaining
            if top <= bottom:
                # Traversing from right to left along the bottom row
                for i in range(right, left - 1, -1):
                    result.append(matrix[bottom][i])
                bottom -= 1  # Moving the bottom boundary up

            # Checking if there are columns remaining
            if left <= right:
                # Traversing from bottom to top along the left column
                for i in range(bottom, top - 1, -1):
                    result.append(matrix[i][left])
                left += 1  # Moving the left boundary right

        # Returning the spiral order traversal
        return result

# Time Complexity (TC): O(m * n), where m is the number of rows and n is the number of columns.
# Space Complexity (SC): O(m * n), it counting the result. If not counting the result, then O(1).
