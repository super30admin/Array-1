"""
https://leetcode.com/problems/diagonal-traverse/
 
Time Complexity : O(m*n) where m is the number of rows and n is the number of cols in an input matrix
Space Complexity : O(1) No Auxillary data structure is used

Did this code successfully run on Leetcode : Yes

Three line explanation of solution in plain english:
1. Inorder to get the expected result we need to traverse in two directions up and down
2. While traversing up, we have to col++ and row-- and need to handle two boundary conditions top and right and change the direction 
3. Similarly, while traversing down, we have to col-- and row++ and need to handle two boundary conditions bottom amd left and change the direction
"""


class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        # Time Complexity: m*n where m is the number of rows and n is the number of columns of mat
        # Space Complexity: O(1) as no Auxillary data structure is used
        if (len(mat) == 0):
            return []

        m = len(mat)  # rows
        n = len(mat[0])  # cols
        row = 0
        col = 0
        direction = 1
        result = []
        result.append(mat[0][0])

        while (len(result) != m*n):
            if direction == 1:
                # up
                if col == n - 1:
                    row += 1
                    direction = -1
                elif row == 0:
                    col += 1
                    direction = -1
                else:
                    row -= 1
                    col += 1
                result.append(mat[row][col])
            elif direction == -1:
                # down
                if row == m - 1:
                    col += 1
                    direction = 1
                elif col == 0:
                    row += 1
                    direction = 1
                else:
                    row += 1
                    col -= 1
                result.append(mat[row][col])

        return result
