// Time Complexity :O(m*n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :Yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach

//Declare a direction pointer to change the direction of traverse and loop through the matrix accorinng to the direction.

class Solution(object):
    def findDiagonalOrder(self, matrix):
        if(len(matrix)==0):
            return []
        dir = 1
        rows = len(matrix)
        cols = len(matrix[0])
        r = 0
        c = 0
        i = 0
        result = [None] * (rows * cols)
        while (i < rows * cols):
            result[i] = matrix[r][c]
            if (dir == 1):
                if (c == cols - 1):
                    r += 1
                    dir = -1
                elif (r == 0):
                    c += 1
                    dir-=1
                else:
                    r -= 1
                    c += 1
            else:

                if (r == rows - 1):
                    c += 1
                    dir=1
                elif (c == 0):
                    dir = 1
                    r += 1
                
                    dir = 1
                else:
                    c -= 1
                    r += 1
            i += 1
        return result
