# Spiral Matrix

# Time Complexity : O(N) where N is no. of elements
# Space Complexity : O(1) as the expected output is same as the actual outpuut ie list
# Did this code successfully run on Leetcode : Yes, Runtime: 12 ms and Memory Usage: 13.3 MB
# Any problem you faced while coding this : Initially Yes, After Class No
# Your code here along with comments explaining your approach
# Approach
"""
The approach to solve this problem is to identify the pattern. Here the upward movement
and downward movement are stored in variable direction. The cases are established accordiingly
The four pointers top,bottom,left and right which will traverse in left to right, top to bottom,
right to left, bottom to top and left to right.

"""
class Solution(object):
    def spiralOrder(self, matrix):
        """
        :type matrix: List[List[int]]
        :rtype: List[int]
        """
        top,bottom,left,right=0,len(matrix),0,len(matrix[0]) # Variables to traverse
        result=[]
        while top<bottom and left<right: 
            for i in range(left,right):  # Cases
                result.append(matrix[top][i])
            top+=1
            for i in range(top,bottom):
                result.append(matrix[i][right-1])
            right-=1
            if top<bottom:
                for i in range(right-1,left-1,-1):
                    result.append(matrix[bottom-1][i])
                bottom-=1
            if left<right:
                for i in range(bottom-1,top-1,-1):
                    result.append(matrix[i][left])
                left+=1
        return result
        

    
    