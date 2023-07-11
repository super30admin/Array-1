# // Time Complexity : O(mxn), m is the number of rows and n is the numebr of cols
# // Space Complexity : O(1)
# // Did this code successfully run on Leetcode : Yes
# // Three line explanation of solution in plain english
# First, we go from left to right in the top most row, but we don't want to go over this row again, so we can use a "top"" variable for this.
# Secondly, we go from current top (to not repeat the top-right element) to bottom (another variable to avoid repeating bottom row). Then, decrement "right" variable to avoid repeating right most column.
# Thirdly, we go from current right to left. Then, decrement "bottom" variable to avoid repeating bottom most row.
# Lastly, we go from current bottom to top. Then, increment "left" variable to avoid repeating left most column.

# // Your code here along with comments explaining your approach
class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        res=[]
        row=len(matrix)
        col=len(matrix[0])
        top=0
        bottom=row-1
        left=0
        right=col-1

        while top<=bottom and left<=right: #ALWAYS check if base condition of while loop is good EVERYTIME the variables of the base conditions are altered.

            for i in range(left,right+1):
                res.append(matrix[top][i])
            top+=1

            #if top<=bottom and left<=right: - not needed here, since in the next for loop takes care of top and bottom and left,right haven't been changed yet
            for i in range(top,bottom+1):
                res.append(matrix[i][right])
            right-=1

            #if top<=bottom and left<=right: left<=right - not needed here, since it is checked in the for loop below.
            if top<=bottom: 
                for i in reversed(range(left,right+1)):
                    res.append(matrix[bottom][i])
                bottom-=1
            #if top<=bottom and left<=right: top<=bottom - not needed here, since it is checked in the for loop below.
            if left<=right:
                for i in reversed(range(top,bottom+1)):
                    res.append(matrix[i][left])
                left+=1
            #if top<=bottom and left<=right: - not needed here, since while condition will take care in the before the nxt iteration
        return res
