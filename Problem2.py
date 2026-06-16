# Time Complexity: O(m*n), we visit every element in the matrix exactly once
# Space Complexity: O(1), only using a few variables, result array doesn't count as extra space
#Did this code successfully run on Leetcode :Yes
# We use a direction flag (True = UP-RIGHT, False = DOWN-LEFT) to track which way we are currently moving
# In each iteration we first collect the current element, then figure out the next position based on direction
# When we hit a wall, we step sideways (down or right) instead of continuing and flip the direction

class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        m = len(mat)                        # number of rows
        n = len(mat[0])                     # number of columns
        result = [0] * (m * n)              # output array with m*n slots initialized to 0
        row = column = 0                    # start at top-left corner (row=0, col=0)
        direction = True                    # True = going UP-RIGHT, False = going DOWN-LEFT

        for i in range(m * n):              # loop once for every element in the matrix
            result[i] = mat[row][column]    # collect current element into result

            if direction:                   # currently going UP-RIGHT 
                if column == n - 1:         # hit the RIGHT wall, can't go right
                    row += 1                # step DOWN instead
                    direction = False       # flip to DOWN-LEFT
                elif row == 0:              # hit the TOP wall, can't go up
                    column += 1             # step RIGHT instead
                    direction = False       # flip to DOWN-LEFT
                else:                       # no wall hit, free to move UP-RIGHT
                    column += 1             # move right
                    row -= 1                # move up

            else:                          # currently going DOWN-LEFT 
                if row == m - 1:           # hit the BOTTOM wall, can't go down
                    column += 1            # step RIGHT instead
                    direction = True       # flip to UP-RIGHT
                elif column == 0:          # hit the LEFT wall, can't go left
                    row += 1               # step DOWN instead
                    direction = True       # flip to UP-RIGHT
                else:                      # no wall hit, free to move DOWN-LEFT
                    column -= 1            # move left
                    row += 1               # move down

        return result                      