# Time Complexity : O(m * n)   # We touch every element exactly once
# Space Complexity : O(1)      # Ignoring the result array, only a few variables
# Did this code successfully run on Leetcode : Yes
# Approach:
# 1. Start at (0,0) and simulate the traversal across diagonals.  
# 2. If moving up-right, stop when you hit top row or last column, then switch to down-left.  
# 3. If moving down-left, stop when you hit bottom row or first column, then switch to up-right.
class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        m, n = len(mat), len(mat[0])        # m = rows, n = columns
        result = [0] * (m * n)              # result list of size m*n
        r = c = 0                           # starting point (row=0, col=0)
        dir = True                          # True = up-right, False = down-left

        for i in range(m * n):
            # Place current element into result
            result[i] = mat[r][c]

            if dir:  # Moving up-right
                if c == n - 1:              # If at last column → can't go right
                    r += 1                  # Move down instead
                    dir = False             # Flip direction to down-left
                elif r == 0:                # If at top row → can't go up
                    c += 1                  # Move right instead
                    dir = False             # Flip direction to down-left
                else:                       # Normal up-right step
                    r -= 1                  # Go up
                    c += 1                  # Go right
            else:   # Moving down-left
                if r == m - 1:              # If at last row → can't go down
                    c += 1                  # Move right instead
                    dir = True              # Flip direction to up-right
                elif c == 0:                # If at first column → can't go left
                    r += 1                  # Move down instead
                    dir = True              # Flip direction to up-right
                else:                       # Normal down-left step
                    r += 1                  # Go down
                    c -= 1                  # Go left

        return result
