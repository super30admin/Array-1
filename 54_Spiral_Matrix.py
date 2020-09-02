# Leetcode problem link :https://leetcode.com/problems/spiral-matrix/
# Time Complexity : O(m * n)
#  Space Complexity : O(1)
#  Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

# Your code here along with comments explaining your approach
'''
        Solution approach => Maintain 4 pointers for the boundary conditions as keep spiraling down into the matrix, we keep reducing the boundaries from all 4 directions
        As the top and bottom pointers cross or left and right cross, we stop adding
 '''
class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        if not matrix or len(matrix) == 0 or len(matrix[0]) == 0:
            return []
        m = len(matrix[0])
        n = len(matrix)
        top,bottom = 0,n
        left,right = 0,m
        output = []
        
        while(top <= bottom -1 and left <= right -1):
            # top row => left to right
            for x in range(left,right):
                output.append(matrix[top][x])
            top += 1
            
            # right col => top to bottom
            for x in range(top,bottom):
                output.append(matrix[x][right-1])
            right -= 1
            
            # this condition is required because after the first two loops we need to check again for edge cases
            # otherwise extra value is appended even when top crosses bottom but left is still less than right
            if(top <= bottom - 1):
            # bottom row => right to left
                for x in range(right-1,left-1,-1):
                    output.append(matrix[bottom-1][x])
                bottom -= 1
                
            # this condition is required because after the first two loops we need to check again for edge cases
            # otherwise extra value is added when top is less than bottom but right has crossed left
            if (left <= right - 1):
            # left col => bottom to top
                for x in range(bottom-1,top-1,-1):
                    output.append(matrix[x][left])
                left += 1
                
        return output