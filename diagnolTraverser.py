# Time Complexity : O(m * n)
# Space Complexity : O(1) 
# Did this code successfully run on Leetcode : Yes
# Three line explanation of solution in plain english:
# 1. Traverse the matrix diagonally in a zigzag pattern using row and column pointers.
# 2. Use a direction flag to switch between upward-right and downward-left movement.
# 3. Change direction when reaching out of bounds and continue adding elements into a result array.


class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        if len(mat) == 0:
            return []

        rows = len(mat)
        columns = len(mat[0])
        res_arr = [None] * (rows * columns)

        index = 0  # Position in output array
        r = 0  # Start at top-left corner
        c = 0
        direc = 1  # 1 means up-right, 0 means down-left

        while index < (rows * columns):
            res_arr[index] = mat[r][c]

            if direc == 1:  # Moving up-right
                if c == columns - 1:  # Hit right wall
                    r += 1
                    direc = 0  # Switch to down-left
                elif r == 0:  # Hit top wall
                    c += 1
                    direc = 0
                else:
                    r -= 1
                    c += 1

            else:  # Moving down-left
                if r == rows - 1:  # Hit bottom wall
                    c += 1
                    direc = 1  # Switch to up-right
                elif c == 0:  # Hit left wall
                    r += 1
                    direc = 1
                else:
                    r += 1
                    c -= 1

            index += 1

        return res_arr