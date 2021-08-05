"""
Time Complexity : O(m*n) where m is the number of rows and n is number of columns
Space Complexity : O(1)
Did this code successfully run on Leetcode : Yes
"""
class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        m = len(mat)
        n = len(mat[0])
        result = []
        i,r, c = 0, 0, 0
        direc = 1
        # Runnning in two directions and incrementing decrementing
        # the row & column according to the direction of traversal
        while(i < m*n):
            result.append(mat[r][c])
            if direc == 1:
                # If my column incremented greater than max available
                if c == n - 1:
                    direc = -1
                    r += 1
                elif r == 0:
                    direc = -1
                    c += 1
                else:
                    r -= 1
                    c += 1
            else:
                # If my row incremented greater than max available
                if r == m - 1:
                    direc = 1
                    c += 1
                elif c == 0:
                    direc = 1
                    r += 1
                else:
                    r += 1
                    c -= 1
            i += 1
        return result