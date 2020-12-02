# Diagonal Traverse

# Time Complexity : O(M*N) where M=rows and N=columns
# Space Complexity : O(1) as the expected output is same as the actual outpuut ie list
# Did this code successfully run on Leetcode : Yes, Runtime: 152 ms and Memory Usage: 16.4 MB
# Any problem you faced while coding this : Initially Yes, After Class No
# Your code here along with comments explaining your approach
# Approach
"""
The approach to solve this problem is to identify the pattern. Here the upward movement
and downward movement are stored in variable direction. The cases are established accordiingly
If direction is upward direction=1 i will decrement and j will increment. For downward it will be
reverse. 

"""
class Solution(object):
    def findDiagonalOrder(self, matrix):
        """
        :type matrix: List[List[int]]
        :rtype: List[int]
        """
        if(matrix==None or len(matrix)==0): # Edge Cases
            return [] 
        m=len(matrix)  
        n=len(matrix[0])
        result=[] 
        i, j = 0,0
        index = 0 
        direction=1
        while index<m*n:
            result.append(matrix[i][j]) # A new matrix with length m*n
            if(direction==1): # moving upwards
                if(j==n-1): 
                    direction=-1
                    i=i+1
                elif(i==0):
                    direction=-1
                    j=j+1
                else:
                    i=i-1
                    j=j+1
            else:   # Moving downwards
                if(i==m-1):
                    direction=1
                    j=j+1
                elif(j==0):
                    direction=1
                    i=i+1
                else:
                    i=i+1
                    j=j-1
            index=index+1
        return result