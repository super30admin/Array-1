# Time Complexity: O(m*n) where m is the number of rows and n is the number of columns
# Space Complexity: O(1)
# Did this code successfully run on Leetcode : Yes

# Approach:
# 1. We maintain a boolean variable, dir to keep track of which direction we are in.
# 2. If we are going in an upward direction, we need to traverse to row-1, col+1
# 3. If we are going in a downward direction, we need to traverse row+1, col-1
# 4. We take care of edge cases where we are at the 0th row, or 0th column, and last row and last column.

from typing import List
class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        # get rows and columns of the matrix
        m, n = len(mat), len(mat[0])
        # Initialize result array with the size of total number of elements in the matrix
        res = [0] * (m*n)
        
        # Initialize dir to True to keep track of current direction of the traversal
        dir = True
        # Initialize row (r) and column(c) pointers
        r, c = 0, 0
        for i in range(m*n):
            # Add the current element to the result array
            res[i] = mat[r][c]

            # If the current direction is upward
            if dir:
                # If we are at the first row but not the last column
                if r == 0 and c != n-1:
                    # move right and change direction
                    c += 1
                    dir = False
                # If we are at the last column
                elif c == n-1:
                    # Move down and change direction
                    r += 1
                    dir = False
                # Otherwise, move diagonally up (decrease row, increase column)
                else:
                    r -= 1
                    c += 1
            # If the current direction is downward
            else:
                # If we are at the first column but not the last row
                if c == 0 and r != m-1:
                    # move down and change direction
                    r += 1
                    dir = True
                # If we are at the last row
                elif r == m-1:
                    # move right and change direction
                    c += 1
                    dir = True
                # Otherwise, move diagonally down (increase row, decrease column)
                else:
                    r += 1
                    c -= 1
        # Finally, return result array containing the diagonal traversal
        return res