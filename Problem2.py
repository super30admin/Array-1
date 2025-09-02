"""
TC: O(M*N) {We iterate through all the elements of the matrix}
SC: O(1)  {We dont use any extra space in our algorithm}

Approach:

The approach starts with defining the boundaries for our diagonal traversal. Such as row == 0, col ==0, row == N-1, col == M-1.
There are also two directions that we follow; First we start with the first element and the direction for that is upwards. And
at every border/boundary, we have to switch the direction. The traversal pattern is exactly the mirror image between the 
direction upwards and downwards.

The problem ran successfully on Leetcode.
"""

from typing import List

class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        direction_up = True
        n,m = len(mat), len(mat[0])
        row, col = 0,0
        res = [0]*(m*n)
        for i in range(m*n):
            res[i] = mat[row][col]
            if direction_up:
                if col == m - 1:
                    row += 1
                    direction_up = False
                elif row == 0:
                    col += 1
                    direction_up = False
                else:
                    row -= 1
                    col += 1
            else:
                if row == n - 1:
                    col += 1
                    direction_up = True
                elif col == 0:
                    row += 1
                    direction_up = True
                else:
                    col -= 1
                    row += 1
                    
        return res