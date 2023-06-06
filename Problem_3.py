"""
Problem : 3

Time Complexity : O()
Space Complexity : O()

Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : No

creating 4 pointers namely top,bottom,left and right, at all 4 sides of the matrix
traversing each side of the matrix one by one, and incrementing and decrementing 
the respective pointers accordingly and storing the elements in the result array

"""

# Spiral Matrix

class Solution(object):
    def spiralOrder(self, matrix):
        m=len(matrix) #row
        n=len(matrix[0]) #column

        top=0
        bottom=m-1
        left=0
        right=n-1
        idx=0
        res=[]

        while top<=bottom and left<=right:
            # top

            for i in range(left,right+1):
                res.append(matrix[top][i])
            top+=1

            # right

            if top<=bottom and left<=right:
                for i in range(top,bottom+1):
                    res.append(matrix[i][right])

                right-=1

            # bottom
            
            if top<=bottom and left<=right:
                for i in range(right,left-1,-1):
                    res.append(matrix[bottom][i])

                bottom-=1

            # left

            if top<=bottom and left<=right:
                for i in range(bottom,top-1,-1):
                    res.append(matrix[i][left])

                left+=1
        return res