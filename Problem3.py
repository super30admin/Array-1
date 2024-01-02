'''

Time Complexity : O(n)
Space Complexity : O(n)
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : No issues faced

Your code here along with comments explaining your approach

I traverse thru the 2D matrix and shift the direction at the edge of the matrix bjust like the previous question. But I'm
four variables named up,down,left and navigate spirally thru the 2D matrix
'''

class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        row = len(matrix)
        col = len(matrix[0])

        i = j = 0
        top = left = -1
        bottom = row
        right = col
        dir = "right"
        res = []

        while i > top and i < bottom and j > left and j < right:

            res.append(matrix[i][j])
            print(i,j)
            print(left,right,top,bottom)

            if dir == "right":
                if j == right-1:
                    dir = "down"
                    top += 1
                    i += 1
                else:
                    j += 1

            elif dir == "down":
                if i == bottom-1:
                    dir = "left"
                    right -= 1
                    j -= 1
                else:
                    i += 1

            elif dir == "left":
                if j == left + 1:
                    dir = "up"
                    bottom -= 1
                    i -= 1
                else:
                    j -= 1

            else:
                if i == top + 1:
                    dir = "right"
                    left += 1
                    j += 1
                else:
                    i -= 1

        return res