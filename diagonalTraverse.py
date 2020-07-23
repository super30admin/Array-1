# Leetcode 498. Diagonal Traverse

# Time Complexity :  O(m*n) where m,n are the rows and columns of the matrix

# Space Complexity : O(1) if result array is not considered else O(m*n)
# where m,n are the rows and columns of the matrix

# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

# Approach: When we reach boundaries of the matrix change the row and column values accordingly to move
# along the diagonals and change the direction. else change row and col values to move in the same direction.

# Your code here along with comments explaining your approach

class Solution:
    def findDiagonalOrder(self, matrix: List[List[int]]) -> List[int]:
        if not matrix or len(matrix) == 0:
            return []

        m = len(matrix)
        n = len(matrix[0])
        result = [None]*(m*n)
        # row & column pointers
        row = 0
        col = 0
        # result list index
        i = 0
        # traversal direction
        direc = 1

        while(i < m*n):
            print(row)
            result[i] = matrix[row][col]
            # if moving upwards
            if direc == 1:
                # if at Last column then go to next row and change direction
                if col == n-1:
                    row += 1
                    direc = -1
                # if at first row then go to next column and change direction
                elif row == 0:
                    col += 1
                    direc = -1
                # if at any other place than the boundaries decresase row and increase col to move up
                else:
                    row -= 1
                    col += 1

            # if moving downwards
            else:
                if row == m-1:
                    col += 1
                    direc = 1
                elif col == 0:
                    row += 1
                    direc = 1
                else:
                    row += 1
                    col -= 1
            i += 1
        return result
