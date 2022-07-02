# Time Complexity : O(mn) where m is the num of rows and n is the num of cols
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# If the direction flag is to go up, then we move the indices up and add to out retArr
# Otherwise we move the indices down
# At the end of each loop, we flip the direction and continue until we reach the end

class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        if len(mat) == 0 or len(mat[0]) == 0:
            return []

        m = len(mat)
        n = len(mat[0])
        i = 0
        row = 0
        col = 0
        # Boolean check to find the direction of traversal
        up = True
        # Return Array of size mn
        retArr = []
        # Run while we are within the bounds of the matrix
        while row < m and col < n:
            # If the direction is to go up
            if up:
                while row > 0 and col < (n - 1):
                    # Add to the array
                    retArr.append(mat[row][col])
                    row -= 1
                    col += 1
                retArr.append(mat[row][col])
                # Adjust row and col if within range
                if col == (n - 1):
                    row += 1
                else:
                    col += 1
            else:
                while col > 0 and row < (m - 1):
                    retArr.append(mat[row][col])
                    row += 1
                    col -= 1
                retArr.append(mat[row][col])
                if row == (m - 1):
                    col += 1
                else:
                    row += 1
            # Flip direction after loop
            up = not up
        return retArr
