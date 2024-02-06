#
# @lc app=leetcode id=54 lang=python3
#
# [54] Spiral Matrix
#

# @lc code=start

'''
Time Complexity - O(m*n). We are traversing every element in the matrix
Space Complexity - O(1). We are storing the result in a 1D array

This code works on Leetcode.
'''
class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        result=[]
        top, left = 0, 0
        right, bottom = len(matrix[0]), len(matrix) #initialize left,right, top, bottom
        while top < bottom and left < right: #base condition
            for i in range(left, right): #traverse right
                result.append(matrix[top][i])
            top+=1 #update top to shrink the circle

            for i in range(top,bottom):#traverse down
                result.append(matrix[i][right-1])
            right-= 1 #upadte the right pointer to shrink the circle

            if not (top < bottom and left < right): # we modified the base case pointers we need to check if the base condition is still valid
                break

            for i in range(right-1, left-1, -1): #traverse left
                result.append(matrix[bottom-1][i])
            bottom-=1 #update the bottom pointer shrink the circle
 
            for i in range(bottom-1, top-1, -1): #traverse up
                result.append(matrix[i][left])
            left+=1 #update the left pointer shrink the circle
        return result
        
# @lc code=end

