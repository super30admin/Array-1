"""
[1,2,3]
[4,5,6]
[7,8,9]
"""

# Approach: We use a simulation-based traversal, moving diagonally up-right and down-left, switching directions at matrix boundaries.
# Time Complexity: O(m*n)(each element is visited once)
# Space Complexity: O(1) (excluding output array)


from typing import List


class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        m = len(mat)  # Number of rows
        n = len(mat[0])  # Number of columns

        result = [0] * (m * n)  # Array to store the result in diagonal order
        r, c = 0, 0  # Pointers for row and column

        dir = True  # Direction flag (True = moving up, False = moving down)

        for i in range(m * n):
            result[i] = mat[r][c]  # Store the current element in the result array

            if dir:  # Moving upwards
                if r == 0 and c != n - 1:  # If at the first row but not the last column
                    c += 1  # Move right
                    dir = False  # Change direction to downward
                elif c == n - 1:  # If at the last column
                    r += 1  # Move down
                    dir = False  # Change direction to downward
                else:  # Normal upward movement
                    r -= 1  # Move up
                    c += 1  # Move right
            else:  # Moving downwards
                if c == 0 and r != m - 1:  # If at the first column but not the last row
                    r += 1  # Move down
                    dir = True  # Change direction to upward
                elif r == m - 1:  # If at the last row
                    c += 1  # Move right
                    dir = True  # Change direction to upward
                else:  # Normal downward movement
                    r += 1  # Move down
                    c -= 1  # Move left

        return result  # Return the diagonally ordered elements


sol = Solution()
mat1 = [[1, 2, 3], [4, 5, 6], [7, 8, 9]]

print(sol.findDiagonalOrder(mat1))

"""
from typing import List

class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        m = len(mat)  # Number of rows in the matrix
        n = len(mat[0])  # Number of columns in the matrix

        result = [0] * (m * n)  # Array to store the result in diagonal order
        row, column = 0, 0  # Initialize row and column pointers

        dir = True  # Direction flag: True = moving up-right, False = moving down-left

        # Iterate through each position in the result array
        for i in range(m * n):
            result[i] = mat[row][column]  # Store the current matrix element in result

            if dir:  # Moving diagonally up-right
                if column == n - 1:  # If at the last column, move down and switch direction
                    row += 1
                    dir = False
                elif row == 0:  # If at the first row, move right and switch direction
                    column += 1
                    dir = False
                else:  # Otherwise, move diagonally up-right
                    row -= 1
                    column += 1
            else:  # Moving diagonally down-left
                if row == m - 1:  # If at the last row, move right and switch direction
                    column += 1
                    dir = True
                elif column == 0:  # If at the first column, move down and switch direction
                    row += 1
                    dir = True
                else:  # Otherwise, move diagonally down-left
                    row += 1
                    column -= 1
        
        return result  # Return the final diagonal order list

"""
