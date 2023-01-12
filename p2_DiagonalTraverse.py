# 498. Diagonal Traverse

# // Time Complexity : O(nxm)
# // Space Complexity : O(1)
# // Did this code successfully run on Leetcode : Yes
# // Any problem you faced while coding this : No


# // code here along with comments explaining approach

# using direction flag

class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        n = len(mat) # rows
        m = len(mat[0]) # col
        r,c = 0,0
        dir_flag = True # Direction flag true for up false for down
        res = []
        for i in range(n*m): # O(nxm)
            res.append(mat[r][c])
            if dir_flag: # up
                if c == m-1: # top right corner
                    dir_flag = False
                    r = r+1
                elif r == 0:# and c < m-1: # up
                    dir_flag = False
                    c = c+1
                else:
                    r = r -1
                    c = c +1
            else:  # down
                if r == n-1:
                    dir_flag = True
                    c = c + 1
                elif c == 0:
                    dir_flag = True
                    r = r+1
                
                else:
                    r = r + 1
                    c = c - 1
        return res  