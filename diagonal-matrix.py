# Time Complexity : O(m*n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : yes
# Three line explanation of solution in plain english : Index out of range can be there if not given attention

# Your code here along with comments explaining your approach
"""
track 2 direction.  1 for moving upwards and 1 downwards. if direction is 1 row will decrease and column will increase. if direction is -1 row will increase 
and column will decrease. 
"""



class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:

        row = 0
        col = 0
        index = 0
        m = len(mat)
        n = len(mat[0])

        dir = 1
        dp = [0 for i in range(m*n)]
        while index < m * n:
            dp[index] = mat[row][col]
            index += 1
            if dir == 1:
                if col == n-1:
                    dir = -1
                    row += 1

                elif row == 0:
                    dir = -1
                    col += 1


                else:
                    row -= 1
                    col += 1



            else:
                if row == m - 1:
                    dir = 1
                    col += 1


                elif col == 0:
                    dir = 1
                    row += 1
                else:
                    row += 1
                    col -= 1
        return dp
