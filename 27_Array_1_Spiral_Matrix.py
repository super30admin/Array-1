#Time Complexity : O(n*m) where n is number of rows and the m is the number of cols  
#Space Complexity : O(n*m) n*m numbers we are storing in output array
#Did this code successfully run on Leetcode : Yes
#Any problem you faced while coding this :No 

#Your code here along with comments explaining your approach

class Solution(object):
    def spiralOrder(self, matrix):
        """
        :type matrix: List[List[int]]
        :rtype: List[int]
        """
        if len(matrix)==0: 
            return []
        
        top=0
        bottom=len(matrix)-1
        left=0
        right=len(matrix[0])-1
        output=[]
        
        while (top<=bottom and left<=right): 
            
            #top row appending in output array
            for i in range(left, right+1): 
                output.append(matrix[top][i])
            top+=1
            
            for i in range(top, bottom+1): 
                output.append(matrix[i][right])
            right-=1
            
            if top<=bottom: 
                for i in range(right, left-1,-1): 
                    output.append(matrix[bottom][i])
                bottom-=1
            
            if left<=right: 
                for i in range(bottom, top-1, -1): 
                    output.append(matrix[i][left])
                left+=1
            
        return output    