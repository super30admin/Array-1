# Time Complexity: O(mn), where m and n are dimensions of matrix as we go over each matrix element once
# Space Complexity: O(1), We only create a result array of dimensions mxn to store and return the result
def findDiagonalOrder(mat: list[list[int]]) -> list[int]:
        if not mat or len(mat) == 0:
            return []
        m = len(mat)
        n = len(mat[0])
        result = [0]*(m*n)
        i,r,c = 0,0,0
        dir = 1
        # dir = 1 bot to top
        # dir = -1 top to bot
        while i < m*n:
            result[i] = mat[r][c]
            if dir == 1:
                if c == n-1: # We hit the end of a column, only increment the row and flip directions
                    dir = -1
                    r+=1
                elif r == 0: # We are at the beginning row, only increment columns, and flip dirs
                    dir = -1
                    c+=1
                else:   # increment cols and decrement row otherwise
                    r-=1
                    c+=1
            else:
                if r == m-1:  # We are at the end of rows, increment only cols and flip dirs
                    dir = 1
                    c+=1
                elif c == 0:  # We are at the beginning col, only increment rows, and flip dirs
                    dir = 1
                    r+=1
                else:   # increment rows and decrement cols otherwise
                    r+=1
                    c-=1
            i+=1
        return result