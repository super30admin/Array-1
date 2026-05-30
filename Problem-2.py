# Time Complexity : O(m * n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Three line explanation of solution in plain english:
# 1. We can use two pointers i and j to traverse the diagonals of the matrix one for row and one for column.
# 2. We can use a boolean variable to keep track of the direction of traversal (up or down).
# 3. We can append the elements to the result list based on the current direction and adjust the pointers to go in diagonal directions and until we have traversed all elements in the matrix.
# Your code here along with comments explaining your approach
class Solution(object):
    def findDiagonalOrder(self, mat):
        if not mat or not mat[0]:
            return []

        m, n = len(mat), len(mat[0])
        res = []

        i = j = 0
        up = True 
# we will traverse the matrix until we have traversed all the elements in the matrix
        for k in range(m * n):
            res.append(mat[i][j])
            # setting directions for pointers based on which direction to traverse first we start with up direction 
            if up:
                if j == n - 1:
                    i += 1
                    up = False
                elif i == 0:
                    j += 1
                    up = False
                else:
                    i -= 1
                    j += 1
            # if we are traversing in down direction then we will check for out of bound condition for row and column
            else:
                if i == m - 1:
                    j += 1
                    up = True
                elif j == 0:
                    i += 1
                    up = True
                else:
                    i += 1
                    j -= 1

        return res
