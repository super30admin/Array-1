'''
In this problem, I solved it using a direction flag, which represents that we are moving towards up when its true and down when false.
By iterativly going through the matrix:
For upward direction iteration: After reaching the top most row, row becomes zero, so I incremented col and direction is changed
                                When we reach last col, it goes out of bounds, row is incremented and  direction is changed.
For downward direction iteration: After reaching last first col, col becomes zero, so I incremented row and direction is changed
                                  When we reach last row, it goes out of bounds, col is incremented and direction is changed.
'''
class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        m, n = len(mat), len(mat[0])

        result = [0]*(m*n)
        row, col = 0, 0
        direction = True # upwards direction
        for i in range(m*n):

            result[i] = mat[row][col]
            if direction:
                # Upwards
                if row == 0 and col != n-1:
                    direction = False
                    col += 1
                elif col == n-1:
                    direction = False
                    row += 1
                else:
                    row -= 1
                    col += 1
            else:
                # down
                if col == 0 and row != m-1:
                    direction = True
                    row += 1
                elif row == m-1:
                    col += 1
                    direction = True
                else:
                    row += 1
                    col -= 1
        return result
'''
Time Complexity: O(m*n)
since we are iterating on the matrix of length m*n
Space Complexity: O(1)
We did not take any extra space apart from variables
'''