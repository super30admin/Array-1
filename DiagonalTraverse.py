# Time Complexity : O(m*n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes

class Solution(object):
    def findDiagonalOrder(self, mat):
        if len(mat) == 0:
            return []
        diagonal_arr = []
        m = len(mat)
        n = len(mat[0])
        dir = 1 # 1: bottom to top  -1: top to bottom
        index = 0
        col = 0
        row = 0
        while(index < m*n):
            diagonal_arr.append(mat[row][col])
            index = index + 1
            #bottom to top
            if dir == 1:
                #Reached last column, move down and switch direction
                if col == n-1:
                    dir = -1
                    row = row + 1
                #Reached top row, move right and switch direction
                elif row == 0:
                    dir = -1
                    col = col + 1
                #Move diagonally bottom to top
                else:
                    row = row - 1
                    col = col + 1
            #top to bottom
            else:
                #Reached bottom row, move right and switch direction
                if row == m-1:
                    dir = 1
                    col = col + 1
                #Reached first column, move down and switch direction
                elif col == 0:
                    dir = 1
                    row = row + 1
                #Move diagonally top to bottom
                else:
                    row = row + 1
                    col = col - 1
        return diagonal_arr
        
obj = Solution()
sol1 = obj.findDiagonalOrder([[1,2,3],[4,5,6],[7,8,9]])
print(sol1)
sol2 = obj.findDiagonalOrder([[1,2],[3,4]])
print(sol2)