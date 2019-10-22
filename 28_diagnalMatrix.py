# time - O(M*N), space - O(1) without considering output array.
# accepted in leetcode
# We have to traverse the matrix in diagnal format, so there are 2 main conditions to take:
#1. Change the direction of array once we reach the end of diagonal
#2. Everytime we are hitting the end of diagonal we have to move to the side(either right or left or top or bottom)
#  which are taken care in 4 conditions in below code.
class Solution:
    def findDiagonalOrder(self, matrix):
        result = []
        if len(matrix) == 0 or matrix is None: return result # edge case
        m = len(matrix) # no. of rows
        n= len(matrix[0]) # no. of columns
        r = c = i = 0
        dir = 1 # direction
        while i < m*n: # iterate whole array
            result.append(matrix[r][c]) # add value to an array(final result)
            if dir == 1: # positive direction
                if c == n-1: # reached last column
                    r+=1 # increment row
                    dir = -1 # change direction
                elif r == 0: # reached first row
                    c+=1 # increment column
                    dir =-1
                else:
                    r-=1
                    c+=1
            else: # negative direction
                if r == m-1: # reached last row
                    c+=1 # increment column
                    dir = 1 # change direction
                elif c == 0: # reached first column
                    r+=1 # increment row
                    dir = 1
                else:
                    c = c-1
                    r = r+1
            i+=1
        return result

p = Solution()
print(p.findDiagonalOrder([[1,2,3],[4,5,6],[7,8,9]]))