# https://leetcode.com/problems/diagonal-traverse/description/

# In this program to move alternately up-right and down-left defined the direction flag. Starting at the top left it moves diagonally untill the last column and last row. And it stores the element in the result array.
# Time Complexity- O(m * n) Space Complexity- O(1)

class Solution:
    def findDiagonalOrder(self, mat: list[list[int]]) -> list[int]:
        # find the number of rows
        m = len(mat)
        # find the length of columns
        n = len(mat[0])
        # defining the array to store the result  
        result = [0] * (m * n)
        # starting from the top right corner
        r = c = 0
        # flag to show the direction to move
        dir = True
        # iterate over the matrix
        for i in range(m * n):
            # store the current matrix value into the result
            result[i] = mat[r][c]

            # if direction is true move up-right
            if dir:
                # checking whether we are at the last column
                if c == n-1:
                    # move to next row
                    r += 1
                    # change the flag(as we are going down) 
                    dir = False
                # checking whether we are at the top row(can not go up)
                elif r == 0:
                    # move to next column
                    c += 1
                    # change the flag
                    dir = False
                # move diagonally
                else:
                    r -= 1
                    c += 1
            else:
                # checking whether we are at the last row(bottom)
                if r == m -1:
                    # move to the next column
                    c += 1
                    # change the flag(as we are going up)
                    dir = True
                # checking whether we are the edge column(can not go left)
                elif c == 0:
                    # move to the down
                    r += 1
                    # change the flag
                    dir = True
                # move diagonally
                else:
                    r += 1
                    c -= 1
        return result


solution = Solution()
print(solution.findDiagonalOrder([[1,2,3],[4,5,6],[7,8,9]
]))
print(solution.findDiagonalOrder([[1,2],[3,4]]))