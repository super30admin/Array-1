# Time Complexity: O(m*n), we visit every element in the matrix exactly once
# Space Complexity: O(1), we only use 4 boundary variables, result array doesn't count as extra space
# We use 4 boundaries (top, bottom, left, right) to track the unvisited region of the matrix
# In each while loop iteration, we walk all 4 sides of the current boundary and shrink each wall inward after walking it
# We add if checks before bottom and left walks to avoid revisiting elements when only a single row or column remains

class Solution:
    def spiralOrder(self, matrix):
        m = len(matrix)                                 # number of rows
        n = len(matrix[0])                              # number of columns
        top, bottom, left, right = 0, m - 1, 0, n - 1   # initialize all 4 boundaries
        result = []                                     # output list to store spiral order elements

        while top <= bottom and left <= right:           # keep going while valid region exists

            for i in range(left, right + 1):             # walk RIGHT across top row
                result.append(matrix[top][i])            # pick element at row=top, col=i
            top += 1                                     # shrink top boundary downward

            for i in range(top, bottom + 1):             # walk DOWN right column
                result.append(matrix[i][right])          # pick element at row=i, col=right
            right -= 1                                   # shrink right boundary leftward

            if top <= bottom:                            # check if a bottom row still exists
                for i in range(right, left - 1, -1):     # walk LEFT across bottom row
                    result.append(matrix[bottom][i])     # pick element at row=bottom, col=i
                bottom -= 1                              # shrink bottom boundary upward

            if left <= right:                            # check if a left column still exists
                for i in range(bottom, top - 1, -1):     # walk UP left column
                    result.append(matrix[i][left])       # pick element at row=i, col=left
                left += 1                                # shrink left boundary rightward

        return result            