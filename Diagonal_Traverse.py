
# Time Complexity : O(m*n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Three line explanation of solution in plain english

# Your code here along with comments explaining your approach
#Taking direction 1 and -1 to check up and down so if dir is up we will check boundary conditions if col goes to right and row goes to top
#If dir is down we will check if col goes to left and row goes to bottom

class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        if not mat:
            return None
        m = len(mat)
        n = len(mat[0])
        row = 0
        col = 0
        dir = 1
        result = []
        while row < len(mat) and col < len(mat[0]):
            if dir == 1:
                result.append(mat[row][col])
                if col == n-1:
                    row += 1
                    dir = -1
                elif row == 0:
                    col += 1
                    dir = -1
                else:
                    row -= 1
                    col += 1
            else:
                result.append(mat[row][col])
                if row == m-1:
                    col += 1
                    dir = 1
                elif col == 0:
                    row += 1
                    dir = 1
                else:
                    row += 1
                    col -= 1
        return result 
