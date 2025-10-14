"""
Time Complexity :O(n*m)
Space Complexity : O(1)
Did this code successfully run on Leetcode :yes


Approach
we are suing 4 variables top bottom right and left to keep track of which element have been traversed 
 we traversing from the top, right, bottom, left
 we keep doing this until we have traversed all the elements
 
"""


class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        m = len(matrix)
        n = len(matrix[0])
        top = 0
        bottom = m - 1
        right = n - 1
        left = 0
        result = list()
        while top <= bottom and left <= right:
            #top col
            if top <= bottom and left <= right:
                for j in range(left,right+1):
                    result.append(matrix[top][j])
                
                top += 1
                
            #right col
            if top <= bottom and left <= right:
                for i in range(top,bottom+1):
                    result.append(matrix[i][right])
                
                right -= 1

            #bottom col
            if top <= bottom and left <= right:
                for j in range(right,left-1,-1):
                    result.append(matrix[bottom][j])
                
                bottom -= 1

            #left col
            if top <= bottom and left <= right:
                for i in range(bottom,top-1,-1):
                    result.append(matrix[i][left])
                
                left += 1
        return result