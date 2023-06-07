class Solution(object):
    def spiralOrder(self, matrix):
        """
        Time complexity: O(m * n), where m --> rows and n --> columns in the matrix. We visit each element once.
        Space complexity: O(m * n), as the result list stores all the elements in the matrix.
        :type matrix: List[List[int]]
        :rtype: List[int]
        """
        rows = len(matrix)  # Number of rows in the matrix
        cols = len(matrix[0])  # Number of columns in the matrix
        top = 0  # Top row index
        bottom = rows - 1  # Bottom row index
        left = 0  # Left column index
        right = cols - 1  # Right column index
        result = []  # List to store elements in spiral order

        while top <= bottom and left <= right:
            # Traverse the top row from left to right
            for j in range(left, right + 1):
                result.append(matrix[top][j])
            top += 1

            # Traverse the right column from top to bottom
            for i in range(top, bottom + 1):
                result.append(matrix[i][right])
            right -= 1

            # Check if there are remaining rows
            if top <= bottom:
                # Traverse the bottom row from right to left
                for j in range(right, left - 1, -1):
                    result.append(matrix[bottom][j])
                bottom -= 1

            # Check if there are remaining columns
            if left <= right:
                # Traverse the left column from bottom to top
                for i in range(bottom, top - 1, -1):
                    result.append(matrix[i][left])
                left += 1

        return result
