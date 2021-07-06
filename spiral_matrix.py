#Time Complexity :  O(mn)
#Space Complexity : O(1)
#Did this code successfully run on Leetcode : yes
#Any problem you faced while coding this : no

class Solution(object):
    def spiralOrder(self, matrix):
        """
        :type matrix: List[List[int]]
        :rtype: List[int]
        """
        
        rows = len(matrix)
        cols = len(matrix[0])
        result = []
        top = 0
        bottom = rows-1
        left =0
        right = cols-1
        
        while((top<=bottom) and (left <= right)):
            
            #left to right
            for i in range(left,right+1,1): 
                result.append(matrix[top][i])
            top=top+1
                
            #top to bottom
            for i in range(top,bottom+1,1):
                result.append(matrix[i][right])
            right = right-1
            
            #right to left
            
            if (top<=bottom):
                for i in range(right,left-1,-1):
                    result.append(matrix[bottom][i])
                bottom = bottom-1
            
            #bottom to top
            
            if (left <=right):
                for i in range(bottom,top-1,-1):
                    result.append(matrix[i][left])
                left = left+1
                
        return result