# Time Complexity : Add - O(mn)
# Space Complexity :O(1)
# Did this code successfully run on Leetcode : Yes.

# Any problem you faced while coding this : No

'''
1. I have used set of four pointers namely top, bottom, left and right to squeesh the items 
2. First the outer spiral layer is catered for, and in the process the position pointers are adjusted to
   traverse the inner layer
'''


class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        
    
        if matrix == [] or len(matrix) < 1:
            return
        
        rows = len(matrix)
        cols = len(matrix[0])
        
        top = 0
        bottom = rows - 1
        left = 0
        right = cols - 1
        
        nums = []
        
        while (len(nums) < (rows*cols)):
           
            if top <= bottom and left <= right:
                for i in range(left, right+1):
                    nums.append(matrix[top][i])
                top += 1

            if top <= bottom and left <= right:
                for i in range(top, bottom+1):
                    nums.append(matrix[i][right])
                right -= 1

            if top <= bottom and left <= right:
                for i in range(right, left-1, -1):
                    nums.append(matrix[bottom][i])
                bottom -= 1

            if top <= bottom and left <= right:
                for i in range(bottom, top-1,-1):
                    nums.append(matrix[i][left])
                                
                left += 1
                        
        return nums
        
        