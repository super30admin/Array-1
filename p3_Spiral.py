# 54 Spiral Matrix

# // Time Complexity : O(nxm)
# // Space Complexity : O(1)
# // Did this code successfully run on Leetcode : Yes
# // Any problem you faced while coding this : No


# // code here along with comments explaining approach

class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        n,m = len(matrix), len(matrix[0])
        r,c = 0,0
        res = []
        top, bottom = 0, n-1
        left, right = 0, m-1
        while(top <= bottom and left <= right):
            for i in range(left,right+1):  # left to right
                res.append(matrix[top][i])# #top row -
            top += 1
            if top <= bottom and left <= right: # check because top is mutated
                for i in range(top,bottom+1): # top to bottom
                    res.append(matrix[i][right]) ## right col
                right -=1
            if top <= bottom and left <= right:
                for i in range(right,left-1,-1): #right to left
                    res.append(matrix[bottom][i]) ## bottom row
                bottom -=1
            if top <= bottom and left <= right:
                for i in range(bottom,top-1,-1): #bottom to top
                    res.append(matrix[i][left]) ## left col
                left +=1

        return res