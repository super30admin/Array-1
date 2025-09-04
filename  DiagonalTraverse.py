# Time Complexity : O(n*m)
# Space Complexity : O(1)  
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


# Your code here along with comments explaining your approach:
# I am keeping a track of the current row and column while traversing the matrix diagonally. 
# I will append the elements to the result list based on the current direction of traversal.
# I check the boundaries with the help of the rows and columns changing as I traverse. And return the result in the end

from typing import List

class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        n = len(mat)
        m = len(mat[0])
        res = [0]*(n*m)
        row = 0
        col = 0
        directions = True
        for i in range(n*m):
            res[i] = mat[row][col]
            if directions:
                if row == 0 and col != m -1:
                    col += 1
                    directions = False
                elif col == m-1:
                    row += 1
                    directions = False
                else:
                    row -= 1
                    col += 1
            else:
                if col == 0 and row != n -1:
                    row += 1
                    directions = True
                elif row == n-1:
                    col += 1
                    directions = True
                else:
                    row += 1
                    col -= 1
                    
        return res
        