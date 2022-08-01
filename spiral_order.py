# Time Complexity : O(m*n) where m is number of rows of matrix and n is no of columns, we are traversing through both
#Space Complexity : O(1)   - we didn't use any extra space, and we don't count the output array as extra space
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No 

class Solution:
    def spiralOrder(self, matrix):
        m = len(matrix) #rows
        n = len(matrix[0]) # Columns
        left = 0 #left counter
        right = n-1 #right counter
        top = 0 #top counter
        bottom = m-1 #bottom counter
        
        result = []
        
        while(top <= bottom and left <= right):
            # traversing top row
            for j in range(left,right+1):
                result.append(matrix[top][j]) # First we move left to right in the top row and then we increase top by1
            top += 1
            
            # traversing Right column
            if(top <= bottom and left <= right): # When changing values in while loop base condition, we should keep checking the condition again
                for i in range(top,bottom+1): 
                    result.append(matrix[i][right]) # Now, we move top to bottom in the right column and decrease right by 1
                right -= 1
            
            # traversing Bottom row
            if(top <= bottom and left <= right):
                for j in range(right, left-1,-1):
                    result.append(matrix[bottom][j]) # Next we move from right to left in the bottom row and finally decrease the bottom row flag by 1
                bottom -= 1
            
            # traversing Left column
            if(top <= bottom and left <= right):
                for i in range(bottom, top-1,-1):
                    result.append(matrix[i][left]) # Finally we move bottom to top in the left column and finally increase left by 1
                left += 1
        return result