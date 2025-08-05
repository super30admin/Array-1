#Time Complexity : O(m*n)
#Space Complexity : O(1)
#Any problem you faced while coding this : none

#Your code here along with comments explaining your approach
class Solution(object):
    def spiralOrder(self, matrix):
        """
        :type matrix: List[List[int]]
        :rtype: List[int]
        """
        top=0
        bottom=len(matrix)

        left=0
        right=len(matrix[0])
        res=[]

        while top<bottom and left<right:
            for i in range(left,right):  # traverse from left to right
                res.append(matrix[top][i])
            top+=1

            if top<bottom and left<right:   # to check that base condition is still true
                for i in range(top,bottom):  # traverse from top to bottom
                    res.append(matrix[i][right-1])
                right-=1

            if top<bottom and left<right:     #traverse from right to left
                for i in range(right-1,left-1,-1): # to check that base condition is still true
                    res.append(matrix[bottom-1][i])
                bottom-=1
            
            if top<bottom and left<right:      # traverse from bottom to top 
                for i in range(bottom-1,top-1,-1): # to check that base condition is still true
                    res.append(matrix[i][left])
                left+=1
        
        return res