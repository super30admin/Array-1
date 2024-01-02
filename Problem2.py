'''

Time Complexity : O(n)
Space Complexity : O(n)
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : No issues faced

Your code here along with comments explaining your approach

I traverse thru the 2D matrix and shift the direction at the edge of the matrix. A variable named 'up' is used which is either
true or false depending whether I'm traversing thru the array diagonally upwards or downwards

'''

class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        row = len(mat)
        col = len(mat[0])
        res = []

        i = j = 0
        up = True

        while i < row and j < col:
            res.append(mat[i][j])
            if up is True:
                if j == col - 1:
                    i += 1
                    up = False
                    continue
                if i == 0:
                    j += 1
                    up = False
                else:
                    j += 1
                    i -= 1
                    print(i,j)
            else:
                if i == row - 1:
                    j += 1
                    up = True
                    continue
                if j == 0:
                    i += 1
                    up = True
                else:
                    j -= 1
                    i += 1

        return res